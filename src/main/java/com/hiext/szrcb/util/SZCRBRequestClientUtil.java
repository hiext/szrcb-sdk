package com.hiext.szrcb.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.hibernate.validator.internal.util.StringHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hiext.szrcb.request.SZRCBConstant;

public class SZCRBRequestClientUtil<P, T> {
    private Logger logger = LoggerFactory.getLogger(SZCRBRequestClientUtil.class);
    private String userName;
    private Validator validator = null;

    private void init() {
        if (SZRCBConstant.getUserName() == null) {
            logger.error("init error : userName can not be null");
            throw new IllegalArgumentException("init error : userName can not be null");
        }
        this.setUserName(SZRCBConstant.getUserName());
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
    }

    public SZCRBRequestClientUtil() {
        super();
        init();
    }

    private void validaParam(P p) {
        Set<ConstraintViolation<P>> set = validator.validate(p);
        if (set != null && set.size() > 0) {
            pringValidateStr(set);
        }
    }

    private void pringValidateStr(Set<ConstraintViolation<P>> set) {
        ArrayList<String> validateString = new ArrayList<>();
        for (ConstraintViolation<P> constraintViolation : set) {
            validateString
                .add("字段：" + constraintViolation.getPropertyPath().toString() + "-" + constraintViolation.getMessage());
            logger.info("错误：" + constraintViolation.getMessage());
            logger.info("字段：" + constraintViolation.getPropertyPath().toString());
        }
        throw new IllegalArgumentException(StringHelper.join(validateString, ";"));
    }

    public T send(P p, Class<T> cls) {
        String userName = null;
        String targerHost = null;
        String port = null;
        if (p == null) {
            return null;
        }
        try {
            Method userNameMethod = p.getClass().getMethod("getUserName");
            Object invoke2 = userNameMethod.invoke(p);
            userName = (String)invoke2;
            Method portMethod = p.getClass().getMethod("getPort");
            Object portInvoke = portMethod.invoke(p);
            port = (String)portInvoke;
            Method hostMethod = p.getClass().getMethod("getHost");
            Object hostInvoke = hostMethod.invoke(p);
            targerHost = (String)hostInvoke;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        if (userName == null || "".equals(userName)) {
            try {
                Method setMe = p.getClass().getSuperclass().getMethod("setUserName", String.class);
                setMe.invoke(p, getUserName());
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (SecurityException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        String serverHost = null;
        if (targerHost == null || "".equals(targerHost) || port == null || "".equals(port)) {
            serverHost = SZRCBConstant.getServerHost();
            port = SZRCBConstant.getServerPort();

            try {
                Method setPort = p.getClass().getSuperclass().getMethod("setPort", String.class);
                setPort.invoke(p, SZRCBConstant.getServerPort());
                Method setHost = p.getClass().getSuperclass().getMethod("setHost", String.class);
                setHost.invoke(p, SZRCBConstant.getServerHost());
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (SecurityException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } else {
            serverHost = targerHost;
        }
        validaParam(p);
        logger.info("=========SZCRM初始化参数==============");
        String name = p.getClass().getName();
        logger.info("=========SZCRM参数:" + name + "==============");
        String xml = SZRCBXmlUtil.toXml(p);
        logger.info("=========SZCRM入参开始==============");
        logger.info(xml);
        logger.info("=========SZCRM入参end==============");
        logger.info(serverHost);
        String res = SZRCBSocketClient.post(serverHost, Integer.valueOf(port), xml);
        logger.info("=========SZCRM返回数据开始==============");
        logger.info(res);
        logger.info("=========SZCRM返回数据结束==============");
        if (res == null) {
            return null;
        }
        T t = (T)SZRCBXmlUtil.toBean(res, cls);
        return t;
    }

    public String getUserName() {
        return userName;
    }

    private void setUserName(String userName) {
        this.userName = userName;
    }

}

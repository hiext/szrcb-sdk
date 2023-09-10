package com.hiext.szrcb.util;

import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.naming.NoNameCoder;
import com.thoughtworks.xstream.io.xml.CompactWriter;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 * 输出xml和解析xml的工具类
 * 
 * @author angy
 * @date 2020/07/04
 */
public class SZRCBXmlUtil {

    private static XStream getXStream() {
        // 实例化XStream基本对象
        XStream xstream = new XStream(new DomDriver(StandardCharsets.UTF_8.name(), new NoNameCoder() {

            // 不对特殊字符进行转换，避免出现重命名字段时的“双下划线”
            public String encodeNode(String name) {
                return name;
            }
        }));
        // 忽视XML与JAVABEAN转换时，XML中的字段在JAVABEAN中不存在的部分
        xstream.ignoreUnknownElements();
        xstream.autodetectAnnotations(true);
        XStream.setupDefaultSecurity(xstream);
        xstream.allowTypesByWildcard(new String[] {"com.hiext.szrcb.*.**", "java.lang.**", "java.math.**"});
        return xstream;
    }

    /**
     * 以压缩的方式输出XML
     *
     * @param obj
     * @return
     */
    public static String toCompressXml(Object obj) {
        XStream xstream = getXStream();
        StringWriter sw = new StringWriter();
        // 识别obj类中的注解
        xstream.processAnnotations(obj.getClass());
        xstream.marshal(obj, new CompactWriter(sw));
        return sw.toString();
    }

    /**
     * 以格式化的方式输出XML
     *
     * @param obj
     * @return
     */
    public static String toXml(Object obj) {
        XStream xstream = getXStream();
        // 识别obj类中的注解
        xstream.processAnnotations(obj.getClass());
        xstream.aliasSystemAttribute(null, "class");
        return xstream.toXML(obj);
    }

    /**
     * 转换成JavaBean
     * 
     * @param <T>
     *
     * @param xmlStr
     * @param cls
     * @return
     */
    public static <T> T toBean(String xmlStr, Class<T> cls) {
        XStream xstream = getXStream();
        // 识别cls类中的注解
        xstream.processAnnotations(cls);
        // 设置JavaBean的类别名
        xstream.aliasType("ap", cls);
        @SuppressWarnings("unchecked")
        T result = (T)xstream.fromXML(xmlStr);
        return result;
    }

}

package com.hiext.szrcb.request;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hiext.szrcb.model.AccountDetailInfoModel;
import com.hiext.szrcb.model.QrCashInDetailModel;
import com.hiext.szrcb.model.SubAccountInfoModel;
import com.hiext.szrcb.model.SubAccountTradeDetailModel;
import com.hiext.szrcb.model.SubBalanceModel;
import com.hiext.szrcb.request.base.BaseResponseHead;
import com.hiext.szrcb.request.body.AccountBalanceParamBody;
import com.hiext.szrcb.request.body.AccountDetailInfoQueryBody;
import com.hiext.szrcb.request.body.PlatformCashOutBody;
import com.hiext.szrcb.request.body.QrCashInDetailQueryBody;
import com.hiext.szrcb.request.body.SubAccountCreateBody;
import com.hiext.szrcb.request.body.SubAccountInfoQueryBody;
import com.hiext.szrcb.request.body.SubAccountTradeDetailQueryBody;
import com.hiext.szrcb.request.body.SubBalanceQueryBody;
import com.hiext.szrcb.request.body.SubTransferBody;
import com.hiext.szrcb.request.body.TradeStatusQueryBody;
import com.hiext.szrcb.request.param.AccountBalanceParam;
import com.hiext.szrcb.request.param.AccountDetailInfoQueryParam;
import com.hiext.szrcb.request.param.PlatformCashOutParam;
import com.hiext.szrcb.request.param.QrCashInDetailQueryParam;
import com.hiext.szrcb.request.param.SubAccountCreateParam;
import com.hiext.szrcb.request.param.SubAccountInfoQueryParam;
import com.hiext.szrcb.request.param.SubAccountTradeDetailQueryParam;
import com.hiext.szrcb.request.param.SubBalanceQueryParam;
import com.hiext.szrcb.request.param.SubTransferParam;
import com.hiext.szrcb.request.param.TradeStatusQueryParam;
import com.hiext.szrcb.request.result.AccountBalanceResult;
import com.hiext.szrcb.request.result.AccountDetailInfoQueryResult;
import com.hiext.szrcb.request.result.PlatformCashOutResult;
import com.hiext.szrcb.request.result.QrCashInDetailResult;
import com.hiext.szrcb.request.result.SubAccountCreateResult;
import com.hiext.szrcb.request.result.SubAccountInfoResult;
import com.hiext.szrcb.request.result.SubAccountTradeDetailQueryResult;
import com.hiext.szrcb.request.result.SubBalanceResult;
import com.hiext.szrcb.request.result.SubTransferResult;
import com.hiext.szrcb.request.result.TradeStatusQueryResult;
import com.hiext.szrcb.result.body.AccountBalanceResultBody;
import com.hiext.szrcb.result.body.SubAccountCreateResultBody;
import com.hiext.szrcb.result.body.TradeStatusResultBody;
import com.hiext.szrcb.util.SZCRBRequestClientUtil;
import com.hiext.szrcb.util.SZCRBSocketFileUtil;
import com.hiext.szrcb.util.TextHandleUtil;

public class SZCRBRequestUtils {

    private static final Logger logger = LoggerFactory.getLogger(SZCRBRequestUtils.class);

    /**
     * 主账号余额查询
     *
     * @param mainNo
     * @return
     */
    public static AccountBalanceResultBody getAccountMainBanlance(String mainNo) {
        AccountBalanceParam param = new AccountBalanceParam();
        AccountBalanceParamBody accountBalanceParamBody = new AccountBalanceParamBody();
        accountBalanceParamBody.setAcno(mainNo);
        param.setBody(accountBalanceParamBody);
        SZCRBRequestClientUtil<AccountBalanceParam, AccountBalanceResult> clientUtil = new SZCRBRequestClientUtil<>();
        AccountBalanceResult result = clientUtil.send(param, AccountBalanceResult.class);
        if (result != null && param.getHead() != null && "0".equals(result.getHead().getSucc_flag())) {
            return result.getBody();
        } else {
            logger.error(" accountBalance fail param :{} ", result);
        }
        return null;
    }

    /**
     * 主账号余额查询
     *
     * @param mainNo
     * @return
     */
    public static AccountBalanceResultBody getAccountMainBanlance(String mainNo, String host, String port,
                                                                  String userName) {
        AccountBalanceParam param = new AccountBalanceParam();
        AccountBalanceParamBody accountBalanceParamBody = new AccountBalanceParamBody();
        accountBalanceParamBody.setAcno(mainNo);
        param.setBody(accountBalanceParamBody);
        param.setHost(host);
        param.setPort(port);
        param.setUserName(userName);
        SZCRBRequestClientUtil<AccountBalanceParam, AccountBalanceResult> clientUtil = new SZCRBRequestClientUtil<>();
        AccountBalanceResult result = clientUtil.send(param, AccountBalanceResult.class);
        if (result != null && param.getHead() != null && "0".equals(result.getHead().getSucc_flag())) {
            return result.getBody();
        } else {
            logger.error(" accountBalance fail param :{} ", result);
        }
        return null;
    }

    /**
     * 3.1.3 单笔对外支付 (300001)
     *
     * @param cashOutBody
     * @param host
     * @param port
     * @param userName
     * @return
     */
    public static PlatformCashOutResult cashOut(PlatformCashOutBody cashOutBody, String host, String port,
                                                String userName) {

        PlatformCashOutParam param = new PlatformCashOutParam();
        param.setBody(cashOutBody);
        param.setHost(host);
        param.setPort(port);
        param.setUserName(userName);
        param.getHead().setReq_no(cashOutBody.getCert_no());
        SZCRBRequestClientUtil<PlatformCashOutParam, PlatformCashOutResult> clientUtil = new SZCRBRequestClientUtil<>();
        PlatformCashOutResult result = clientUtil.send(param, PlatformCashOutResult.class);
        if (result != null && param.getHead() != null && "0".equals(result.getHead().getSucc_flag())) {
            return result;
        } else {
            logger.error(" accountBalance fail param :{} ", result);
            return result;
        }
    }

    /**
     * 3.1.2 查询交易账户明细
     *
     * @param mainNo    主账
     * @param startDate 开始时间
     * @param endDate   结束时间
     * @return 交易流水
     */
    public static List<AccountDetailInfoModel> getAccountDetailInfo(String mainNo, String startDate, String endDate) {
        AccountDetailInfoQueryParam param = new AccountDetailInfoQueryParam();
        AccountDetailInfoQueryBody body = new AccountDetailInfoQueryBody();
        body.setAcno(mainNo);
        body.setEnd_date(endDate);
        body.setStart_date(startDate);
        param.setBody(body);
        SZCRBRequestClientUtil<AccountDetailInfoQueryParam, AccountDetailInfoQueryResult> clientUtil = new SZCRBRequestClientUtil<>();
        AccountDetailInfoQueryResult result = clientUtil.send(param, AccountDetailInfoQueryResult.class);
        if (result != null && result.getHead() != null && "0".equals(result.getHead().getSucc_flag())) {
            BaseResponseHead resultHead = result.getHead();
            int dataSize = result.getBody().getRecord_num();
            int fieldSize = result.getBody().getField_num();
            List<AccountDetailInfoModel> res = new ArrayList<>();
            String seString = null;
            if ("0".equals(resultHead.getFile_flag())) {
                seString = result.getBody().getSerial_record();

            } else {
                seString = SZCRBSocketFileUtil.getFile(param.getHost(), result.getBody().getFile_name());

            }
            List<JSONObject> jsonObjects = TextHandleUtil.handle(seString, dataSize, fieldSize);
            for (JSONObject jsonObject : jsonObjects) {
                AccountDetailInfoModel e = JSON.parseObject(jsonObject.toJSONString(), AccountDetailInfoModel.class);
                res.add(e);
            }
            return res;
        } else {
            throw new RuntimeException("银行处理异常！");
        }
    }

    public static List<AccountDetailInfoModel> getAccountDetailInfo(String mainNo, String startDate, String endDate,
                                                                    String host, String port, String userName) {
        AccountDetailInfoQueryParam param = new AccountDetailInfoQueryParam();
        AccountDetailInfoQueryBody body = new AccountDetailInfoQueryBody();
        body.setAcno(mainNo);
        body.setEnd_date(endDate);
        body.setStart_date(startDate);
        param.setHost(host);
        param.setPort(port);
        param.setUserName(userName);
        param.setBody(body);
        SZCRBRequestClientUtil<AccountDetailInfoQueryParam, AccountDetailInfoQueryResult> clientUtil = new SZCRBRequestClientUtil<>();
        AccountDetailInfoQueryResult result = clientUtil.send(param, AccountDetailInfoQueryResult.class);
        if (result != null && result.getHead() != null && "0".equals(result.getHead().getSucc_flag())) {
            BaseResponseHead resultHead = result.getHead();
            int dataSize = result.getBody().getRecord_num();
            int fieldSize = result.getBody().getField_num();
            List<AccountDetailInfoModel> res = new ArrayList<>();
            String seString = null;
            if ("0".equals(resultHead.getFile_flag())) {
                seString = result.getBody().getSerial_record();

            } else {
                seString = SZCRBSocketFileUtil.getFile(param.getHost(), result.getBody().getFile_name());

            }
            List<JSONObject> jsonObjects = TextHandleUtil.handle(seString, dataSize, fieldSize);
            for (JSONObject jsonObject : jsonObjects) {
                AccountDetailInfoModel e = JSON.parseObject(jsonObject.toJSONString(), AccountDetailInfoModel.class);
                res.add(e);
            }
            return res;
        } else {
            throw new RuntimeException("银行处理异常！");
        }
    }

    public static List<AccountDetailInfoModel> getAccountDetailInfoByDate(String mainNo, Date startDate, Date endDate) {
        AccountDetailInfoQueryParam param = new AccountDetailInfoQueryParam();
        AccountDetailInfoQueryBody body = new AccountDetailInfoQueryBody();
        body.setAcno(mainNo);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        body.setEnd_date(dateFormat.format(endDate));
        body.setStart_date(dateFormat.format(startDate));
        param.setBody(body);
        SZCRBRequestClientUtil<AccountDetailInfoQueryParam, AccountDetailInfoQueryResult> clientUtil = new SZCRBRequestClientUtil<>();
        AccountDetailInfoQueryResult result = clientUtil.send(param, AccountDetailInfoQueryResult.class);
        if (result != null && result.getHead() != null && "0".equals(result.getHead().getSucc_flag())) {
            BaseResponseHead resultHead = result.getHead();
            int dataSize = result.getBody().getRecord_num();
            int fieldSize = result.getBody().getField_num();
            List<AccountDetailInfoModel> res = new ArrayList<>();
            String seString = null;
            if ("0".equals(resultHead.getFile_flag())) {
                seString = result.getBody().getSerial_record();

            } else {
                seString = SZCRBSocketFileUtil.getFile(param.getHost(), result.getBody().getFile_name());

            }
            List<JSONObject> jsonObjects = TextHandleUtil.handle(seString, dataSize, fieldSize);
            for (JSONObject jsonObject : jsonObjects) {
                AccountDetailInfoModel e = JSON.parseObject(jsonObject.toJSONString(), AccountDetailInfoModel.class);
                res.add(e);
            }
            return res;
        } else {
            throw new RuntimeException("银行处理异常！");
        }
    }

    public static List<AccountDetailInfoModel> getAccountDetailInfoByDate(String mainNo, Date startDate, Date endDate,
                                                                          String host, String port, String userName) {
        AccountDetailInfoQueryParam param = new AccountDetailInfoQueryParam();
        AccountDetailInfoQueryBody body = new AccountDetailInfoQueryBody();
        body.setAcno(mainNo);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        body.setEnd_date(dateFormat.format(endDate));
        body.setStart_date(dateFormat.format(startDate));
        param.setHost(host);
        param.setPort(port);
        param.setUserName(userName);
        param.setBody(body);
        SZCRBRequestClientUtil<AccountDetailInfoQueryParam, AccountDetailInfoQueryResult> clientUtil = new SZCRBRequestClientUtil<>();
        AccountDetailInfoQueryResult result = clientUtil.send(param, AccountDetailInfoQueryResult.class);
        if (result != null && result.getHead() != null && "0".equals(result.getHead().getSucc_flag())) {
            BaseResponseHead resultHead = result.getHead();
            int dataSize = result.getBody().getRecord_num();
            int fieldSize = result.getBody().getField_num();
            List<AccountDetailInfoModel> res = new ArrayList<>();
            String seString = null;
            if ("0".equals(resultHead.getFile_flag())) {
                seString = result.getBody().getSerial_record();

            } else {
                seString = SZCRBSocketFileUtil.getFile(param.getHost(), result.getBody().getFile_name());

            }
            List<JSONObject> jsonObjects = TextHandleUtil.handle(seString, dataSize, fieldSize);
            for (JSONObject jsonObject : jsonObjects) {
                AccountDetailInfoModel e = JSON.parseObject(jsonObject.toJSONString(), AccountDetailInfoModel.class);
                res.add(e);
            }
            return res;
        } else {
            throw new RuntimeException("银行处理异常！");
        }
    }

    /**
     * 子账号的创建
     *
     * @param mainNo
     * @param subAccountName
     * @return
     */
    public static SubAccountCreateResultBody subAccountCreate(String mainNo, String subAccountName) {
        SubAccountCreateParam param = new SubAccountCreateParam();
        SubAccountCreateBody body = new SubAccountCreateBody();
        body.setAcno(mainNo);
        param.setBody(body);
        body.setAcno(mainNo);
        body.setAs_acname(subAccountName);
        SZCRBRequestClientUtil<SubAccountCreateParam, SubAccountCreateResult> clientUtil = new SZCRBRequestClientUtil<>();
        SubAccountCreateResult result = clientUtil.send(param, SubAccountCreateResult.class);
        if (result != null && result.getHead() != null && "0".equals(result.getHead().getSucc_flag())) {
            return result.getBody();
        }
        return null;
    }

    /**
     * 子账号的创建
     *
     * @param mainNo
     * @param subAccountName
     * @param host
     * @param port
     * @param userName
     * @return
     */
    public static SubAccountCreateResultBody subAccountCreate(String mainNo, String subAccountName, String host,
                                                              String port, String userName) {
        SubAccountCreateParam param = new SubAccountCreateParam();
        SubAccountCreateBody body = new SubAccountCreateBody();
        body.setAcno(mainNo);
        param.setHost(host);
        param.setPort(port);
        param.setUserName(userName);
        param.setBody(body);
        body.setAcno(mainNo);
        body.setAs_acname(subAccountName);
        SZCRBRequestClientUtil<SubAccountCreateParam, SubAccountCreateResult> clientUtil = new SZCRBRequestClientUtil<>();
        SubAccountCreateResult result = clientUtil.send(param, SubAccountCreateResult.class);
        if (result != null && result.getHead() != null && "0".equals(result.getHead().getSucc_flag())) {
            return result.getBody();
        }
        return null;
    }

    /**
     * 3.1.7 多级账簿查询（200102）
     *
     * @param mainNo
     * @param subNo
     * @return
     */
    public static List<SubAccountInfoModel> subAccountInfoQuery(String mainNo, String subNo) {
        SubAccountInfoQueryParam param = new SubAccountInfoQueryParam();
        SubAccountInfoQueryBody body = new SubAccountInfoQueryBody();
        body.setAcno(mainNo);
        body.setAs_acno(subNo);
        param.setBody(body);
        SZCRBRequestClientUtil<SubAccountInfoQueryParam, SubAccountInfoResult> clientUtil = new SZCRBRequestClientUtil<>();
        SubAccountInfoResult result = clientUtil.send(param, SubAccountInfoResult.class);
        if (result != null && result.getHead() != null && "0".equals(result.getHead().getSucc_flag())) {
            BaseResponseHead resultHead = result.getHead();
            int dataSize = result.getBody().getRecord_num();
            int fieldSize = result.getBody().getField_num();
            List<SubAccountInfoModel> res = new ArrayList<>();
            String seString = null;
            if ("0".equals(resultHead.getFile_flag())) {
                seString = result.getBody().getSerial_record();
            } else {
                seString = SZCRBSocketFileUtil.getFile(param.getHost(), result.getBody().getFile_name());

            }
            List<JSONObject> jsonObjects = TextHandleUtil.handle(seString, dataSize, fieldSize);
            for (JSONObject jsonObject : jsonObjects) {
                SubAccountInfoModel e = JSON.parseObject(jsonObject.toJSONString(), SubAccountInfoModel.class);
                res.add(e);
            }
            return res;
        } else {
            throw new RuntimeException("银行处理异常！");
        }
    }

    /**
     * 3.1.7 多级账簿查询（200102）
     *
     * @param mainNo
     * @param subNo
     * @param host
     * @param port
     * @param userName
     * @return
     */
    public static List<SubAccountInfoModel> subAccountInfoQuery(String mainNo, String subNo, String host, String port,
                                                                String userName) {
        SubAccountInfoQueryParam param = new SubAccountInfoQueryParam();
        SubAccountInfoQueryBody body = new SubAccountInfoQueryBody();
        param.setHost(host);
        param.setPort(port);
        param.setUserName(userName);
        body.setAcno(mainNo);
        body.setAs_acno(subNo);
        param.setBody(body);
        SZCRBRequestClientUtil<SubAccountInfoQueryParam, SubAccountInfoResult> clientUtil = new SZCRBRequestClientUtil<>();
        SubAccountInfoResult result = clientUtil.send(param, SubAccountInfoResult.class);
        if (result != null && result.getHead() != null && "0".equals(result.getHead().getSucc_flag())) {
            BaseResponseHead resultHead = result.getHead();
            int dataSize = result.getBody().getRecord_num();
            int fieldSize = result.getBody().getField_num();
            List<SubAccountInfoModel> res = new ArrayList<>();
            String seString = null;
            if ("0".equals(resultHead.getFile_flag())) {
                seString = result.getBody().getSerial_record();
            } else {
                seString = SZCRBSocketFileUtil.getFile(param.getHost(), result.getBody().getFile_name());

            }
            List<JSONObject> jsonObjects = TextHandleUtil.handle(seString, dataSize, fieldSize);
            for (JSONObject jsonObject : jsonObjects) {
                SubAccountInfoModel e = JSON.parseObject(jsonObject.toJSONString(), SubAccountInfoModel.class);
                res.add(e);
            }
            return res;
        } else {
            throw new RuntimeException("银行处理异常！");
        }
    }

    /**
     * 子账号余额查询
     *
     * @param mainNo
     * @param subNo
     * @return
     */
    public static SubBalanceModel subBalanceQuery(String mainNo, String subNo) {
        return subBalanceQuery(mainNo, subNo, "", "", "");
    }

    /**
     * 子账号余额查询
     *
     * @param mainNo
     * @param subNo
     * @param host
     * @param port
     * @param userName
     * @return
     */
    public static SubBalanceModel subBalanceQuery(String mainNo, String subNo, String host, String port,
                                                  String userName) {
        SubBalanceQueryParam param = new SubBalanceQueryParam();
        SubBalanceQueryBody body = new SubBalanceQueryBody();
        param.setHost(host);
        param.setPort(port);
        param.setUserName(userName);
        body.setAcno(mainNo);
        body.setAs_acno(subNo);
        param.setBody(body);
        SZCRBRequestClientUtil<SubBalanceQueryParam, SubBalanceResult> clientUtil = new SZCRBRequestClientUtil<>();
        SubBalanceResult result = clientUtil.send(param, SubBalanceResult.class);
        if (result != null && result.getHead() != null && "0".equals(result.getHead().getSucc_flag())) {
            BaseResponseHead resultHead = result.getHead();
            int dataSize = result.getBody().getRecord_num();
            int fieldSize = result.getBody().getField_num();
            List<SubBalanceModel> res = new ArrayList<>();
            String seString = null;
            if ("0".equals(resultHead.getFile_flag())) {
                seString = result.getBody().getSerial_record();
            } else {
                seString = SZCRBSocketFileUtil.getFile(param.getHost(), result.getBody().getFile_name());
            }
            List<JSONObject> jsonObjects = TextHandleUtil.handle(seString, dataSize, fieldSize);
            for (JSONObject jsonObject : jsonObjects) {
                SubBalanceModel e = JSON.parseObject(jsonObject.toJSONString(), SubBalanceModel.class);
                res.add(e);
            }
            if (res.size() > 0) {
                return res.get(0);
            }
        }
        return null;
    }

    /**
     * 子账号的交易流水查询
     *
     * @param mainNo
     * @param subNo
     * @param tradeType
     * @param startDate
     * @param endDate
     * @return
     */
    public static List<SubAccountTradeDetailModel> subAccountTradeDetail(String mainNo, String subNo, String tradeType,
                                                                         String startDate, String endDate) {
        SubAccountTradeDetailQueryParam param = new SubAccountTradeDetailQueryParam();
        SubAccountTradeDetailQueryBody body = new SubAccountTradeDetailQueryBody();
        body.setAcno(mainNo);
        body.setAs_acno(subNo);
        body.setTr_type(tradeType);
        body.setEnd_date(endDate);
        body.setStart_date(startDate);
        param.setBody(body);
        SZCRBRequestClientUtil<SubAccountTradeDetailQueryParam, SubAccountTradeDetailQueryResult> clientUtil = new SZCRBRequestClientUtil<>();
        SubAccountTradeDetailQueryResult result = clientUtil.send(param, SubAccountTradeDetailQueryResult.class);
        if (result != null && result.getHead() != null && "0".equals(result.getHead().getSucc_flag())) {
            BaseResponseHead resultHead = result.getHead();
            int dataSize = result.getBody().getRecord_num();
            int fieldSize = result.getBody().getField_num();
            List<SubAccountTradeDetailModel> res = new ArrayList<>();
            String seString = null;
            if ("0".equals(resultHead.getFile_flag())) {
                seString = result.getBody().getSerial_record();

            } else {
                seString = SZCRBSocketFileUtil.getFile(param.getHost(), result.getBody().getFile_name());

            }
            List<JSONObject> jsonObjects = TextHandleUtil.handle(seString, dataSize, fieldSize);
            for (JSONObject jsonObject : jsonObjects) {
                SubAccountTradeDetailModel e = JSON.parseObject(jsonObject.toJSONString(),
                    SubAccountTradeDetailModel.class);
                res.add(e);
            }
            return res;
        } else {
            throw new RuntimeException("银行处理异常！");
        }
    }

    /**
     * 子账号的交易流水查询
     *
     * @param mainNo
     * @param subNo
     * @param tradeType
     * @param startDate
     * @param endDate
     * @param host
     * @param port
     * @param userName
     * @return
     */
    public static List<SubAccountTradeDetailModel> subAccountTradeDetail(String mainNo, String subNo, String tradeType,
                                                                         String startDate, String endDate, String host,
                                                                         String port, String userName) {
        SubAccountTradeDetailQueryParam param = new SubAccountTradeDetailQueryParam();
        SubAccountTradeDetailQueryBody body = new SubAccountTradeDetailQueryBody();
        param.setHost(host);
        param.setPort(port);
        param.setUserName(userName);
        body.setAcno(mainNo);
        body.setAs_acno(subNo);
        body.setAs_acno(subNo);
        body.setTr_type(tradeType);
        body.setEnd_date(endDate);
        body.setStart_date(startDate);
        param.setBody(body);
        SZCRBRequestClientUtil<SubAccountTradeDetailQueryParam, SubAccountTradeDetailQueryResult> clientUtil = new SZCRBRequestClientUtil<>();
        SubAccountTradeDetailQueryResult result = clientUtil.send(param, SubAccountTradeDetailQueryResult.class);
        if (result != null && result.getHead() != null && "0".equals(result.getHead().getSucc_flag())) {
            BaseResponseHead resultHead = result.getHead();
            int dataSize = result.getBody().getRecord_num();
            int fieldSize = result.getBody().getField_num();
            List<SubAccountTradeDetailModel> res = new ArrayList<>();
            String seString = null;
            if ("0".equals(resultHead.getFile_flag())) {
                seString = result.getBody().getSerial_record();

            } else {
                seString = SZCRBSocketFileUtil.getFile(param.getHost(), result.getBody().getFile_name());

            }
            List<JSONObject> jsonObjects = TextHandleUtil.handle(seString, dataSize, fieldSize);
            for (JSONObject jsonObject : jsonObjects) {
                SubAccountTradeDetailModel e = JSON.parseObject(jsonObject.toJSONString(),
                    SubAccountTradeDetailModel.class);
                res.add(e);
            }
            return res;
        } else {
            throw new RuntimeException("银行处理异常！");
        }
    }

    /**
     * 子账号的交易流水查询
     *
     * @param mainNo
     * @param subNo
     * @param tradeType
     * @param startDate
     * @param endDate
     * @return
     */
    public static List<SubAccountTradeDetailModel> subAccountTradeDetailByDate(String mainNo, String subNo,
                                                                               String tradeType, Date startDate,
                                                                               Date endDate) {
        SubAccountTradeDetailQueryParam param = new SubAccountTradeDetailQueryParam();
        SubAccountTradeDetailQueryBody body = new SubAccountTradeDetailQueryBody();
        body.setAcno(mainNo);
        body.setAs_acno(subNo);
        body.setTr_type(tradeType);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        body.setEnd_date(dateFormat.format(endDate));
        body.setStart_date(dateFormat.format(startDate));
        param.setBody(body);
        SZCRBRequestClientUtil<SubAccountTradeDetailQueryParam, SubAccountTradeDetailQueryResult> clientUtil = new SZCRBRequestClientUtil<>();
        SubAccountTradeDetailQueryResult result = clientUtil.send(param, SubAccountTradeDetailQueryResult.class);
        if (result != null && result.getHead() != null && "0".equals(result.getHead().getSucc_flag())) {
            BaseResponseHead resultHead = result.getHead();
            int dataSize = result.getBody().getRecord_num();
            int fieldSize = result.getBody().getField_num();
            List<SubAccountTradeDetailModel> res = new ArrayList<>();
            String seString = null;
            if ("0".equals(resultHead.getFile_flag())) {
                seString = result.getBody().getSerial_record();

            } else {
                seString = SZCRBSocketFileUtil.getFile(param.getHost(), result.getBody().getFile_name());

            }
            List<JSONObject> jsonObjects = TextHandleUtil.handle(seString, dataSize, fieldSize);
            for (JSONObject jsonObject : jsonObjects) {
                SubAccountTradeDetailModel e = JSON.parseObject(jsonObject.toJSONString(),
                    SubAccountTradeDetailModel.class);
                res.add(e);
            }
            return res;
        } else {
            throw new RuntimeException("银行处理异常！");
        }
    }

    /**
     * 子账号的交易流水查询
     *
     * @param mainNo
     * @param subNo
     * @param tradeType
     * @param startDate
     * @param endDate
     * @param host
     * @param port
     * @param userName
     * @return
     */
    public static List<SubAccountTradeDetailModel> subAccountTradeDetailByDate(String mainNo, String subNo,
                                                                               String tradeType, Date startDate,
                                                                               Date endDate, String host, String port,
                                                                               String userName) {
        SubAccountTradeDetailQueryParam param = new SubAccountTradeDetailQueryParam();
        SubAccountTradeDetailQueryBody body = new SubAccountTradeDetailQueryBody();
        param.setHost(host);
        param.setPort(port);
        param.setUserName(userName);
        body.setAcno(mainNo);
        body.setAs_acno(subNo);
        body.setAs_acno(subNo);
        body.setTr_type(tradeType);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        body.setEnd_date(dateFormat.format(endDate));
        body.setStart_date(dateFormat.format(startDate));
        param.setBody(body);
        SZCRBRequestClientUtil<SubAccountTradeDetailQueryParam, SubAccountTradeDetailQueryResult> clientUtil = new SZCRBRequestClientUtil<>();
        SubAccountTradeDetailQueryResult result = clientUtil.send(param, SubAccountTradeDetailQueryResult.class);
        if (result != null && result.getHead() != null && "0".equals(result.getHead().getSucc_flag())) {
            BaseResponseHead resultHead = result.getHead();
            int dataSize = result.getBody().getRecord_num();
            int fieldSize = result.getBody().getField_num();
            List<SubAccountTradeDetailModel> res = new ArrayList<>();
            String seString = null;
            if ("0".equals(resultHead.getFile_flag())) {
                seString = result.getBody().getSerial_record();

            } else {
                seString = SZCRBSocketFileUtil.getFile(param.getHost(), result.getBody().getFile_name());

            }
            List<JSONObject> jsonObjects = TextHandleUtil.handle(seString, dataSize, fieldSize);
            for (JSONObject jsonObject : jsonObjects) {
                SubAccountTradeDetailModel e = JSON.parseObject(jsonObject.toJSONString(),
                    SubAccountTradeDetailModel.class);
                res.add(e);
            }
            return res;
        } else {
            throw new RuntimeException("银行处理异常！");
        }
    }

    /**
     * 子账号余额调整
     *
     * @param subTransferBody
     * @param host
     * @param port
     * @param userName
     * @return
     */
    public static SubTransferResult subTransfer(SubTransferBody subTransferBody, String host, String port,
                                                String userName) {
        SubTransferParam param = new SubTransferParam();
        param.setBody(subTransferBody);
        param.setHost(host);
        param.setPort(port);
        param.setUserName(userName);
        param.getHead().setReq_no(subTransferBody.getPurpose());
        SZCRBRequestClientUtil<SubTransferParam, SubTransferResult> clientUtil = new SZCRBRequestClientUtil<>();
        SubTransferResult result = clientUtil.send(param, SubTransferResult.class);
        if (result != null && param.getHead() != null && "0".equals(result.getHead().getSucc_flag())) {
            return result;
        } else {
            logger.error(" subTransfer fail param :{} ", result);
            return result;
        }
    }

    /**
     * 子账号余额调整
     *
     * @param subTransferBody
     * @return
     */
    public static SubTransferResult subTransfer(SubTransferBody subTransferBody) {
        SubTransferParam param = new SubTransferParam();
        param.setBody(subTransferBody);
        param.getHead().setReq_no(subTransferBody.getPurpose());
        SZCRBRequestClientUtil<SubTransferParam, SubTransferResult> clientUtil = new SZCRBRequestClientUtil<>();
        SubTransferResult result = clientUtil.send(param, SubTransferResult.class);
        if (result != null && param.getHead() != null && "0".equals(result.getHead().getSucc_flag())) {
            return result;
        } else {
            logger.error(" subTransfer fail param :{} ", result);
            return result;
        }
    }

    /**
     * 交易状态查询
     *
     * @param docNo
     * @param host
     * @param port
     * @param userName
     * @return
     */
    public static TradeStatusResultBody tradeStatusQuery(String docNo, String host, String port, String userName) {
        TradeStatusQueryParam param = new TradeStatusQueryParam();
        TradeStatusQueryBody body = new TradeStatusQueryBody();
        body.setSerial_no(docNo);
        param.setBody(body);
        param.setHost(host);
        param.setPort(port);
        param.setUserName(userName);
        SZCRBRequestClientUtil<TradeStatusQueryParam, TradeStatusQueryResult> clientUtil = new SZCRBRequestClientUtil<>();
        TradeStatusQueryResult result = clientUtil.send(param, TradeStatusQueryResult.class);
        if (result != null && param.getHead() != null && "0".equals(result.getHead().getSucc_flag())) {
            return result.getBody();
        } else {
            logger.error(" subTransfer fail param :{} ", result);
            return result.getBody();
        }
    }

    /**
     * 一码通明细实时查询
     *
     * @param host
     * @param port
     * @param userName
     * @param startTime
     * @param endTime
     * @return
     */
    public static List<QrCashInDetailModel> qrCashInDetailQuery(String host, String port, String userName,
                                                                Date startTime, Date endTime) {
        QrCashInDetailQueryParam param = new QrCashInDetailQueryParam();
        QrCashInDetailQueryBody body = new QrCashInDetailQueryBody();
        param.setHost(host);
        param.setPort(port);
        param.setUserName(userName);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        body.setBegDtTmstmp(simpleDateFormat.format(startTime));
        body.setEndDtTmstmp(simpleDateFormat.format(endTime));
        param.setBody(body);
        SZCRBRequestClientUtil<QrCashInDetailQueryParam, QrCashInDetailResult> clientUtil = new SZCRBRequestClientUtil<>();
        QrCashInDetailResult result = clientUtil.send(param, QrCashInDetailResult.class);
        if (result != null && result.getHead() != null && "0".equals(result.getHead().getSucc_flag())) {
            BaseResponseHead resultHead = result.getHead();
            int dataSize = result.getBody().getRecord_num();
            int fieldSize = result.getBody().getField_num();
            String seString = null;
            List<QrCashInDetailModel> res = new ArrayList<>();
            if ("0".equals(resultHead.getFile_flag())) {
                // seString = result.getBody().getSerial_record();
            } else {
                seString = SZCRBSocketFileUtil.getFile(param.getHost(), result.getBody().getFile_name());

            }
            List<JSONObject> jsonObjects = TextHandleUtil.handle(seString, dataSize, fieldSize);
            if (jsonObjects != null && jsonObjects.size() > 0) {
                for (JSONObject jsonObject : jsonObjects) {
                    QrCashInDetailModel e = JSON.parseObject(jsonObject.toJSONString(), QrCashInDetailModel.class);
                    res.add(e);
                }
            }
            return res;
        } else {
            throw new RuntimeException("银行处理异常！");
        }
    }

}

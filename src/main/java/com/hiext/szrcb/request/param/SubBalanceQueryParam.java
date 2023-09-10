package com.hiext.szrcb.request.param;

import com.hiext.szrcb.request.base.BaseRequestParam;
import com.hiext.szrcb.request.base.BaseRequestParamHead;
import com.hiext.szrcb.request.body.SubBalanceQueryBody;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 子账户余额查询
 * 
 * @author angy
 * @date 2020/10/30
 */
@XStreamAlias("ap")
public class SubBalanceQueryParam extends BaseRequestParam {
    @XStreamAlias("head")
    private BaseRequestParamHead head = new BaseRequestParamHead("200106");

    @XStreamAlias("body")
    private SubBalanceQueryBody body;

    @Override
    public String getTr_code() {
        return "200106";
    }

    public BaseRequestParamHead getHead() {
        return head;
    }

    public void setHead(BaseRequestParamHead head) {
        this.head = head;
    }

    public void setBody(SubBalanceQueryBody body) {
        this.body = body;
    }

    public SubBalanceQueryBody getBody() {
        return body;
    }

}

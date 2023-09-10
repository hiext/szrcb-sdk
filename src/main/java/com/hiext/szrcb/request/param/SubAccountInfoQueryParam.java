package com.hiext.szrcb.request.param;

import com.hiext.szrcb.request.base.BaseRequestParam;
import com.hiext.szrcb.request.base.BaseRequestParamHead;
import com.hiext.szrcb.request.body.SubAccountInfoQueryBody;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ap")
public class SubAccountInfoQueryParam extends BaseRequestParam {

    @Override
    public String getTr_code() {
        return "200102";
    }

    @XStreamAlias("head")
    private BaseRequestParamHead head = new BaseRequestParamHead("200102");

    @XStreamAlias("body")
    private SubAccountInfoQueryBody body;

    public BaseRequestParamHead getHead() {
        return head;
    }

    public void setHead(BaseRequestParamHead head) {
        this.head = head;
    }

    public SubAccountInfoQueryBody getBody() {
        return body;
    }

    public void setBody(SubAccountInfoQueryBody body) {
        this.body = body;
    }

}

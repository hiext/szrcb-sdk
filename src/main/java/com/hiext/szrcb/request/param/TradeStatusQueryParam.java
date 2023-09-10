package com.hiext.szrcb.request.param;

import com.hiext.szrcb.request.base.BaseRequestParam;
import com.hiext.szrcb.request.base.BaseRequestParamHead;
import com.hiext.szrcb.request.body.TradeStatusQueryBody;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ap")
public class TradeStatusQueryParam extends BaseRequestParam {
    @XStreamAlias("head")
    private BaseRequestParamHead head = new BaseRequestParamHead("570674");

    @XStreamAlias("body")
    private TradeStatusQueryBody body;

    @Override
    public String getTr_code() {
        return "570674";
    }

    public BaseRequestParamHead getHead() {
        return head;
    }

    public void setHead(BaseRequestParamHead head) {
        this.head = head;
    }

    public TradeStatusQueryBody getBody() {
        return body;
    }

    public void setBody(TradeStatusQueryBody body) {
        this.body = body;
    }

}

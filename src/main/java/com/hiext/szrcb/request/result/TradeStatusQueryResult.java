package com.hiext.szrcb.request.result;

import com.hiext.szrcb.request.base.BaseResponseHead;
import com.hiext.szrcb.result.body.TradeStatusResultBody;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ap")
public class TradeStatusQueryResult {
    @XStreamAlias("head")
    private BaseResponseHead head;
    @XStreamAlias("body")
    private TradeStatusResultBody body;

    public BaseResponseHead getHead() {
        return head;
    }

    public void setHead(BaseResponseHead head) {
        this.head = head;
    }

    public TradeStatusResultBody getBody() {
        return body;
    }

    public void setBody(TradeStatusResultBody body) {
        this.body = body;
    }
}

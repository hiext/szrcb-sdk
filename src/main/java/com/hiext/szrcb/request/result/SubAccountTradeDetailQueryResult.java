package com.hiext.szrcb.request.result;

import com.hiext.szrcb.request.base.BaseResponseHead;
import com.hiext.szrcb.result.body.SubAccountTradeDetailQueryResultBody;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ap")
public class SubAccountTradeDetailQueryResult {
    @XStreamAlias("head")
    private BaseResponseHead head;
    @XStreamAlias("body")
    private SubAccountTradeDetailQueryResultBody body;

    public BaseResponseHead getHead() {
        return head;
    }

    public void setHead(BaseResponseHead head) {
        this.head = head;
    }

    public SubAccountTradeDetailQueryResultBody getBody() {
        return body;
    }

    public void setBody(SubAccountTradeDetailQueryResultBody body) {
        this.body = body;
    }
}

package com.hiext.szrcb.request.result;

import com.hiext.szrcb.request.base.BaseResponseHead;
import com.hiext.szrcb.result.body.SubAccountInfoBody;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ap")
public class SubAccountInfoResult {
    @XStreamAlias("head")
    private BaseResponseHead head;
    @XStreamAlias("body")
    private SubAccountInfoBody body;

    public BaseResponseHead getHead() {
        return head;
    }

    public void setHead(BaseResponseHead head) {
        this.head = head;
    }

    public SubAccountInfoBody getBody() {
        return body;
    }

    public void setBody(SubAccountInfoBody body) {
        this.body = body;
    }
}

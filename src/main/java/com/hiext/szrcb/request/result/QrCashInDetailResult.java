package com.hiext.szrcb.request.result;

import com.hiext.szrcb.request.base.BaseResponseHead;
import com.hiext.szrcb.result.body.QrCashInDetailResultBody;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ap")
public class QrCashInDetailResult {
    @XStreamAlias("head")
    private BaseResponseHead head;
    @XStreamAlias("body")
    private QrCashInDetailResultBody body;

    public BaseResponseHead getHead() {
        return head;
    }

    public void setHead(BaseResponseHead head) {
        this.head = head;
    }

    public QrCashInDetailResultBody getBody() {
        return body;
    }

    public void setBody(QrCashInDetailResultBody body) {
        this.body = body;
    }

}

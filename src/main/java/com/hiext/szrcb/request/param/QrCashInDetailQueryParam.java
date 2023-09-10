package com.hiext.szrcb.request.param;

import com.hiext.szrcb.request.base.BaseRequestParam;
import com.hiext.szrcb.request.base.BaseRequestParamHead;
import com.hiext.szrcb.request.body.QrCashInDetailQueryBody;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ap")
public class QrCashInDetailQueryParam extends BaseRequestParam {
    @XStreamAlias("head")
    private BaseRequestParamHead head = new BaseRequestParamHead("570671");

    @XStreamAlias("body")
    private QrCashInDetailQueryBody body;

    @Override
    public String getTr_code() {
        return "300001";
    }

    public BaseRequestParamHead getHead() {
        return head;
    }

    public void setHead(BaseRequestParamHead head) {
        this.head = head;
    }

    public QrCashInDetailQueryBody getBody() {
        return body;
    }

    public void setBody(QrCashInDetailQueryBody body) {
        this.body = body;
    }

}

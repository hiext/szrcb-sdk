package com.hiext.szrcb.request.param;

import com.hiext.szrcb.request.base.BaseRequestParam;
import com.hiext.szrcb.request.base.BaseRequestParamHead;
import com.hiext.szrcb.request.body.PlatformCashOutBody;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ap")
public class PlatformCashOutParam extends BaseRequestParam {
    @XStreamAlias("head")
    private BaseRequestParamHead head = new BaseRequestParamHead("300001");

    @XStreamAlias("body")
    private PlatformCashOutBody body;

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

    public PlatformCashOutBody getBody() {
        return body;
    }

    public void setBody(PlatformCashOutBody body) {
        this.body = body;
    }

}

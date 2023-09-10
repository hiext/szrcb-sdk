package com.hiext.szrcb.request.param;

import com.hiext.szrcb.request.base.BaseRequestParam;
import com.hiext.szrcb.request.base.BaseRequestParamHead;
import com.hiext.szrcb.request.body.SubAccountCreateBody;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ap")
public class SubAccountCreateParam extends BaseRequestParam {
    @XStreamAlias("head")
    private BaseRequestParamHead head = new BaseRequestParamHead("590109");

    @XStreamAlias("body")
    private SubAccountCreateBody body;

    @Override
    public String getTr_code() {
        return "590109";
    }

    public BaseRequestParamHead getHead() {
        return head;
    }

    public void setHead(BaseRequestParamHead head) {
        this.head = head;
    }

    public SubAccountCreateBody getBody() {
        return body;
    }

    public void setBody(SubAccountCreateBody body) {
        this.body = body;
    }

}

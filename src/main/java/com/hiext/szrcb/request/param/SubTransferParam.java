package com.hiext.szrcb.request.param;

import com.hiext.szrcb.request.base.BaseRequestParam;
import com.hiext.szrcb.request.base.BaseRequestParamHead;
import com.hiext.szrcb.request.body.SubTransferBody;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 3.1.11 多级账簿余额调整（100105）
 * 
 * @author angy
 * * @since 2020/10/30
 */
@XStreamAlias("ap")
public class SubTransferParam extends BaseRequestParam {

    @Override
    public String getTr_code() {
        return "100105";
    }

    @XStreamAlias("head")
    private BaseRequestParamHead head = new BaseRequestParamHead("100105");

    @XStreamAlias("body")
    private SubTransferBody body;

    public BaseRequestParamHead getHead() {
        return head;
    }

    public void setHead(BaseRequestParamHead head) {
        this.head = head;
    }

    public SubTransferBody getBody() {
        return body;
    }

    public void setBody(SubTransferBody body) {
        this.body = body;
    }

}

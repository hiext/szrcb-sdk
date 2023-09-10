package com.hiext.szrcb.request.result;

import com.hiext.szrcb.request.base.BaseResponseHead;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ap")
public class SubTransferResult {
    @XStreamAlias("head")
    private BaseResponseHead head;

    public BaseResponseHead getHead() {
        return head;
    }

    public void setHead(BaseResponseHead head) {
        this.head = head;
    }

}

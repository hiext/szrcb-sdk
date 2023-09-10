package com.hiext.szrcb.request.result;

import com.hiext.szrcb.request.base.BaseResponseHead;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 单笔对外支付
 * 
 * @author angy
 * * @since 2020/11/03
 */
@XStreamAlias("ap")
public class PlatformCashOutResult {
    @XStreamAlias("head")
    private BaseResponseHead head;

    public BaseResponseHead getHead() {
        return head;
    }

    public void setHead(BaseResponseHead head) {
        this.head = head;
    }
}

package com.hiext.szrcb.request.param;

import com.hiext.szrcb.request.base.BaseRequestParam;
import com.hiext.szrcb.request.base.BaseRequestParamHead;
import com.hiext.szrcb.request.body.SubAccountTradeDetailQueryBody;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 3.1.10 多级账簿明细查询（200103）
 * 
 * @author angy
 * @date 2020/10/30
 */
@XStreamAlias("ap")
public class SubAccountTradeDetailQueryParam extends BaseRequestParam {

    @Override
    public String getTr_code() {
        return "200103";
    }

    @XStreamAlias("head")
    private BaseRequestParamHead head = new BaseRequestParamHead("200103");

    @XStreamAlias("body")
    private SubAccountTradeDetailQueryBody body;

    public BaseRequestParamHead getHead() {
        return head;
    }

    public void setHead(BaseRequestParamHead head) {
        this.head = head;
    }

    public SubAccountTradeDetailQueryBody getBody() {
        return body;
    }

    public void setBody(SubAccountTradeDetailQueryBody body) {
        this.body = body;
    }

}

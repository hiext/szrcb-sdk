package com.hiext.szrcb.request.base;

import com.thoughtworks.xstream.annotations.XStreamOmitField;

public abstract class BaseRequestParam {

    public abstract String getTr_code();

    /**
     * 登录名最长30个字符
     */
    @XStreamOmitField
    private String userName;
    @XStreamOmitField
    private String host;
    @XStreamOmitField
    private String port;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

}

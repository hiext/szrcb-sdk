package com.hiext.szrcb.request;

import com.hiext.szrcb.util.PropertiesUtil;

/**
 * @author angy
 * * @since 2020/07/04
 */
public class SZRCBConstant {
    private static final PropertiesUtil propertiesUtil = new PropertiesUtil("application.properties");
    public static final String SDK_NAME = "SZRCB-SDK";
    public static final String DEV_COMPANY = "hiext.com";
    private static final String PORT = "10010";
    private static final String FILEPORT = "20010";
    public static final int USAE_NAME_LENGTH = 30;

    public static String getServerHost() {
        String host = propertiesUtil.getProperty("szrcb.host");
        if (host == null) {
            host = DEV_COMPANY;
        }
        return host;
    }

    public static String getServerPort() {
        String port = propertiesUtil.getProperty("szrcb.port");
        if (port == null) {
            port = PORT;
        }
        return port;
    }

    public static String getUserName() {
        if (propertiesUtil.getProperty("szrcb.userName") == null) {
            return "";
        } else {
            return propertiesUtil.getProperty("szrcb.userName");
        }
    }

    public static String getFileport() {
        return FILEPORT;
    }
}

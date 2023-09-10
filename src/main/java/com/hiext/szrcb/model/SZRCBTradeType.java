package com.hiext.szrcb.model;

import java.util.HashMap;
import java.util.Map;

public enum SZRCBTradeType {

    /**
     * 利息分配
     */
    LXFP("结息", "LXFP", "3"),
    /**
     * 手续费分配
     */
    SXFFP("收费", "SXFFP", "4"),
    /**
     * 强制转账
     */
    QZZZ("强制转账", "QZZZ", "6"),
    /**
     * 调账
     */
    TZ("调账", "TZ", "5"),
    /**
     * 普通外部转账
     */
    PTWBZZ("普通外部转账", "PTWBZZ", "1"),
    ;

    private final String name;
    private final String value;
    private String code;

    private static final Map<String, SZRCBTradeType> valueMap = new HashMap<String, SZRCBTradeType>();
    private static final Map<String, SZRCBTradeType> nameMap = new HashMap<String, SZRCBTradeType>();
    private static final Map<String, SZRCBTradeType> codeMap = new HashMap<String, SZRCBTradeType>();

    static {
        for (SZRCBTradeType status : SZRCBTradeType.values()) {
            valueMap.put(status.getValue(), status);
            nameMap.put(status.getName(), status);
            codeMap.put(status.getCode(), status);
        }
    }

    SZRCBTradeType(String name, String value, String code) {
        this.name = name;
        this.value = value;
        this.code = code;
    }

    public static String getNameByValue(String value) {
        if (valueMap.get(value) == null) {
            return null;
        }
        return valueMap.get(value).name;
    }

    public static SZRCBTradeType getByValue(String value) {
        return valueMap.get(value);
    }

    public static SZRCBTradeType getByName(String name) {
        return nameMap.get(name);
    }

    public static SZRCBTradeType getByCode(String code) {
        return codeMap.get(code);
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}

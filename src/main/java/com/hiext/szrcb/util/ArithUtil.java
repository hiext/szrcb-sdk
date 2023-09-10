package com.hiext.szrcb.util;

import java.math.BigDecimal;

/**
 * 数据计算
 * 
 * @author angy
 * * @since 2020/08/08
 */
public class ArithUtil {
    private static final int DEF_DIV_SCALE = 10;

    private ArithUtil() {}

    /**
     * +
     */
    public static double add(Double d1, Double d2) {
        if (d1 == null)
            d1 = 0.0;
        if (d2 == null)
            d2 = 0.0;
        BigDecimal b1 = new BigDecimal(Double.toString(d1));
        BigDecimal b2 = new BigDecimal(Double.toString(d2));
        return b1.add(b2).doubleValue();
    }

    /**
     * d1+d2 digit 保留位数,四舍五入
     */
    public static double add(Double d1, Double d2, int digit) {
        if (d1 == null)
            d1 = 0.0;
        if (d2 == null)
            d2 = 0.0;
        BigDecimal b1 = new BigDecimal(Double.toString(d1));
        BigDecimal b2 = new BigDecimal(Double.toString(d2));
        return b1.add(b2).setScale(digit, BigDecimal.ROUND_HALF_UP).doubleValue();

    }

    /**
     * -
     */
    public static double sub(Double d1, Double d2) {
        if (d1 == null)
            d1 = 0.0;
        if (d2 == null)
            d2 = 0.0;
        BigDecimal b1 = new BigDecimal(Double.toString(d1));
        BigDecimal b2 = new BigDecimal(Double.toString(d2));
        return b1.subtract(b2).doubleValue();
    }

    /**
     * d1-d2 digit 保留位数,四舍五入
     */
    public static double sub(Double d1, Double d2, int digit) {
        if (d1 == null)
            d1 = 0.0;
        if (d2 == null)
            d2 = 0.0;
        BigDecimal b1 = new BigDecimal(Double.toString(d1));
        BigDecimal b2 = new BigDecimal(Double.toString(d2));
        return b1.subtract(b2).setScale(digit, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * *
     */
    public static double mul(Double d1, Double d2) {
        if (d1 == null)
            d1 = 0.0;
        if (d2 == null)
            d2 = 0.0;
        BigDecimal b1 = new BigDecimal(Double.toString(d1));
        BigDecimal b2 = new BigDecimal(Double.toString(d2));
        return b1.multiply(b2).doubleValue();
    }

    /**
     * digit 保留位数,四舍五入
     */
    public static double mul(Double d1, Double d2, int digit) {
        if (d1 == null)
            d1 = 0.0;
        if (d2 == null)
            d2 = 0.0;
        BigDecimal b1 = new BigDecimal(Double.toString(d1));
        BigDecimal b2 = new BigDecimal(Double.toString(d2));
        return b1.multiply(b2).setScale(digit, BigDecimal.ROUND_HALF_UP).doubleValue();

    }

    /**
     * /
     */
    public static double div(Double d1, Double d2) {

        return div(d1, d2, DEF_DIV_SCALE);

    }

    /**
     * d1/d2
     */
    public static double div(Double d1, Double d2, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        if (d1 == null)
            d1 = 0.0;
        if (d2 == null)
            d2 = 0.0;
        if (d2 == 0)
            return 0.0;
        BigDecimal b1 = new BigDecimal(Double.toString(d1));
        BigDecimal b2 = new BigDecimal(Double.toString(d2));
        return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();

    }

    public static Double setScale(Double num, int digit) {
        if (num == null) {
            return num;
        } else {
            return new BigDecimal(num).setScale(digit, BigDecimal.ROUND_HALF_UP).doubleValue();
        }
    }
}

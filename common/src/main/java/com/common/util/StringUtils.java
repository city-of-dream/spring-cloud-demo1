package com.common.util;

import java.text.MessageFormat;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @title : 字符串工具类
 * @describle :
 * <p>
 * Create By byron
 * @date 2017/5/22 12:00 星期一
 */
public final class StringUtils {
    public final static String PREFIX = "[";
    public final static String SUFFIX = "]";
    public final static String DOLLAR = "$";
    public final static String SLASH = "/";
    public final static String BACKSLASH = "\\";
    public final static String POINT = ".";
    public final static String RAIL = "-";
    public final static String UNDER_RAIL = "_";
    public final static String NULL = "";
    public final static String EQUAL = "=";
    public final static String BLANK = " ";
    public final static String COMMA = ",";
    public final static String SPLIT = ":";
    public final static String SEMICOLON = ";";
    public final static String DEFAULT_ENCODING = "UTF-8";

    public final static boolean isEmpty(List list) {
        if (null == list || list.size() == 0) {
            return true;
        }
        return false;
    }

    public final static boolean isNotEmpty(List list) {
        if (null != list && list.size() != 0) {
            return true;
        }
        return false;
    }

    public final static boolean isEmpty(String str) {
        if (null == str || "".equals(str)) {
            return true;
        }
        return false;
    }

    public final static boolean isNotEmpty(String str) {
        if (null != str && str.length() > 0) {
            return true;
        }
        return false;
    }

    public final static boolean isEmpty(Set set) {
        if (null == set || (null != set && set.size() == 0)) {
            return true;
        }
        return false;
    }

    public final static boolean isNotEmpty(Set set) {
        if (null != set && set.size() > 0) {
            return true;
        }
        return false;
    }

    public final static boolean isEmpty(Map map) {
        if (null == map || (null != map && map.size() == 0)) {
            return true;
        }
        return false;
    }

    public final static boolean isNotEmpty(Map map) {
        if (null != map && map.size() > 0) {
            return true;
        }
        return false;
    }

    public final static boolean isEmpty(Object obj) {
        if (null == obj) {
            return true;
        }
        return false;
    }

    public final static boolean isNotEmpty(Object obj) {
        return !isEmpty(obj);
    }

    public final static boolean isEmpty(Object[] obj) {
        if (null == obj || (null != obj && obj.length == 0)) {
            return true;
        }
        return false;
    }

    public final static boolean isNotEmpty(Object[] obj) {
        if (null != obj && obj.length > 0) {
            return true;
        }
        return false;
    }

    /**
     * <p>
     * str'reg started with {0} eg: {0}{1}{2}......
     * </p>
     *
     * @param str
     * @param args
     * @return
     */
    public final static String format(String str, Object... args) {
        if (isNotEmpty(str)) {
            MessageFormat mf = new MessageFormat(str);
            return mf.format(args);
        }
        return null;
    }

    /**
     * 截取分隔符之前字符
     * @param str 字符串
     * @param split 分隔符
     * @return
     */
    public final static String subStart(String str, String split) {
        if (isNotEmpty(str) && isNotEmpty(split)) {
            int i = str.indexOf(split);
            if (i>0){
                return str.substring(0, i);
            }
        }
        return str;
    }

    /**
     * 截取分隔符之后字符
     * @param str
     * @param split
     * @return
     */
    public final static String subEnd(String str, String split){
        if (isNotEmpty(str) && isNotEmpty(split)) {
            int i = str.lastIndexOf(split);
            if (i>0){
                return str.substring(i);
            }
        }
        return str;
    }
}

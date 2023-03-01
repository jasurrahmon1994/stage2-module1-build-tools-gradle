package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if(org.apache.commons.lang3.StringUtils.startsWith(str, "0")) return false;
        return NumberUtils.toDouble(str, -1) > 0;
    }
}

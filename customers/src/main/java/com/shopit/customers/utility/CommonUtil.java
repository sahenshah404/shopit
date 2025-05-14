package com.shopit.customers.utility;

import java.util.Collection;
import java.util.Map;

public class CommonUtil {
    public static boolean isEmpty(Object obj) {
        if(obj == null) {
            return true;
        }
        if(obj instanceof String) {
            return ((String) obj).trim().isEmpty();
        }
        if (obj instanceof Collection<?>) {
            return ((Collection<?>) obj).isEmpty();
        }

        if (obj instanceof Map<?, ?>) {
            return ((Map<?, ?>) obj).isEmpty();
        }

        if (obj.getClass().isArray()) {
            return java.lang.reflect.Array.getLength(obj) == 0;
        }
        
        return  false;
    }

    public static boolean isEmptyOrZero(Object obj) {
        if(obj instanceof Number) {
            return  ((Number) obj).doubleValue() == 0;
        }

        return  isEmpty(obj);
    }
}

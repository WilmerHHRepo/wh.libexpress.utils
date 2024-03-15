package pe.wh.libexpress.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectUtils {

    public static boolean isEmpty(Object object) {
        if (object == null) {
            return true;
        }
        if (object instanceof StringUtils) {
            return object.toString().trim().length() == 0;
        }
        if (object instanceof StringBuilder) {
            return object.toString().trim().length() == 0;
        }
        if (object instanceof List<?> || object instanceof ArrayList<?>) {
            return ((List<?>) object).isEmpty();
        }
        if (object instanceof Map<?, ?> || object instanceof HashMap<?, ?>) {
            return ((Map<?, ?>) object).isEmpty();
        }
        return false;
    }

    public static boolean isNotEmpty(Object object) {
        return !isEmpty(object);
    }

}

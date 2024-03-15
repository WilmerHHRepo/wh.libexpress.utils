package pe.wh.libexpress.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringUtils {
    private static final Logger logger = LoggerFactory.getLogger(BigDecimalUtils.class);
    public static Double stringToDouble(java.lang.String valor) {//por cabecera.codmovimiento
        if (io.micrometer.common.util.StringUtils.isBlank(valor)) {
            return null;
        }
        return Double.valueOf(valor);
    }




}

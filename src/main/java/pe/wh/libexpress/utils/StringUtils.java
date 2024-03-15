package pe.wh.libexpress.utils;

public class StringUtils {

    public static Double stringToDouble(java.lang.String valor) {//por cabecera.codmovimiento
        if (io.micrometer.common.util.StringUtils.isBlank(valor)) {
            return null;
        }
        return Double.valueOf(valor);
    }




}

package pe.wh.libexpress.utils;

import java.math.BigDecimal;
import java.util.*;

public class BigDecimalUtils {

    public static BigDecimal getMtoValOfList(BigDecimal... valor) {
        List<BigDecimal> lstmtoCalcular = new ArrayList<BigDecimal>();
        for (BigDecimal i : valor) {
            lstmtoCalcular.add(i);
        }
        return new BigDecimal(String.valueOf(lstmtoCalcular.stream().min(Comparator.comparing(j -> j)).orElse(new BigDecimal("0"))));
    }

    public static BigDecimal setNullableToZero(BigDecimal bigDecimal){
        return Optional.ofNullable(bigDecimal).filter(Objects::nonNull).orElse(new BigDecimal("0"));
    }


}

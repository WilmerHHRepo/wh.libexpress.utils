package pe.wh.libexpress.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.*;

public class BigDecimalUtils {
    private static final Logger logger = LoggerFactory.getLogger(BigDecimalUtils.class);

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

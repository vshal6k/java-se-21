package practice;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalLearnings {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("12.3");
        Object object = new Object();
        // System.out.println(a.add(new BigDecimal(0.2).setScale(2,
        // RoundingMode.HALF_UP)));
        // System.out.println(a.subtract(new BigDecimal(0.2).setScale(2,
        // RoundingMode.HALF_UP)));
        // System.out.println(a.multiply(new BigDecimal(0.2)).setScale(2,
        // RoundingMode.HALF_UP));
        System.out.println(
                a.divide(new BigDecimal("0.2")).setScale(2, RoundingMode.HALF_UP));
        // Always inititalise BigDecimal using String to avoid storing unnecessary
        // precision inside the object
    }
}

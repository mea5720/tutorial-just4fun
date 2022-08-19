package numberstuff;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalConversion {
    public static void main(String... args) {
        int deprecatedDiffs = 0;
        int updatedDiffs = 0;
        int bdDiffs = 0;
        for (double dollars = 0.00; dollars <= 100000.00; dollars += 0.01) {
            BigDecimal deprecatedBD = new BigDecimal(dollars).setScale(2, BigDecimal.ROUND_HALF_UP);
            BigDecimal updatedBD = BigDecimal.valueOf(dollars).setScale(2, RoundingMode.HALF_UP);

            String dollarsStr = String.format("%.2f", dollars);
            String deprecatedBDStr = String.format("%.2f", deprecatedBD);
            String updatedBDStr = String.format("%.2f", updatedBD);
            if (dollars != deprecatedBD.doubleValue()) {
                deprecatedDiffs += 1;
                System.out.println("deprecated: " + deprecatedBD + " differs from " + dollars);
            }
            if (dollars != updatedBD.doubleValue()) {
                updatedDiffs += 1;
                System.out.println("updated: " + updatedBD + " differs from " + dollars);
            }

            if (deprecatedBD.doubleValue() != updatedBD.doubleValue()) {
                System.out.println("updated: " + updatedBD + " differs from deprecated: " + deprecatedBD);
                bdDiffs += 1;
            }
        }
        System.out.println("Diffs in updated: " + updatedDiffs + ", deprecated: " + deprecatedDiffs);
        System.out.println("Diffs in updated vs deprecated: " + bdDiffs);
    }
}

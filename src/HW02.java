public class HW02 {
    public static double arithmeticPositiveMeanAfterNegative(double[] nums) {
        // Шаг 2
        double acc = 0;
        int countPositive = 0;
        boolean firstNegativeFound = false;

        for (double num : nums) {
            if (num < 0) {
                firstNegativeFound = true;
            } else if (firstNegativeFound && num > 0) {
                acc += num;
                countPositive++;
            }
        }

        return acc / countPositive;
    }

    public static void main(String[] args) {
        // Шаг 1
        double[] dotNums = {
                1.2, 3.4, -5.6, -9.7, -4.3,
                -2.2, -8.9, -4.7, 4.5, 7.8,
                2.8, -3.5, -3.9, 9.1, 7.7,
        };


        System.out.printf("Результат: %.2f", arithmeticPositiveMeanAfterNegative(dotNums));

    }
}

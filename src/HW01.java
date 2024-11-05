public class HW01 {

    // Шаг 1
    public static String permission(int ageOfHuman, int outsideTemperature) {
        // Шаг 2
        if ((ageOfHuman >= 20 && ageOfHuman <= 45 && outsideTemperature >= -20 && outsideTemperature <= 30)
                || (ageOfHuman < 20 && outsideTemperature >= 0 && outsideTemperature <= 28)
                || (ageOfHuman > 45 && outsideTemperature >= -10 && outsideTemperature <= 25)) {
            return "Сan go for a walk";
        } else {
            return "Stay home";
        }
    }

    // Шаг 4
    public static int generateRandomAge() {
        int max = 100, min = 0; // Обусловлено тем, что человеку с среднем от 0 до 100 лет
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {
        // Шаг 3
        // Использовал printf для удобства вывода и оптимизации
        System.out.printf(
                """
                        
                        Result 1: %s
                        Result 2: %s
                        Result 3: %s
                        Result 4: %s
                        Result 5: %s
                        """,
                permission(22, 15), // True
                permission(14, -10), // False
                permission(17, 28), // True
                permission(50, -12), // False
                permission(52, -5) // True
        );

        // Шаг 5
        // Вывод с использованием метода generateRandomAge()
        System.out.printf(
                """
      
                        Random age result 1: %s
                        Random age result 2: %s
                        Random age result 3: %s
                        Random age result 4: %s
                        Random age result 5: %s
                        """,
                permission(generateRandomAge(), 15), // True
                permission(generateRandomAge(), -10), // False
                permission(generateRandomAge(), 28), // True
                permission(generateRandomAge(), -12), // False
                permission(generateRandomAge(), -5) // True
        );

    }
}
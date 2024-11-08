import java.util.Scanner;

public class HW02_02 {
    public static boolean isPalindrome(String str) {
        boolean isPalindrome = true;

        // Очищаем строку от пробелов и переводим в нижний регистр
        str = str.replace(" ", "").toLowerCase();

        // Используем цикл, берем половину длинны строки
        for (int i = 0; i < str.length() / 2; i++) {
            // Если текущий символ не совпадает с символом второй половины строки,
            // то она уже не палиндром
            // (P.S. не совсем понимаю как это описать на русском :) )
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        // Возвращаем результат.
        return isPalindrome;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Просим ввести строку
        System.out.print("Enter a string: ");

        // Сразу проверяем ввод используя наш метод и выдаем сообщение
        if (isPalindrome(sc.nextLine())){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}

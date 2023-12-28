package task03;

//Напишите метод, который принимает на вход строку (String) и
//определяет является ли строка палиндромом (возвращает boolean значение).

public class Palindroms {
    public static boolean isPalindrom(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (right > 0) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "bab";

        System.out.println(isPalindrom(str));
    }
}

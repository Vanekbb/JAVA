package task02;

//Напишите метод, который сжимает строку.
//Пример: вход aaaabbbcdd.

public class StringShinker {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";

        System.out.println(shinkString(str));
    }

    public static String shinkString(String str) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        char prevChar = str.charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (prevChar == str.charAt(i)) {
                counter++;
            } else {
                sb.append(prevChar);
                sb.append(counter);
                prevChar = str.charAt(i);
                counter = 1;
            }
        }
        sb.append(prevChar);
        sb.append(counter);
        return sb.toString();
    }
}

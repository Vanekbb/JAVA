package task04;
//Напишите метод, который находит самую длинную строку общего
//префикса среди массива строк.
//Если общего префикса нет, вернуть пустую строку ""

public class ReturnPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};

        System.out.println(maxPrefix(strs));

    }
    public static String maxPrefix(String[] wordsArr) {
        String prefix = wordsArr[0];

        for (int i = 1; i < wordsArr.length; i++) {
            while (wordsArr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}

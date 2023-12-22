package task02;
//Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
//максимальное количество подряд идущих 1.

public class CountBinSeries {
    public static void main(String[] args) {
        int[] array = { 1, 1, 0, 1, 1, 1 };
        int maxCounter = getMaxCounter(array);
        System.out.println(maxCounter);
    }

    private static int getMaxCounter(int[] array) {
        int count = 0;
        int maxCounter = 0;

        for (int i : array) {
            if (i == 1) {
                count++;
            } else {
                if (count > maxCounter) {
                    maxCounter = count;
                }
                count = 0;
            }
        }
        if (count > maxCounter) {
            maxCounter = count;
        }
        return maxCounter;
    }
}

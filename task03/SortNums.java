package task03;
//Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести
//эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива
//должны быть отличны от заданного, а остальные - равны ему.

import java.util.Arrays;

public class SortNums {
    public static void main(String[] args) {
        int[] numsArray = { 1, 2, 3, 4, 5, 3, 6, 7, 3, 3, 8, 9, 3 };
        int arrayLenght = numsArray.length - 1;
        int val = 3;

        while (numsArray[arrayLenght] == val) {
            arrayLenght--;
        }

        for (int i = 0; i < arrayLenght; i++) {
            if (numsArray[i] == val) {
                numsArray[i] = numsArray[arrayLenght];
                numsArray[arrayLenght] = val;
                arrayLenght--;
            }
        }
        System.out.println(Arrays.toString(numsArray));
    }
}

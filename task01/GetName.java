package task01;
//Написать программу, которая запросит пользователя ввести
//<Имя> в консоли.
//Получит введенную строку и выведет в консоль сообщение
//“Привет, <Имя>!”

import java.util.Scanner;

public class GetName {
    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        Scanner scanner = new Scanner(System.in, "ibm866");
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "!");
        System.out.printf("Привет, %s!", name);
        scanner.close();
    }
}

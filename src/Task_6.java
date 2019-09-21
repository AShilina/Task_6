import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x:");
        int Number_x = in.nextInt();
        System.out.println("Введите число y:");
        int Number_y = in.nextInt();
        System.out.println("Введите число z:");
        int Number_z = in.nextInt();

        int average = (Number_x + Number_y + Number_z) / 3;
        System.out.println("Среднее арифметическое x, y, z: " + average);

        int delenie_na_dva = average / 2;

        if (delenie_na_dva > 3)
            System.out.println("Программа выполнена корректно");
    }
}
import java.util.Scanner;
public class three {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        double number1 = 1.5;
        double number2 = 2.5;
        double number3 = 3.5;

        // Перевіряємо перше число
        if (sc.hasNextDouble()) {
            number1 = sc.nextDouble();
            System.out.println(number1);
        } else {
            System.out.println("Неправильне введення.  ");
        }

        // Перевіряємо друге число
        if (sc.hasNextDouble()) {
            number2 = sc.nextDouble();
            System.out.println(number2);
        } else {
            System.out.println("Неправильне введення. ");
        }

        // Перевіряємо третє число
        if (sc.hasNextDouble()) {
            number3 = sc.nextDouble();
            System.out.println(number3);
        } else {
            System.out.println("Неправильне введення.  ");
        }

        // Знаходимо більше  число
        double maxNumber = Math.max(Math.max(number1, number2), number3);


        System.out.println("Більше число: " +maxNumber  );


     }
}


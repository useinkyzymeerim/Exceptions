import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите положительное число: ");
            int number = scanner.nextInt();
            if (number < 0) {
                throw new NegativeNumberException("отрицательное число");
            }
            System.out.println("Вы ввели положительное число");
        } catch (NegativeNumberException n) {
            System.out.println("Вы вели отрецательное число");

        }

    }
}
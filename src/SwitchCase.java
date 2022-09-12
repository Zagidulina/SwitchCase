import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Добрый вечер-выберите опрацию!");
        System.out.println(" 1-сложение \n 2-вычитание \n 3-умножение  \n 4-деление");

        int operation = scanner.nextInt();

        System.out.println("Вы выбрали-операцию: " + operation);

        System.out.println("Введите первое число");
        int var1 = scanner.nextInt();

        System.out.println("Введите второе число");
        int var2 = scanner.nextInt();

        switch (operation) {
            case 1:
                System.out.println("Результат сложения: " + sum(var1, var2));
                break;
            case 2:
                System.out.println("Результат вычитания: " + minus(var1, var2));
                break;
            case 3:
                System.out.println("Результат умножения: " + multiplication(var1, var2));
                break;
            case 4:
                System.out.println("Результат деления: " + division(var1, var2));
                break;
            default:
                System.out.println("Неверная операция");
        }
    }

    public static int sum(int var1, int var2) {
        return var1 + var2;

    }

    public static int minus(int var1, int var2) {
        return var1 - var2;
    }

    public static int multiplication(int var1, int var2) {
        return var1 * var2;
    }

    public static int division(int var1, int var2) {
        return var1 / var2;
    }
}
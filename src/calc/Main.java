package src.calc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = "";
        int firstNumber;
        int secondNumber;
        while (!"q".equals(userInput)) {
            try {
                System.out.println("Введите первое число/цифру");
                firstNumber = sc.nextInt();
                System.out.println("Введите второе число/цифру");
                secondNumber = sc.nextInt();
                System.out.println("Введите оператор +; -; *; /; !.");
                sc.nextLine();
                userInput = sc.nextLine();
                double result;
                switch (userInput) {
                    case "+":
                        result = Calculation.plus(firstNumber, secondNumber);
                        break;
                    case "-":
                        result = Calculation.minus(firstNumber, secondNumber);
                        break;
                    case "*":
                        result = Calculation.ymn(firstNumber, secondNumber);
                        break;
                    case "/":
                        if (secondNumber == 0) {
                            System.out.println("Деление на ноль невозможно");
                            continue;
                        }
                        result = Calculation.del(firstNumber, secondNumber);
                        break;
                    case "!":
                        result = Calculation.fact(firstNumber);
                        break;
                    default:
                        result = 0;
                        System.out.println("Введен недопустимый оператор, поэтому результат " + result);
                        break;
                }
                System.out.println(result);
            }
            catch (InputMismatchException ex) {
                System.out.println("Введены неверные данные. Необходимо ввести число/цифру.");
                sc.nextLine();
            }
        }
    }
}
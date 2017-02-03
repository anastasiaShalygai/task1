package task3;

import java.util.Scanner;

/**
 * Created by Anastasiya on 01.02.2017.
 */
public class SimpleСalculator {

    //Constructor - is a class for build a particular class objects. It is incorrect to overload this method by such logic
    public SimpleСalculator() {
        double number1;
        double number2;

        number1 = checkDouble();
        number2 = checkDouble();

        calc(number1, number2);
    }

    private double checkDouble() {
        double symbol;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");

        if(sc.hasNextDouble()) {
            symbol = sc.nextDouble();
            //sc.close();
            return symbol;
        } else {
            System.out.println("Неверный формат(должен быть Double)");
            return checkDouble();
        }
    }

    private void calc(double number1, double number2) {
        double result;

        result = number1 + number2;
        System.out.printf("\nСумма: %.2f", result);

        result = number1 - number2;
        System.out.printf("\nРазность: %.2f", result);

        result = number1 * number2;
        System.out.printf("\nПроизведение: %.2f", result);

        result = number1 / number2;
        System.out.printf("\nЧастное: %.2f", result);

    }
}

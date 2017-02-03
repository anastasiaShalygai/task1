package task2;

import java.util.Scanner;

/**
 * Created by Anastasiya on 01.02.2017.
 */
public class LengthString {

    //Code convention - methods starts from lower case letters
    public LengthString() {
        int amountString = 0;
        //For what is this action?
        String[] stringArray = new String[amountString];

        amountString = enterAmountString();
        stringArray = enterArray(amountString);
        averageLengthArray(stringArray, amountString);
        printArray(stringArray, amountString);
    }

    private String [] enterArray(int amountString) {
        String[] stringArray = new String[amountString];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < amountString; i++) {
            System.out.print("Строка " + i + ": ");
            stringArray[i] = sc.nextLine();
        }
        //sc.close();

        return stringArray ;
    }

    private int enterAmountString() {
        int symbol;

        System.out.print("Введите кол-во строк: ");
        Scanner sc = new Scanner(System.in);

        if(sc.hasNextInt()) {
            symbol = sc.nextInt();
            //sc.close();
            return symbol;
        } else {
            System.out.println("Неверный формат(должен быть Int)");
            return enterAmountString();
        }
    }

    private void printArray(String[] stringArray, int amountString) {
        int i = 0;
        System.out.print("Массив: ");

        while (i != amountString) {
            System.out.print(stringArray[i] + " ");
            i++;
        }
    }

    private float averageLengthArray(String[] stringArray, int amountString) {
        float averageLength = 0;

        for (int i = 0; i < amountString; i++) {
            averageLength += stringArray[i].length();
        }

        averageLength = averageLength / amountString;
        System.out.println("\nСредняя длина массива строк: " + averageLength);

        return averageLength;
    }
}

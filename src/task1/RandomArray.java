package task1;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Anastasiya on 01.02.2017.
 */
public class RandomArray {

    // due to usage of this variable only as a modifier of array size, it could be inner - in particular method
    // or initialize intArray as a instance variable too
    public static final int SIZE_ARRAY = 5;

    public RandomArray() {
        int[] intArray = new int[SIZE_ARRAY];
        int i = 0;

        while (i != SIZE_ARRAY) {
            Random randNumber = new Random();
            intArray[i] = randNumber.nextInt();
            //intArray[i] = checkInt(i);
            i++;
        }
        i = 0;
        printArray(intArray);

        while (i != SIZE_ARRAY) {
            if(intArray[i] < 0) intArray[i] = 0;
            i++;
        }
        System.out.println("\n\nМассив после изменений");
        printArray(intArray);
    }

    private void printArray(int[] intArray) {
        int i = 0;
        System.out.print("Массив: ");

        while (i != SIZE_ARRAY) {
            System.out.print(intArray[i] + " ");
            i++;
        }
    }

    private int checkInt(int indexSymbol) {
        int symbol;
        Scanner sc = new Scanner(System.in);
        System.out.print("intArray[" + indexSymbol + "} = ");

        if(sc.hasNextInt()) {
            symbol = sc.nextInt();
            //In this case, it is better to use Try Catch construction at the outer level
            //sc.close(); //где его лучше закрыть?
            return symbol;
        } else {
            System.out.println("Неверный формат(должен быть Int)");
            return checkInt(indexSymbol);
        }
    }

}

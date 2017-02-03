package ChoiceMenu;

import task1.RandomArray;
import task2.LengthString;
import task3.SimpleСalculator;

import java.util.Scanner;

/**
 * Created by Anastasiya on 02.02.2017.
 */
public class Menu {

    //Constructor - is a class for build a particular class objects. It is incorrect to overload this method by such logic
    public Menu() {
        int numTask;

        numTask = enterInt();
        selectionTask(numTask);
    }

    private static int enterInt() {
        int numTask;
        Scanner sc = new Scanner(System.in);
        System.out.println("Бведите номер задания(1,2,3 или 4 - для выхода):");

        if(sc.hasNextInt()) {
            numTask = sc.nextInt();
            //sc.close();
            return numTask;
        } else {
            System.out.println("Неверный формат(должен быть Int)");
            return enterInt();
        }
    }

    private static void selectionTask(int numTask) {

        switch (numTask) {
            case 1: {
                // better to name variables more meaningful
                RandomArray a = new RandomArray();
                System.out.println("\n\n");
                new Menu();
                break;
            }
            case 2: {
                // better to name variables more meaningful
                LengthString b = new LengthString();
                System.out.println("\n\n");
                new Menu();
                break;
            }
            case 3:{
                // better to name variables more meaningful
                SimpleСalculator b = new SimpleСalculator();
                System.out.println("\n\n");
                new Menu();
                break;
            }
            case 4: System.exit(0);
                break;
            default: {
                System.out.println("Всего существует только 3 задания(1,2 и 3) и выход(4)");
                new Menu();
            }
        }
    }
}

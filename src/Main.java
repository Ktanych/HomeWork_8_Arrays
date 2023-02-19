import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // task 1
        System.out.println("Задача 1");

        int [] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        double [] fractions = {1.57, 7.654, 9.986};

        int [] evenNumbers = {0, 2, 4, 6, 8, 10};

        // task 2
        System.out.println("Задача 2");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < fractions.length; i++) {
            System.out.print(fractions[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.print(evenNumbers[i] + ", ");
        }
        System.out.println();

        // task 3
        System.out.println("Задача 3");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();

        for (int i = fractions.length - 1; i >= 0; i--) {
            System.out.print(fractions[i] + ", ");
        }
        System.out.println();

        for (int i = evenNumbers.length - 1; i >= 0; i--) {
            System.out.print(evenNumbers[i] + ", ");
        }
        System.out.println();

        // task 4
        System.out.println("Задача 4");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                numbers[i] += 1;
            }
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
    }

}
package Chapter5;

/* (Bar Chart Printing Program) One interesting application of computers is to display graphs and bar charts. Write an
application that reads five numbers between 1 and 30. For each number that’s read, your program should display the same number
of adjacent asterisks. For example, if your program reads the number 7, it should display *******. Display the bars of
asterisks after you read all five numbers.
 */

import java.util.Scanner;

public class BarChartPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int counter;

        System.out.println("Enter number between 1 - 30");
        number = input.nextInt();
        if (number <= 30) {
            for (counter = 1; counter <= number; counter++) {
                System.out.print("*");
            }
            System.out.println();
        }
        else  {
            System.out.println("You entered an invalid number");
        }

    }
}


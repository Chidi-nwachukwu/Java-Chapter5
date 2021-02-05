package Chapter5;
/*5.12 (Calculating the Product of Odd Integers) Write an application that calculates the product of the odd integers
from 1 to 15.*/

public class productOfOddIntegers {
    public static void main(String[] args) {

        int product = 1;
        for (int number = 1; number <= 15; number++) {
            product  *= number;

        }

        System.out.printf("product is %d%n", product);



    }





}

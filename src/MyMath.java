/**
 * Author Sequoyah Schaefer
 * Since 3/13/2023
 * Version 1.0
 */

import java.util.Scanner;

public class MyMath {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        while (num1 != num2) {
            {
                if(num1 > num2)
                    num1 = num1 - num2;
                else
                    num2 = num2 - num1;

            }

            System.out.println(num2);
    }
}
}

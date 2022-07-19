package exam_Ans;

import java.util.Scanner;

public class Ans_Eight {
    static Scanner user_input = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0;
        int totle_prime_number = 0;
        prln("Enter first number 25:");
        int first_number = user_input.nextInt();
        prln("Enter Second number 95:");
        int Second_number = user_input.nextInt();
        prln("prime number count start :");
        for (int i = first_number; i <= Second_number; i++) {
            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                prln(i);
                totle_prime_number++;
            }
            count = 0;

        }
        prln("25~95 totle prime number is:" + totle_prime_number);
    }

    static void prln(Object anyoObject) {
        System.out.println(anyoObject);
    }

}

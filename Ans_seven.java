package exam_Ans;

import java.util.Scanner;

public class Ans_seven {

    static Scanner user_input = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0;
        prln("please enter the integer value:");
        int number = user_input.nextInt();

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            prln("prime");
        } else {
            prln("not prime");
        }
    }

    static void prln(Object anyoObject) {
        System.out.println(anyoObject);
    }

}

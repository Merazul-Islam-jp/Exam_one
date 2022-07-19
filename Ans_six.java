package exam_Ans;

import java.util.Scanner;

public class Ans_six {
    static Scanner user_input = new Scanner(System.in);

    public static void main(String[] args) {
        char ch = user_input.next().toLowerCase().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            prln("Consonant");
        } else {
            prln("Vowel");
        }
    }

    static void prln(Object anyoObject) {
        System.out.println(anyoObject);
    }

}

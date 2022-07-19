package exam_Ans;

public class Ans_four {
    public static void main(String[] args) {
        int num_one = 25;
        int num_two = 35;

        double rem_one = num_one % 9;
        double rem_two = num_two % 9;

        prln(rem_one + rem_two);
        prln(rem_one - rem_two);
        prln(rem_one * rem_two);
        prln(rem_one / rem_two);
    }

    static void prln(Object anyoObject) {
        System.out.println(anyoObject);
    }

}

import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {

            String original = sc.next();
            StringBuilder stringBuilder = new StringBuilder(original);
            String reverse = stringBuilder.reverse().toString();

            System.out.print("#" + tc + " ");

            if(original.equals(reverse)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
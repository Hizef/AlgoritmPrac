import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i != num) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                }
            } else {
                if (num % i == 0) {
                    System.out.println(i);
                }
            }

        }
    }
}
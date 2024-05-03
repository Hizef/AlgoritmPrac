import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();

        for (int i = inputNum; i >= 0; i--) {
            if (i == 0) {
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
        }

    }
}
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        // 1 = Scissors 2 = Rock 3 = Paper
        // 1 < 2, 2 < 3, 3 < 1;

        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int resultNum = 1;

        for (int i = 0; i <= inputNum; i++) {
            if (i <= inputNum - 1) {
                System.out.print(resultNum + " ");
                resultNum = resultNum * 2;
            } else {
                System.out.println(resultNum);
                resultNum = resultNum * 2;
            }
        }

    }
}
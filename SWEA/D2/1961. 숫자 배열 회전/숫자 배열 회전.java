import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        // 입력은 첫 줄에 총 테스트 케이스의 개수 T가 온다.
        // 다음 줄부터 각 테스트 케이스가 주어진다.
        for (int tc = 1; tc <= T; tc++) {
            int arraySize = sc.nextInt();

            int[][] originalArray = new int[arraySize][arraySize];

            for (int i = 0; i < originalArray.length; i++) {
                for (int j = 0; j < originalArray[i].length; j++) {
                    originalArray[i][j] = sc.nextInt();
                }
            }

            System.out.println("#" + tc + " ");

            for (int i = 0; i < originalArray.length; i++) {
                for (int j = 0; j < originalArray[i].length; j++) {
                    System.out.print(originalArray[arraySize - j - 1][i]);
                }
                System.out.print(" ");
                for (int j = 0; j < originalArray[i].length; j++) {
                    System.out.print(originalArray[arraySize - i - 1][arraySize - j - 1]);
                }
                System.out.print(" ");
                for (int j = 0; j < originalArray[i].length; j++) {
                    System.out.print(originalArray[j][arraySize - 1 - i]);
                }
                System.out.println();
            }

        }
    }
}
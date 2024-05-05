import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int inputNum = sc.nextInt();

            // Pascal's Triangle
            int[][] pascal = new int[inputNum][];
            for (int i = 0; i < inputNum; i++) {
                pascal[i] = new int[i+1];

                //각 행의 첫과 끝 숫자는 1
                pascal[i][0] = 1;
                pascal[i][i] = 1;

                // 중간 파스칼
                for (int j = 1; j < i; j++) {
                    pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
                }
            }
            System.out.println("#" + tc);
            // print pascal's triangle
            for (int i = 0; i < pascal.length; i++) {
                for (int j = 0; j < pascal[i].length; j++) {
                    System.out.print(pascal[i][j] + " ");
                }
                System.out.println();
            }

        }

    }
}
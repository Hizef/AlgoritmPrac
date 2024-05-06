import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();


        // 입력은 첫 줄에 총 테스트 케이스의 개수 T가 온다.
        // 다음 줄부터 각 테스트 케이스가 주어진다.
        for (int tc = 1; tc <= T; tc++) {
            // sw ea 1979. 어디에 단어가 들어갈 수 있을까
            int result = 0;
            int arraySize = sc.nextInt();
            int findInputSize = sc.nextInt();

            int[][] arrayMap = new int[arraySize][arraySize];

            for (int i = 0; i < arrayMap.length; i++) {
                for (int j = 0; j < arrayMap[i].length; j++) {
                    arrayMap[i][j] = sc.nextInt();
                }
            }

            // 가로
            for (int i = 0; i < arrayMap.length; i++) {
                int count = 0;
                for (int j = 0; j < arrayMap[i].length; j++) {
                    if (arrayMap[i][j] == 1) {
                        count++;
                    } else {
                        if (count == findInputSize) {
                            result++;
                            count = 0;
                        } else {
                            count = 0;
                        }
                    }
                }
                if (count == findInputSize) {
                    result++;
                }
            }

            // 세로
            for (int i = 0; i < arrayMap.length; i++) {
                int count = 0;
                for (int j = 0; j < arrayMap[i].length; j++) {
                    if (arrayMap[j][i] == 1) {
                        count++;
                    } else {
                        if(count == findInputSize) {
                            result++;
                            count = 0;
                        } else {
                            count = 0;
                        }
                    }
                }
                if (count == findInputSize) {
                    result++;
                }
            }

            System.out.println("#" + tc + " " + result);

        }
    }
}
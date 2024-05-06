import java.util.Arrays;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        // 입력은 첫 줄에 총 테스트 케이스의 개수 T가 온다.
        // 다음 줄부터 각 테스트 케이스가 주어진다.
        for (int tc = 1; tc <= T; tc++) {
            int arraySize = sc.nextInt();
            int[] arrayToSort = new int[arraySize];

            for (int i = 0; i < arrayToSort.length; i++) {
                arrayToSort[i] = sc.nextInt();
            }
            Arrays.sort(arrayToSort);

            System.out.print("#" + tc + " ");
            for (int i = 0; i<arrayToSort.length; i++) {
                System.out.print(arrayToSort[i] + " ");
            }
            System.out.println("");
        }
    }
}
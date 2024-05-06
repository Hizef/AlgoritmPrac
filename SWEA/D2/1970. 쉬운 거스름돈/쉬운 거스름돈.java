import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();


        // 입력은 첫 줄에 총 테스트 케이스의 개수 T가 온다.
        // 다음 줄부터 각 테스트 케이스가 주어진다.
        for (int tc = 1; tc <= T; tc++) {
            System.out.println("#" + tc);

            int totalMoney = sc.nextInt();
            int resultMoney = totalMoney;

            int[] remainMoney = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
            int[] countMoney = new int[8];

            for (int i = 0; i < remainMoney.length; i++) {
                countMoney[i] = resultMoney / remainMoney[i];
                resultMoney = resultMoney % remainMoney[i];
            }

            for (int i = 0; i < remainMoney.length; i++) {
                System.out.print(countMoney[i] + " ");
            }

            System.out.println("");
        }
    }
}
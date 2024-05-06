import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();


        // 입력은 첫 줄에 총 테스트 케이스의 개수 T가 온다.
        // 다음 줄부터 각 테스트 케이스가 주어진다.
        for (int tc = 1; tc <= T; tc++) {

            int firstHour = sc.nextInt();
            int firstMinute = sc.nextInt();

            int secondHour = sc.nextInt();
            int secondMinute = sc.nextInt();

            int sumHour = firstHour + secondHour;
            int sumMinute = firstMinute + secondMinute;

            if (sumMinute >= 60) {
                sumHour += sumMinute/60;
                sumMinute = sumMinute%60;
            }

            if (sumHour > 12) {
                sumHour -= 12;
            }

            System.out.println("#" + tc + " " + sumHour + " " + sumMinute);
        }
    }
}
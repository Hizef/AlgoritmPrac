import java.util.Arrays;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();


        for (int tc = 1; tc <= T; tc++) {
            int maxIndex = 10;
            double[] arrNum = new double[maxIndex];
            double sum = 0;
            double avg = 0;

            for (int i = 0; i < arrNum.length; i++) {
                arrNum[i] = sc.nextInt();
            }
            Arrays.sort(arrNum);

            for (int i = 1; i < arrNum.length - 1; i++) {
                sum += arrNum[i];
            }

            avg = sum / (arrNum.length - 2);
            
            System.out.println("#" + tc + " " + Math.round(avg));
        }
    }
}
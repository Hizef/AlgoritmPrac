import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    static int[] dayArr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static void main(String[] args) throws IOException {
        /*테스트 케이스 받기*/
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        /*
        *
        3
        3 17 1 39 8 41 2 32 99 2
        22 8 5 123 7 2 63 7 3 46
        6 63 2 3 58 76 21 33 8 1
        * */
        for (int tc = 1; tc <=T; tc++) {
            String date = bufferedReader.readLine();

            String year = date.substring(0, 4);
            String month = date.substring(4, 6);
            String day = date.substring(6, 8);

            if(0 == Integer.parseInt(month) || Integer.parseInt(month) > 12) {
                System.out.println("#" + tc + " -1");
            } else if (Integer.parseInt(day)==0 || Integer.parseInt(day)> dayArr[Integer.parseInt(month)-1]) {
                System.out.println("#" + tc + " -1");
            } else {
                System.out.println("#" + tc + " " + year + "/" + month + "/" + day);
            }
        }
    }
}
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int maxNum = sc.nextInt();
        int result = 0;

        for (int i = 1; i <= maxNum; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
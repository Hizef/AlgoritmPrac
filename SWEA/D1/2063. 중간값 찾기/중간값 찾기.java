import java.util.Arrays;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int[] inputArr = new int[inputNum];

        for (int i = 0; i < inputArr.length; i++) {
            inputArr[i] = sc.nextInt();
        }

        Arrays.sort(inputArr);

        int resultIndex = inputNum/2;

        System.out.println(inputArr[resultIndex]);

    }
}
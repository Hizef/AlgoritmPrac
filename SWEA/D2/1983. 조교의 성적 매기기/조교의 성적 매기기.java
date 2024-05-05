import java.util.Arrays;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();


        // 입력은 첫 줄에 총 테스트 케이스의 개수 T가 온다.
        // 다음 줄부터 각 테스트 케이스가 주어진다.
        for (int tc = 1; tc <= T; tc++) {
        // 테스트 케이스의 첫 번째 줄은 학생수 N 과, 학점을 알고싶은 학생의 번호 K 가 주어진다.
            int studentNum = sc.nextInt();
            int findGrade = sc.nextInt();
            int[] grade = new int[studentNum];

        // 테스트 케이스 두 번째 줄 부터 각각의 학생이 받은 시험 및 과제 점수가 주어진다.
            for (int i = 0; i < grade.length; i++) {
                grade[i] = sc.nextInt() * 35 + sc.nextInt() * 45 + sc.nextInt() * 20;
            }

            int findStudent = grade[findGrade - 1];
            // 오름차순
            Arrays.sort(grade);

            int isequalStudent = studentNum / 10;
            System.out.print("#" + tc + " ");
            for (int i = 0; i < grade.length; i++) {
                if(grade[i] == findStudent) {

                    if ((double)(i / isequalStudent) < 1.0) {
                        System.out.println("D0");
                    } else if ((double)(i / isequalStudent) < 2.0) {
                        System.out.println("C-");
                    } else if ((double)(i / isequalStudent) < 3.0) {
                        System.out.println("C0");
                    } else if ((double)(i / isequalStudent) < 4.0) {
                        System.out.println("C+");
                    } else if ((double)(i / isequalStudent) < 5.0) {
                        System.out.println("B-");
                    } else if ((double)(i / isequalStudent) < 6.0) {
                        System.out.println("B0");
                    } else if ((double)(i / isequalStudent) < 7.0) {
                        System.out.println("B+");
                    } else if ((double)(i / isequalStudent) < 8.0) {
                        System.out.println("A-");
                    } else if ((double)(i / isequalStudent) < 9.0) {
                        System.out.println("A0");
                    } else {
                        System.out.println("A+");
                    }
                }


            }
        }
    }
}
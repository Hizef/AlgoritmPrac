import java.util.Scanner;
public class Solution {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int num=sc.nextInt();
            System.out.println("#"+test_case);
            String a[]=new String[num];
            int arr[]=new int[num];
            int tot=0;
            for(int i=0;i<num;i++){
                a[i]=sc.next();
                arr[i]=sc.nextInt();
                tot+=arr[i];
            }
            String []str=new String[tot];
            int count=0;
            for(int i=0;i<num;i++){
                for(int j=0;j<arr[i];j++){
                    str[count]=a[i];
                    count++;
                }
            }
            for(int i=0;i<count;i++){
                if(i!=0&&i%10==0){
                    System.out.println();   
                }
                System.out.print(str[i]);
            }
            System.out.println();
        }
    }
}
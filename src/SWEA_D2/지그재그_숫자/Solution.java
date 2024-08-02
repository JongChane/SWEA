package SWEA_D2.지그재그_숫자;
import java.util.Scanner;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for(int i = 1; i <= T; i++) {
            int num = 0;
            int N = sc.nextInt();
            for (int j = 1; j <= N ; j++) {
                if(j % 2 == 0) {
                    num -= j;
                } else {
                    num += j;
                }
            }
            System.out.println("#" + i + " " + num );
        }
        sc.close();
    }
}
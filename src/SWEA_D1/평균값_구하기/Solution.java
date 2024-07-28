package SWEA_D1.평균값_구하기;
import java.util.Scanner;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        int[] nums = new int[10];
        int p = 0;
        for(int test_case = 1; test_case <= T; test_case++) {
            for(int i = 0; i < 10; i++) {
                nums[i] = sc.nextInt();
                p += nums[i];
            }
            int m = Math.round((float) p / nums.length);
            System.out.println("#"+test_case+" "+m);
            p = 0;
        }
    }
}
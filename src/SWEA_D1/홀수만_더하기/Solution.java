package SWEA_D1.홀수만_더하기;
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
                if(nums[i]%2 ==1) {
                    p += nums[i];
                }
            }
            System.out.println("#"+test_case+" "+p);
            p = 0;
        }
    }
}
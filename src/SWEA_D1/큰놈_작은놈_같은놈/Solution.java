package SWEA_D1.큰놈_작은놈_같은놈;
import java.util.Scanner;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a>b) {
                System.out.println("#"+test_case+" >");
            } else if (a<b) {
                System.out.println("#"+test_case+" <");
            } else {
                System.out.println("#"+test_case+" =");
            }
        }
    }
}
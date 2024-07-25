package SWEA_D1.몫과_나머지_출력하기;
import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T;
        T = sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int quo = num1 / num2;
            int rem = num1 % num2;
            sb.append("#"+test_case+" "+quo+" "+rem+"\n");
        }
        System.out.println(sb);
    }
}

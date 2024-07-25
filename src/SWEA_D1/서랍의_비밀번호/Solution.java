package SWEA_D1.서랍의_비밀번호;
import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(P-K+1);
    }
}

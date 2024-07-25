package SWEA_D1.더블더블;/////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int num = 1;
        StringBuilder output = new StringBuilder();
        output.append(num);
        for(int i = 1 ; i <= T; i++) {
            num = num * 2;
            output.append(" ").append(num);
        }
        System.out.println(output);
    }
}
package SWEA_D1.거꾸로_출력해_보아요;

import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        // System.setIn(new FileInputStream("res/input.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = T ; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.print(0);
    }
}
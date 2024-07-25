package SWEA_D1.아주_간단한_계산기;
import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        // System.setIn(new FileInputStream("res/input.txt"));
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num = 0;
        for (int i = 1; i <= a; i++) {
            num += i;
        }
        System.out.println(num);
    }
}

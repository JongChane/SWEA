package SWEA_D1.자릿수_더하기;
import java.util.Scanner;

class Solution
{
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        String[] arr = t.split("");
        int num = 0;
        for (String s : arr) {
            num += Integer.parseInt(s);
        }
        System.out.println(num);
    }
}
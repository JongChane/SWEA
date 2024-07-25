package SWEA_D1.연월일_달력;
import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String ymdStr;
        int ymd;
        String yyyyStr;
        int yyyy;
        String mmStr;
        int mm;
        String ddStr;
        int dd;
        for(int tast_case = 1; tast_case <= T; tast_case++) {
            int input = sc.nextInt();
            ymd = input;
            ymdStr = Integer.toString(input);
            yyyy = DMY.substring(0,4);
            mm = DMY.substring(4,6);
            dd = DMY.substring(6,8);
        }
    }
}


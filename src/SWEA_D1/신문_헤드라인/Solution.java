package SWEA_D1.신문_헤드라인;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String t = sc.next();
        String[] al = t.split("");
        int[] result = new int[al.length];
        for(int i = 0; i < al.length; i++) {
            int resultNum = al[i].charAt(0);
            result[i] = resultNum-64;
            sb.append(result[i]+" ");
        }
        System.out.println(sb);
    }
}

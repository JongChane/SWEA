package SWEA_D1.최대수_구하기;
import java.util.Arrays;
import java.util.Scanner;

class Solution
{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[10];
        for(int i = 1; i <= T; i++) {
            for(int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println("#"+i+" "+arr[9]);
        }
    }
}
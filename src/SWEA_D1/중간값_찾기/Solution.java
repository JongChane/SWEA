package SWEA_D1.중간값_찾기;
import java.util.Arrays;
import java.util.Scanner;

class Solution
{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int answer = arr[arr.length / 2];
        System.out.println(answer);
    }
}
package SWEA_D2.백만_장자_프로젝트;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int tc = 1; tc <= t; tc++) {
            int n = sc.nextInt();
            int[] prices = new int[n];

            for (int i = 0; i < n; i++) {
                prices[i] = sc.nextInt();
            }

            long maxProfit = 0;
            int maxFuturePrice = 0;

            for (int i = n - 1; i >= 0; i--) {
                if (prices[i] > maxFuturePrice) {
                    maxFuturePrice = prices[i];
                }
                maxProfit += maxFuturePrice - prices[i];
            }

            System.out.println("#" + tc + " " + maxProfit);
        }
        sc.close();
    }
}

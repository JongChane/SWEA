package SWEA_D1.간단한_N의_약수;

import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        // System.setIn(new FileInputStream("res/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        int sqrt = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrt ; i++) {
            if (n % i == 0) {
                arr.add(i); // i는 약수
                if (i != n / i) {
                    arr.add(n / i);
                }
            }
        }
        arr.sort(Integer::compareTo);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.size(); i++) {
            sb.append(arr.get(i));
            if (i < arr.size() - 1) {
                sb.append(" "); // 마지막 요소 뒤에는 공백을 추가하지 않음
            }
        }

        // 최종 결과 출력
        System.out.println(sb);
    }
}
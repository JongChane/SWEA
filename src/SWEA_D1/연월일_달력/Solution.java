package SWEA_D1.연월일_달력;
import java.util.Scanner;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= tc; i++) {
            String ymd = sc.next();
            String strY = ymd.substring(0,4);
            String strM = ymd.substring(4,6);
            String strD = ymd.substring(6,8);
            int m = Integer.parseInt(strM);
            int d = Integer.parseInt(strD);
            boolean isValid = true;
            if (strY.equals("0000") || strM.equals("00") || strD.equals("00")) {
                isValid = false;
            }
            if (m > 12 || m == 0) {
                isValid = false;
            }
            if (m == 2 && d > 28) {
                isValid = false;
            }
            if (m == (4 | 6 | 9 | 11) && d > 30) {
                isValid = false;
            }
            if (d > 31 || d == 0) {
                isValid = false;
            }
            if (isValid == true) sb.append("#"+ i + " " + strY+"/"+strM+"/"+strD+"\n");
            else sb.append("#"+ i + " -1"+"\n");
        }
        System.out.println(sb);
    }
}
package SWEA_D1.대각선_출력하기;
class Solution
{
    public static void main(String args[]) throws Exception
    {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=5; j++) {
                if( i != j ) {
                    System.out.print("+");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println("");
        }
    }
}
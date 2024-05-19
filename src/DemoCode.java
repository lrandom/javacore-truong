import java.util.Scanner;

public class DemoCode {
    public static void main(String[] args) {
        /*String provinces[] = new String[64];
        provinces[0] = "Ha Noi";
        provinces[1] = "Hai Phong";
        provinces[2] = "QN";*/

    /*    String provinces[] = new String[]{
                "Ha Noi", "Hai Phong", "QN"
        };*/

        //Toan, Van, Anh
     /*   int num[][] = new int[2][3];
        num[0][0] = 8;
        num[0][1] = 9;
        num[0][2] = 10;
        num[1][0] = 7;
        num[1][1] = 8;
        num[1][2] = 9;
*/

        int num[][] = new int[][]{
                {8, 9, 10},
                {7, 8, 9}
        };
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]);
            }
            System.out.printf("%n");
        }

        for (int[] row : num) {
            for (int col : row) {
                System.out.print(col);
            }
            System.out.printf("%n");
        }
    }
}

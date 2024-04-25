
import java.util.*;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] numbers = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)

            {
                numbers[i][j] = sc.nextInt();
            }

        }
        int x = sc.nextInt();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("no is:(" + i + "," + j + ")");
                }

            }

        }

    }

}
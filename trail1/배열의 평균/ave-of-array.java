import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][4];

        double sum = 0;
        for(int i=0; i<2; i++) {
            double row = 0;
            for(int j=0; j<4; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
                row += arr[i][j];
            }
            System.out.printf("%.1f ", row / 4);
        }
        System.out.println();

        for(int i=0; i<4; i++) {
            double col = 0;
            for(int j=0; j<2; j++) {
                col += arr[j][i];
            }
            System.out.printf("%.1f ", col / 2);
        }
        System.out.println();

        System.out.printf("%.1f", sum / 8);
    }
}
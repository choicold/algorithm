import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rect1_x1 = sc.nextInt() + 1000;
        int rect1_y1 = sc.nextInt() + 1000;

        int rect1_x2 = sc.nextInt() + 1000;
        int rect1_y2 = sc.nextInt() + 1000;
        
        int rect2_x1 = sc.nextInt() + 1000;
        int rect2_y1 = sc.nextInt() + 1000;
        
        int rect2_x2 = sc.nextInt() + 1000;
        int rect2_y2 = sc.nextInt() + 1000;
        // Please write your code here.

        int[][] arr = new int[2001][2001];

        for(int i=rect1_x1; i<rect1_x2; i++) {
            for(int j=rect1_y1; j<rect1_y2; j++) {
                arr[i][j] = 1;
            }
        }

        for(int i=rect2_x1; i<rect2_x2; i++) {
            for(int j=rect2_y1; j<rect2_y2; j++) {
                if(arr[i][j] == 1) arr[i][j] = 0;
            }
        }

        int[] x = new int[2];
        int[] y = new int[2];

        // 만약 다 덮여서 최소 직사각형이 필요없다면?
        int flag = 0;
        for(int i=rect1_x1; i<rect1_x2; i++) {
            for(int j=rect1_y1; j<rect1_y2; j++) {
                if(flag == 0 && arr[i][j] == 1) {
                    x[0] = i;
                    y[0] = j;
                    flag = 1;
                } else if(flag == 1 && arr[i][j] == 1) {
                    if(x[1] < i) x[1] = i;
                    if(y[1] < j) y[1] = j;
                }
            }
        }

        if(flag == 0) System.out.println(0);
        else System.out.println((x[1] - x[0] + 1) * (y[1] - y[0] + 1));
    }
}
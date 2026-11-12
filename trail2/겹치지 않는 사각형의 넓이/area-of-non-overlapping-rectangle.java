import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int offset = 1000;
        int ax1 = sc.nextInt() + offset;
        int ay1 = sc.nextInt() + offset;
        int ax2 = sc.nextInt() + offset;
        int ay2 = sc.nextInt() + offset;

        int bx1 = sc.nextInt() + offset;
        int by1 = sc.nextInt() + offset;
        int bx2 = sc.nextInt() + offset;
        int by2 = sc.nextInt() + offset;

        int mx1 = sc.nextInt() + offset;
        int my1 = sc.nextInt() + offset;
        int mx2 = sc.nextInt() + offset;
        int my2 = sc.nextInt() + offset;
        // Please write your code here.

        
        int[][] arr = new int[2001][2001];

        for(int i=ax1; i<ax2; i++) {
            for(int j=ay1; j<ay2; j++) {
                arr[i][j] = 1;
            }
        }

        for(int i=bx1; i<bx2; i++) {
            for(int j=by1; j<by2; j++) {
                arr[i][j] = 1;
            }
        }

        for(int i=mx1; i<mx2; i++) {
            for(int j=my1; j<my2; j++) {
                arr[i][j] = 0;
            }
        }

        int maxx = ax2 > bx2 ? ax2 : bx2;
        int maxy = ay2 > by2 ? ay2 : by2;

        int minx = ax1 > bx1 ? bx1 : ax1;
        int miny = ay1 > by1 ? by1 : ay1; 

        int sum = 0;
        for(int i=minx; i<=maxx; i++) {
            for(int j=miny; j<=maxy; j++) {
                if(arr[i][j] == 1) sum++;
            }
        }

        System.out.println(sum);
    }
}
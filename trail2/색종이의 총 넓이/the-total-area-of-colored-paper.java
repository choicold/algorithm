import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt() + 100;
            y[i] = sc.nextInt() + 100;
        }
        // Please write your code here.
        int[][] arr = new int[201][201];

        for(int i=0; i<n; i++) {
            for(int j=x[i]; j<x[i]+8; j++) {
                for(int k=y[i]; k<y[i]+8; k++) {
                    arr[j][k] = 1;
                }
            }
        }

        int sum = 0;
        for(int i=0; i<201; i++) {
            for(int j=0; j<201; j++) {
                if(arr[i][j] == 1) sum++;
            }
        }

        System.out.println(sum);
    }
}
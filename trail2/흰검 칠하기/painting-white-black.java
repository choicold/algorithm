import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        char[] dir = new char[n];
        int[] white = new int[200001];
        int[] black = new int[200001];
        char[] arr = new char[200001];

        int idx = 100000;
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            dir[i] = sc.next().charAt(0);

            if(dir[i] == 'L') {
                x[i] = idx - x[i];
                for(int j=idx; j>x[i]; j--) {
                    white[j]++;
                    arr[j] = 'W';
                }
                idx = x[i] + 1;
            } else {
                x[i] += idx;
                for(int j=idx; j<x[i]; j++) {
                    black[j]++;
                    arr[j] = 'B';
                }
                idx = x[i] - 1;
            }
        }

        // 흰 검 회
        int[] color = new int[3];
        for(int i=0; i<200001; i++){
            int cnt = white[i] + black[i];
            if(0 < cnt && cnt < 4) {
                if(arr[i] == 'W') color[0]++;
                else color[1]++;
            } else if(cnt >= 4) {
                if(white[i] >= 2 && black[i] >= 2) color[2]++;
                else if(arr[i] == 'W') color[0]++;
                else color[1]++;
            }
        }

        System.out.printf("%d %d %d", color[0], color[1], color[2]);
        // Please write your code here.

    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int offset = 1000;
        int[] arr = new int[2001];

        int start = 0;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            // Please write your code here.
            if(dir == 'L') {
                for(int j=start+offset; j>start+offset-x; j--) {
                    arr[j-1]++;
                }

                start -= x;
            } else {
                for(int j=start+offset; j<start+offset+x; j++) {
                    arr[j]++;
                }

                start += x;
            }
        }

        int cnt = 0;
        for(int i=0; i<2001; i++) {
            if(arr[i] > 1) cnt++;
        }

        System.out.println(cnt);
    }
}
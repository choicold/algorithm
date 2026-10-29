import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        int cnt = 0;
        int idx = -1;

        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] == 2) {
                cnt++;
                if(cnt == 3) idx = i+1;
            }
        }

        System.out.println(idx);
    }
}
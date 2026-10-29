import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N1 = sc.nextInt();
        int N2 = sc.nextInt();

        int[] A = new int[N1];
        int[] B = new int[N2];

        int idx = -1;

        for(int i=0; i<N1; i++) {
            A[i] = sc.nextInt();
        }

        for(int i=0; i<N2; i++) {
            B[i] = sc.nextInt();
        }

        for(int i=0; i<=N1 - N2; i++) {
            int cnt = 0;
            for(int j=0; j<N2; j++) {
                if(A[i + j] == B[j]) cnt++;
                else break;
            }
            if(cnt == N2) idx = 1;
        }

        System.out.println(idx == -1 ? "No" : "Yes");
    }
}
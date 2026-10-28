import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<Q; i++) {
            int input = sc.nextInt();
            
            if(input == 1) {
                int a = sc.nextInt();
                System.out.println(arr[a-1]);
            } else if(input == 2) {
                int idx = -1;
                int b = sc.nextInt();
                for(int j=0; j<N; j++) {
                    if(arr[j] == b) {
                        idx = j+1;
                        break;
                    }
                }
                System.out.println(idx == -1 ? 0 : idx);

            } else if(input == 3) {
                int s = sc.nextInt();
                int e = sc.nextInt();

                for(int j=s-1; j<e; j++) {
                    if(j != e-1) System.out.print(arr[j] + " ");
                    else System.out.println(arr[j]);
                }
            }
        }

    }
}
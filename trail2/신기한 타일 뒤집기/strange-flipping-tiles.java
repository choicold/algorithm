import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] c = new char[200001];

        int idx = 100000;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            if(d == 'L') {
                x = idx - x;

                for(int j=idx; j>x; j--) {
                    c[j] = 'W';
                }

                idx = x + 1;
            } else {
                x += idx;

                for(int j=idx; j<x; j++) {
                    c[j] = 'B';
                }

                idx = x - 1;
            }
        }
        // Please write your code here.
        int white = 0; int black = 0;
        for(int i=0; i<200001; i++) {
            if(c[i] == 'W') white++;
            else if(c[i] == 'B') black++;
        }

        System.out.println(white + " " + black);
    }
}
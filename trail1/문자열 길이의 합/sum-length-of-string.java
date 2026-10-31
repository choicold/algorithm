import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        int cnt = 0; int sum = 0;
        for(int i=0; i<N; i++) {
            String s = sc.next();
            sum += s.length();
            if(s.charAt(0) == 'a') cnt++;
        }

        System.out.printf("%d %d", sum, cnt);
    }
}
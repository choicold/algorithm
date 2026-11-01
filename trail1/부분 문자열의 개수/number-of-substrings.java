import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int sum = 0;
        for(int i=0; i<A.length() - B.length() + 1; i++) {
            int cnt = 0;
            for(int j=0; j<B.length(); j++) {
                if(A.charAt(i+j) != B.charAt(j)) break;
                cnt++;
            }
            if(cnt == B.length()) sum++;
        }

        System.out.println(sum);
    }
}
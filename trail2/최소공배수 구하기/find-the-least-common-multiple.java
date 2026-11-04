import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        func(n, m);
    }

    public static void func(int n, int m) {
        // 최대 공약수 x 몫 x 몫
        for(int i=n > m ? m : n; i>=1; i--) {
            if(n % i == 0 && m % i == 0) {
                System.out.println(i * (n/i) * (m/i));    
                break;
            }
        }
    }
}
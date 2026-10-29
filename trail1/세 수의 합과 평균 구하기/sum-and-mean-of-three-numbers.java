import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A, B, C;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        System.out.printf("%d\n%d", A+B+C, (A+B+C)/3);
    }
}
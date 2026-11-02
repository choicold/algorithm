import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        while(A.indexOf(B) != -1) {
            A = A.substring(0, A.indexOf(B)) + A.substring(A.indexOf(B)+B.length(), A.length());
        }

        System.out.println(A);
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.
        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int result1 = 0; int result2 = 0;

        for(int i=1; i<m1; i++) {
            result1 += days[i];
        }
        result1 += d1;

        for(int i=1; i<m2; i++) {
            result2 += days[i];
        }
        result2 += d2;

        System.out.println(result2 - result1 + 1);

    }
}
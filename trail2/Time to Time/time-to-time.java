import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        int result = 0;

        if(b <= d) {
            result = d - b;
        } else {
            result = d + 60 - b; 
            c -= 1;
        }

        result += (c - a) * 60;

        System.out.println(result);
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.
        int min = 0;
        
        if(C >= 11) {
            min = C - 11;
        } else {
            min = C - 11 + 60;
            B -= 1;
        }

        if(B >= 11) {
            min += (B - 11) * 60;
        } else {
            min += (B - 11 + 24) * 60;
            A -= 1; 
        }

        min += (A - 11) * 24 * 60;
        if(min >= 0) {
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
        
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt() + 8;
        int col = sc.nextInt() * 3;
    
        System.out.printf("%d\n%d\n%d", row, col, row * col);
    }
}
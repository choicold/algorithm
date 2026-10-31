import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String[] str = new String[10];

        int sum = 0;
        for(int i=0; i<10; i++) {
            str[i] = sc.next();
            sum += str[i].length();
        }

        System.out.println(sum);
    }
}
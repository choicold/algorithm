import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String[] s = sc.next().split("-");
        System.out.printf("%s%s", s[0], s[1]);
    }
}
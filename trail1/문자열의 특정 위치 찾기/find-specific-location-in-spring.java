import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String s = sc.next();

        if(str.contains(s)) {
            System.out.println(str.indexOf(s));
        } else System.out.println("No");
    }
}
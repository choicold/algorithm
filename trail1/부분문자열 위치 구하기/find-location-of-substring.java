import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String subStr = sc.next();

        if(str.contains(subStr)) {
            System.out.println(str.indexOf(subStr));
        } else System.out.println(-1);
    }
}
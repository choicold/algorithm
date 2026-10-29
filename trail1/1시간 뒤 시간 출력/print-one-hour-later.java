import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String[] time = sc.next().split(":");
        int h = Integer.parseInt(time[0]) + 1;
        System.out.printf("%d:%s", h, time[1]);
    }
}
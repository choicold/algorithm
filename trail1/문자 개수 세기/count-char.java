import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        String s = sc.nextLine();
        char c = sc.next().charAt(0);

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == c) cnt++;
        }

        System.out.println(cnt);
    }
}
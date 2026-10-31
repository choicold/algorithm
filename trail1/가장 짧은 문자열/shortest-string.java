import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int max = 0, min = 20;

        for(int i=0; i<3; i++) {
            String s = sc.next();
            
            if(s.length() > max) max = s.length();

            if(s.length() < min) min = s.length();
        }

        System.out.println(max - min);
    }
}
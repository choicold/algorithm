import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String[] str = new String[10];
        for(int i=0; i<10; i++) {
            str[i] = sc.next();
        }

        char c = sc.next().charAt(0);

        int idx = -1;
        for(int i=0; i<10; i++) {
            if(str[i].charAt(str[i].length()-1) == c) {
                idx++;
                System.out.println(str[i]);
            }
        }

        if(idx == -1) System.out.println("None");
    }
}
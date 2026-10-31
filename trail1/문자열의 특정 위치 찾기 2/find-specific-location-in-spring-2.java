import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String[] str = new String[]{"apple", "banana", "grape", "blueberry", "orange"};

        char c = sc.next().charAt(0);

        int cnt = 0;
        for(int i=0; i<5; i++) {
            if(str[i].charAt(2) == c || str[i].charAt(3) == c) {
                cnt++;
                System.out.println(str[i]);
            }
        }

        System.out.println(cnt);
    }
}
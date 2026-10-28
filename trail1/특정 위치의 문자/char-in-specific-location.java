import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        char[] word = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        Scanner sc = new Scanner(System.in);
        
        int idx = -1;
        char c = sc.next().charAt(0);
        for(int i=0; i<word.length; i++) {
            if(word[i] == c) {
                idx = i;
                break;
            }
        }

        System.out.println(idx == -1 ? "None" : idx);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int Q = sc.nextInt();

        for(int i=0; i<Q; i++) {
            int req = sc.nextInt();
            
            if(req == 1) {
                str = str.substring(1, str.length()) + str.charAt(0);
                System.out.println(str);
            } else if(req == 2) {
                str = str.charAt(str.length()-1) + str.substring(0, str.length()-1);
                System.out.println(str);
            } else {
                char[] c = str.toCharArray();
                char[] arr = new char[str.length()];
                for(int j=str.length()-1; j>=0; j--) {
                    arr[str.length()-1 - j] = c[j]; 
                }
                str = String.valueOf(arr);
                System.out.println(str);
            }
        }
    }
}
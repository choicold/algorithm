import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.

        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weekends = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int result1 = d1; int result2 = d2;

        for(int i=1; i<m1; i++){
            result1 += days[i];
        }

        for(int i=1; i<m2; i++){
            result2 += days[i];
        }

        int result = result2 - result1;

        if(result >= 0) {
            result %= 7;
            System.out.println(weekends[result]);
        } else {
            result = (result + 1) * -1 % 7;
            result = 6 - result;
            System.out.println(weekends[result]);
        }
    }
}
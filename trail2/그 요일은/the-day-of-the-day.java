import java.util.Scanner;

public class Main {
    public static int totalDays(int m, int d) {
        int[] days = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int totalDays = d;
        for(int i=1; i<m; i++) {
            totalDays += days[i];            
        }

        return totalDays;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        // Please write your code here.
        String[] weekends = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int day = totalDays(m2, d2) - totalDays(m1, d1);
        int result = day / 7;
        
        for(int i=0; i<=day % 7; i++) {
            if(weekends[i].equals(A)) result += 1;
        }

        System.out.println(result);
    }
}
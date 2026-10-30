import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        double avg = 0;
        int[] arr = new int[10];
        
        for(int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] < 250) sum += arr[i];
            else {
                avg = (double)sum / i;
                break;
            }

            if(i == 9) avg = (double)sum / 10;
        }

        System.out.printf("%d %.1f", sum, avg);
    }
}
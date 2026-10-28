import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i=1; i<10; i+=2) {
            sum += arr[i];
        }

        double avg = 0;
        int count = 0;
        for(int i=2; i<10; i+=3) {
            avg += arr[i];
            count++;
        }
        avg /= count;

        System.out.printf("%d %.1f", sum, avg);
    }
}
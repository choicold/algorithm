import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        int N = sc.nextInt();
        double[] score = new double[N];

        for(int i=0; i<N; i++) {
            score[i] = sc.nextDouble();
            sum += score[i];
        }

        double avg = sum / N;

        System.out.printf("%.1f\n", avg);

        if(avg >= 4.0) System.out.println("Perfect");
        else if(avg >= 3.0) System.out.println("Good");
        else System.out.println("Poor");
    }
}
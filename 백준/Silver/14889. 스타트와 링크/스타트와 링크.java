import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] arr;
    static int[] star, link;
    static int min = 9000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        
        arr = new int[N+1][N+1];

        star = new int[N/2];
        link = new int[N/2];
        

        for(int i=1; i<=N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 1);
        System.out.print(min);
    }
    // nCn/2와 nP2를 섞은 문제임.
    // 나뉘는 두 팀을 nP2로 계산하고 차이를 미니멈으로 놓고 그 미니멈이 가장 작은 것을 반환하면 됨.
    static void dfs(int depth, int start) {
        if(depth == N/2) {
            int k = 0;
            for(int i=1; i<=N; i++) {
                boolean isStar = false;
                for(int j=0; j<N/2; j++) {
                    if(star[j] == i) isStar = true;
                }

                if(isStar) {
                    isStar = false;
                    continue;
                } else {
                    link[k] = i;
                    k++;
                }
            }

            int starSum = 0;
            int linkSum = 0;

            for(int i=0; i<N/2; i++) {
                for(int j=0; j<N/2; j++) {
                    if(i == j) continue;
                    starSum += arr[star[i]][star[j]];
                    linkSum += arr[link[i]][link[j]];
                }
            }

            min = min > Math.abs(starSum - linkSum) ? Math.abs(starSum - linkSum) : min;
            return;
        }

        for(int i=start; i<=N; i++) {
            star[depth] = i;
            dfs(depth+1, i+1);
        }    
    }
}
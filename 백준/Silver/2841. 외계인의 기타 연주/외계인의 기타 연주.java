import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = 0;

        int N = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        Deque<Integer>[] stack = new ArrayDeque[7];
        for(int i=0; i<7; i++) stack[i] = new ArrayDeque<>();

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());

            while(!stack[n].isEmpty() && stack[n].peek() > p) {
                stack[n].pop();
                cnt++;
            }

            if(!stack[n].isEmpty() && stack[n].peek() == p) continue;
            
            stack[n].push(p);
            cnt++;
        }

        System.out.println(cnt);
    }
}
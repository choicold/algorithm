import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
        int cnt = 0;
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            String s = br.readLine();
            Deque<Character> stack = new ArrayDeque<>();
            for(int j=s.length()-1; j>=0; j--) {			
                if(!stack.isEmpty() && stack.peek() == s.charAt(j)) {
                    stack.pop();
                } else {
                    stack.push(s.charAt(j));
                }
            }
            if(stack.isEmpty()) cnt++;
        }

        System.out.println(cnt);
    }
}
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        Deque<Character> stack = new ArrayDeque<>();

        int cnt = 0;
        stack.push(str.charAt(0));

        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i-1) == '(' && str.charAt(i) == ')') {
                stack.pop();
                cnt += stack.size();
            } else if(!stack.isEmpty() && str.charAt(i) == ')') {
                stack.pop();
                cnt += 1;
            } else stack.push(str.charAt(i));
        }

        System.out.print(cnt);
    }
}
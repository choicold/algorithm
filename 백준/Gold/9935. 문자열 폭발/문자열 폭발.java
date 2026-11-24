import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String bomb = br.readLine();
        int n = bomb.length();
        char c = bomb.charAt(n - 1);

        StringBuilder st = new StringBuilder();

        for(int i=0; i<str.length(); i++) {
            st.append(str.charAt(i));
            int len = st.length();

            if(len >= n && str.charAt(i) == c) {
                boolean isTrue = true;
                for(int j=0; j<n; j++) {
                    if(st.charAt(len - n + j) != bomb.charAt(j)) {
                        isTrue = false;
                        break;
                    }
                }
                if(isTrue) {
                    st.setLength(len - n);
                }
            }
        }

        if(st.length() == 0) System.out.print("FRULA");
        else System.out.print(st);
    }
}
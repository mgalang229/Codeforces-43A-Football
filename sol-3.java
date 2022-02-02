import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        FastReader in = new FastReader();
        int n = in.nextInt();
        String[] s = new String[n];
        HashMap<String, Integer> mp = new HashMap<String, Integer>();
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
        	s[i] = in.next();
        	mp.put(s[i], mp.getOrDefault(s[i], 0) + 1);
        	mx = Math.max(mx, mp.get(s[i]));
        }
        for (int i = 0; i < n; i++) {
        	if (mp.get(s[i]) == mx) {
        		System.out.println(s[i]);
        		break;
        	}
        }
    }
	
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        
        int nextInt() {
            return Integer.parseInt(next());
        }
        
        long nextLong() {
            return Long.parseLong(next());
        }
        
        double nextDouble() {
            return Double.parseDouble(next());
        }
        
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}

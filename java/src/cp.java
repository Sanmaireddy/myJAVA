import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class cp {

    static long mod = Long.MAX_VALUE;
    static OutputStream outputStream = System.out;
    static PrintWriter out = new PrintWriter(outputStream);
    static FastReader f = new FastReader();

    public static void main(String[] args) {
        int t = f.nextInt();

        while(t-- > 0){
            solve();
        }



        out.close();
}
    public static void solve() {
        int n = f.nextInt();
        int x[] = f.nextArray(n);
        int t[] = f.nextArray(n);

        // ArrayList<Integer> arrli = new ArrayList<>();
        // for(int i = 0; i < n; i++) {
        //     arrli.add(x[i]+t[i]);
        //     arrli.add(x[i]-t[i]);
        // }
        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;

        // for(int i = 0; i < arrli.size(); i++) {
        //     max = max(max, arrli.get(i));
        //     min = min(min, arrli.get(i));
        // }

        // double ans = ((double)max+(double)min)/2;

        // out.println(ans);


        int i = 0;
        int j = Integer.MAX_VALUE;
        int minT = j;

        while(j >= i) {
            int currT = i + (j-i)/2;

            int left = -1;
            int right = Integer.MAX_VALUE;
            for(int ind = 0; ind < n; ind++) {
                if(currT < t[ind]) {
                    left = Integer.MAX_VALUE;
                    right = -1;
                    break;
                } else {
                    left = max(left, x[ind]-(currT-t[ind]));
                    right = min(right, x[ind]+(currT-t[ind]));
                }
            }

            if(right >= left) {
                j = currT-1;
                minT = currT;
            } else {
                i = currT+1;
            }
        }


        int left = -1;
        int right = Integer.MAX_VALUE;
        for(int ind = 0; ind < n; ind++) {
            left = max(left, x[ind]-(minT-t[ind]));
            right = min(right, x[ind]+(minT-t[ind]));
        }

        double ans = ((double)left + (double)right)/2;
        out.println(ans);


    }






    // Sort an array
    public static void sort(int arr[]) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i: arr) {
            al.add(i);
        }
        Collections.sort(al);
        for(int i = 0; i < arr.length; i++) {
            arr[i] = al.get(i);
        }
    }

    // Find all divisors of n
    public static void allDivisors(int n) {
        for(int i = 1; i*i <= n; i++) {
            if(n%i == 0) {
                System.out.println(i + " ");
                if(i != n/i) {
                    System.out.println(n/i + " ");
                }
            }
        }
    }

    // Check if n is prime or not
    public static boolean isPrime(int n) {
        if(n < 1) return false;
        if(n == 2 || n == 3) return true;
        if(n % 2 == 0 || n % 3 == 0) return false;
        for(int i = 5; i*i <= n; i += 6) {
            if(n % i == 0 || n % (i+2) == 0) {
                return false;
            }
        }
        return true;
    }

    // Find gcd of a and b
    public static long gcd(long a, long b) {
        long dividend = a > b ? a : b;
        long divisor =  a < b ? a : b;

        while(divisor > 0) {
            long reminder = dividend % divisor;
            dividend = divisor;
            divisor = reminder;
        }
        return dividend;
    }

    // Find lcm of a and b
    public static long lcm(long a, long b) {
        long lcm = gcd(a, b);
        long hcf = (a * b) / lcm;
        return hcf;
    }

    // Find factorial in O(n) time
    public static long fact(int n) {
        long res = 1;
        for(int i = 2; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    // Find power in O(logb) time
    public static long power(long a, long b) {
        long res = 1;
        while(b > 0) {
            if((b&1) == 1) {
                res = (res * a)%mod;
            }
            a = (a * a)%mod;
            b >>= 1;
        }
        return res;
    }

    // Find nCr
    public static long nCr(int n, int r) {
        if(r < 0 || r > n) {
            return 0;
        }
        long ans = fact(n) / (fact(r) * fact(n-r));
        return ans;
    }

    // Find nPr
    public static long nPr(int n, int r) {
        if(r < 0 || r > n) {
            return 0;
        }
        long ans = fact(n) / fact(r);
        return ans;
    }


    // sort all characters of a string
    public static String sortString(String inputString) {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    // User defined class for fast I/O
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
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        boolean hasNext() {
            if (st != null && st.hasMoreTokens()) {
                return true;
            }
            String tmp;
            try {
                br.mark(1000);
                tmp = br.readLine();
                if (tmp == null) {
                    return false;
                }
                br.reset();
            } catch (IOException e) {
                return false;
            }
            return true;
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

        float nextFloat() {
            return Float.parseFloat(next());
        }

        boolean nextBoolean() {
            return Boolean.parseBoolean(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        int[] nextArray(int n) {
            int[] a = new int[n];
            for(int i=0; i<n; i++) {
                a[i] = nextInt();
            }
            return a;
        }
    }

}

import java.io.*;
class TestClass {
    static int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }

    static int countGCD(int L, int R, int g) {
        L=(L + g - 1) / g;
        R=R / g;
        int ans=0;
        for(int i=L; i <= R; i++)
            for(int j=L; j <= R; j++)
                if(gcd(i, j) == 1) ans++;

        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 3;
        String s= br.readLine();
        int[] arr= new int[num];
        String[] s1 = s.split(" ");
        for(int i=0;i<num;i++)
        {
            arr[i]=Integer.parseInt(s1[i]);
        }
        int L=arr[0], R=arr[1], g=arr[2];
        System.out.println(countGCD(L, R, g));
    }
}
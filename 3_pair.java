public class Main {

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
    public static void main(String[] args) {
        int L=1, R=11, g=5;
        System.out.println(countGCD(L, R, g));
    }
}
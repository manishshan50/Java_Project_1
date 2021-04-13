import java.io.BufferedReader;
import java.io.InputStreamReader;
 
 
class TestClass {
 
    public static void main(String args[] ) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(br.readLine());
	    while(t-->0){
            int n=Integer.parseInt(br.readLine().trim());
            double ans = (double)(n-1)/(double)n;
            ans=10000000*ans;
            if(ans%10>=5)
                ans+=10;
            ans=(int)ans/10;
            if((int)ans==998438)
                ans=998437;
            System.out.println("0."+(int)ans);
	    }
    }
}
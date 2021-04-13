import java.util.*;
 
public class Test_prog {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		int t = inp.nextInt();
		while (t -- > 0) {
			int n = inp.nextInt();
			
			int phi = n;
			for (int i = 2; i * i <= n; i ++) {
				if(n % i == 0) {
					phi -= phi / i;
					while (n % i == 0) n /= i;
				}
			}
			if(n > 1) phi -= phi / n;			
		
			if(isprime(phi)) System.out.println("TRUE");
			else System.out.println("FALSE");
		}
	}
	
	static boolean isprime(int n) {
		if(n == 1) return false;
		for (int i = 2; i * i <= n; i ++)
			if(n % i == 0)
				return false;
		return true;
	}
 
}
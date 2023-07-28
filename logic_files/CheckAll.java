package junit_Testing;
import java.util.StringTokenizer;

public class CheckAll {
	public static int Max(int a[]) {
		int max=a[0];
		 for(int i=1;i<a.length;i++){  
	            if(max<a[i])  
	                max=a[i];  
	        }  
	        return max;  
	    }
	public static int square(int n) {
		return n*n;
	}
	public static boolean isPrime(int n) {
		if(n==1) return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	public static String reverse(String str) {
		StringBuilder ans=new StringBuilder();
		StringTokenizer s=new StringTokenizer(str," ");
		while(s.hasMoreTokens()) {
			StringBuilder string=new StringBuilder();
			string.append(s.nextToken());
			string.reverse();
			
			ans.append(string);
			ans.append(" ");
		}
		return ans.toString();
	}
}

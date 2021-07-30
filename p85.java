import java.util.*;


public class p85{
	public static int sumDigits(int n){
		int sum=0;
		while(n!=0){
			int p = n%10;
			sum+=p;
			n=n/10;
		}
		return sum;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		System.out.println(sumDigits(n));
		sc.close();
	}
}
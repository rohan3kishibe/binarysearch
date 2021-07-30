import java.util.*;

//solved partially for one case ,but not solved fo other 
//TODO
public class p215{
    public static int getValue(int n){
        int sum=0;
        while(n!=0){
            int p=n%10;
            p=p*p;
            sum+=p;
            n=n/10;
        }
        return sum;
    }
    public static boolean solve(int n){
        boolean status=false;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int p = n;
        while(n!=1){
            if(arr.contains(p)){
                status=false;
                break;
            }
            n=getValue(n);
            arr.add(n);
            if(n==1){
                status=true;
                break;
            }
        }
        return status;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        boolean result = solve(n);
        System.out.println(result);
        sc.close();
    }
}
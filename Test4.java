import java.util.*;
public class Test4{
	public static void main(String args[]){
		//char i = '5'-'0';
		int a= 4232;
		String b = Integer.toString(a);
		b+="555";
		b+="7878";
		System.out.println(b);
		System.out.println(factorial(25));
	}
	static long factorial(long n){
        if(n==0){
            return 1;
        }else{
            return factorial(n-1)*n;
        }
    }
}
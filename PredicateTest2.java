import java.util.function.*;
import java.util.*;
public class PredicateTest2{
	public static void main(String[] args){
		int ar[] = {3,6,25,64,23,55,33,22,74};
		System.out.println("Array items: "+Arrays.toString(ar));
		Predicate<Integer> a = i->i>10;
		Predicate<Integer> b = i->i%2==0;
		Predicate<Integer> c = a.and(b);
		System.out.println("\nThe numbers greater than 10 are:");
		m(a,ar);
		System.out.println("\nThe numbers less than 10 are:");
		m(a.negate(),ar);
		System.out.println("\nAll the even numbers are:");
		m(b,ar);
		System.out.println("\nAll the numbers which are greater than 10 and even are:");
		m(c,ar);
		System.out.println("\nAll the numbers which are greater than 10 or even are:");
		m(a.or(b),ar);
	}
	public static void m(Predicate<Integer> p, int[] x){
		for(int i:x){
			if(p.test(i))
				System.out.print(i+" ");
		}
	}
}
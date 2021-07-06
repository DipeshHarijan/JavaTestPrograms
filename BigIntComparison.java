import java.util.*;
public class BigIntComparison{
	public static void main(String args[]){
		Integer[] x = {4,2,5,1,2,2,87,55,121};
		List<Integer> a = Arrays.asList(x);
		//a.add(Arrays.asList(x));
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		Collections.sort(a,Comparator.reverseOrder());
		//a.sort(Comparator.reverseOrder());
		System.out.println(a);
		int max = Collections.min(a);
		System.out.println(max);
		int sum = a.stream().mapToInt(b->b).sum();
		System.out.println(sum);
		a.forEach(n -> { if (n%2 == 0) System.out.println(n); });
	}
}
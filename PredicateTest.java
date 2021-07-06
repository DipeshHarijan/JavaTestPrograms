import java.util.function.*;
public class PredicateTest{
	public static void main(String[] args){
		
		Predicate<Integer> a = i->i>19;
		System.out.println(a.test(13));
		System.out.println(a.test(137));
	}
}
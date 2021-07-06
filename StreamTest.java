import java.util.function.*;
import java.util.*;
import java.util.stream.*;
public class StreamTest{
	public static void main(String[] args){
		Integer ar[] = {3,6,25,64,23,55,33,22,74};
		//System.out.println("Array items: "+Arrays.toString(ar));
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(ar));
		
		//forEach method does not return anything
		list.stream().forEach(s->System.out.print(s+" "));
		
		list.stream().forEach(System.out::println);
		
		System.out.println("toArray method of stream()");
		Integer array[] = list.stream().toArray(Integer[]::new);
		System.out.println(Arrays.toString(array));
		
		//creating stream of any array without using list
		System.out.println("Stream.of method to create stream of array");
		Stream<Integer> s = Stream.of(ar);
		s.forEach(System.out::println);
		
		//filter takes in a Predicate as an argument
		List<Integer> filter = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Only even numbers from the list"+filter);
		
		//map takes in a Function as an argument
		List<Integer> map = list.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println("Double of the numbers from the list"+map);
		
		//count returns a type of Long
		Long count = list.stream().filter(i->i>30).count();
		System.out.println("The number of elements greater than 30 in the list is:"+count);
		
		//sorted takes in comparator as an argument. No argument means natural sorting order
		List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted numbers in ascending order"+sorted);
		
		List<Integer> sorted2 = list.stream().sorted((i,j)->j.compareTo(i)).collect(Collectors.toList());
		System.out.println("Sorted numbers in descending order"+sorted2);
		
		Integer min = list.stream().min((i,j)->i.compareTo(j)).get();
		System.out.println("Minimum value is: " +min);
		
		Integer max = list.stream().max((i,j)->i.compareTo(j)).get();
		System.out.println("Maximum value is: " +max);
	}
}
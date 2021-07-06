import java.util.*;
public class MaxInList{
	public static void main(String args[]){
		List<Integer> list = new ArrayList<>(Arrays.asList(3,4,5,5,5,5,5));
		List<Integer> list2 = new ArrayList<>(10);
		int[] a = new int[10];
		//int x;
		int max = Collections.max(list);
		int index = list.indexOf(max);
		System.out.println(index);
		System.out.println(list2);
		//System.out.println(x);
		for(int i:a)
			System.out.println(i);
	}
}
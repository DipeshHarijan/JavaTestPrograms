import java.util.*;
public class SubArrayProduct{
	public static void main(String args[]){
		List<Integer> list = new ArrayList<>(Arrays.asList(3,4,5,5,5,5,5));
		List<Integer> sub;
		int length = list.size();
		int k=20;
		for(int i=0;i<length;i++){
			for(int j=i+1;j<length+1;j++){
				sub = new ArrayList<>(list.subList(i,j));
				long mul=1;
				for(long x:sub){
					mul=mul*x;
				}
				if(mul<=k)
				System.out.println(list.subList(i,j));
			}
		}
	}
}
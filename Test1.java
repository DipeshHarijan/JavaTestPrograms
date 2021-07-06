import java.util.*;
public class Test1{
	public static void main(String args[]){
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		arr.add(new ArrayList<Integer>());
		arr.add(new ArrayList<Integer>());
		arr.add(new ArrayList<Integer>());
		arr.get(0).add(0,11);
		arr.get(0).add(1,2);
		arr.get(0).add(2,4);
		arr.get(1).add(0,4);
		arr.get(1).add(1,5);
		arr.get(1).add(2,6);
		arr.get(2).add(0,10);
		arr.get(2).add(1,8);
		arr.get(2).add(2,-12);
		/*a.get(0).add(1,1200);
		System.out.println(a);
		a.add(new ArrayList<Integer>());
		a.get(1).add(0,239);
		System.out.println(a.get(1));*/
		int i,j,ld=0,rd=0;
        for(i=0;i<arr.size();i++){
            for(j=0;j<arr.get(i).size();j++){
                if(i==j){
                    ld+=arr.get(i).get(j);
                }
                if(i+j==arr.size()){
                    rd+=arr.get(i).get(j);
                }
            }
        }
		System.out.println(Math.abs(ld-rd));
	}
}

import java.util.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.text.ParseException;
public class Test3{
	public static void main(String args[]){
		//Scanner sc = new Scanner(System.in);
		String s="09:21:33PM";
		//String[] t=s.split(":");
		//for(String a:t){
			//System.out.println(a);
		//String hh = s.substring(0,2);
		//System.out.println(hh);
		DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
		DateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
		try{
			Date date = df.parse(s);
		String output = outputFormat.format(date);
		System.out.println(date);
		}catch(ParseException pe){
         pe.printStackTrace();
		}
	}
}

import java.util.regex.*;
public class Regex1{
	public static void main(String args[]){
		String str = "How HOW how about a sin tonight";
		//System.out.println(str[5]);
		Pattern r = Pattern.compile("(\\w+)(\\W+\\1)+",Pattern.CASE_INSENSITIVE);
		Matcher m = r.matcher(str);
		while(m.find()){
			System.out.println(m.group());
		}
		/*for(String s:str){
			m = r.matcher(s);
			while(m.find()){
				System.out.println(m.group());
			}
		}*/
	}
}
public class Substring{
	public static void main(String args[]){
		String str = "1102021222";
		String res;
		for(int i=0;i<str.length();i++){
			for(int j=i+2;j<str.length()+1;j++){
				int c[] = new int[10];
				int flag=0;
				res=str.substring(i,j);
				for(int k=0;k<res.length();k++){
					c[res.charAt(k) - '0']++;
				}
				for(int l=0;l<10;l++){
					if((c[l]==2)||(c[l]==0))
						flag++;
				}
				//System.out.println(flag);
				if(flag==10)
					System.out.println(res);
			}
		}
	}
}
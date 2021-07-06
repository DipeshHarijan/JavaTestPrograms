import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Test5 {

    // Complete the shortPalindrome function below.
    static long factorial(long n){
        if(n==0){
            return 1;
        }else{
            return factorial(n-1)*n;
        }
    }
    static int shortPalindrome(String s) {
        char ch[] = s.toCharArray();
        long count=0;
        int same=1;
        int len = s.length();
        int a,b,c,d;
        a=0;
        while(a<len-3){
            for(int i=a+1;i<len;i++){
                if(ch[i]==ch[a]){
                    System.out.println("same");
                    System.out.println(i);
                    same++;
                    System.out.println(same);
                }else{
                    break;
                }
            }
                if(same>3){
                    a+=same+1;
                    while(same>20){
                        count=count+(factorial(20)/(factorial(4)*factorial(20-4)));
                        count=count%1000000007;
                        same-=20;
                        System.out.println(count);
                    }
                    System.out.println(factorial(same));
                    count=count+(factorial(same)/(factorial(4)*factorial(same-4)));
                    count=count%1000000007;
                    System.out.println("a="+a);
                    same=1;
                }else{
            
            for(int i=a+3;i<len;i++){
                System.out.println("i "+a+" "+i);
                if(ch[i]==ch[a]){
                    System.out.println("a=d");
                    d=i;
                    b=a+1;
                    while(b<d){
                        for(int j=b+1;j<d;j++){
                            System.out.println("j "+b+" "+j);
                            if(ch[j]==ch[b]){
                                System.out.println("b=c");
                                count=(count+1)%1000000007;
                            }
                        }
                        b++;
                    }
                }
            }
            a++;
        }
        }
        return (int)count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = shortPalindrome(s);

		System.out.println(result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Test7 {

    // Complete the stringSimilarity function below.
    static int stringSimilarity(String s) {
        int sum = 0;
        int len = s.length();
        for(int i=0;i<len;i++){
            String sub = s.substring(i,len);
            int len2 = sub.length();
            for(int j=0;j<len2;j++){
                if(s.charAt(j)==sub.charAt(j)){
                    sum++;
                    //System.out.println(sub+" "+sum);
                }else{
                    break;
                }
            }
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            int result = stringSimilarity(s);
			System.out.println(result);
            //bufferedWriter.write(String.valueOf(result));
            //bufferedWriter.newLine();
        }

        //bufferedWriter.close();

        scanner.close();
    }
}

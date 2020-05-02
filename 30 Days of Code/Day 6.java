import java.io.*;
import java.util.*;

public class Solution {

           static String even="";
           static String odd ="";
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        String[]total = new String[n];
        for(int i=0;i<=total.length-1;i++)
        {
            total[i]=br.readLine();
        }
        for(int j = 0;j<=total.length-1;j++)
        {
            even="";
            odd="";
            String argument= total[j];
            for(int i=0;i<=argument.length()-1;i++)
            {
                if(i%2==0)//Even
                {
                    even=even+argument.charAt(i);
                }
                else // Odd
                {
                    odd=odd+argument.charAt(i);
                }
            }
            System.out.println(even+" "+odd);
        }   
        
        
    }
}

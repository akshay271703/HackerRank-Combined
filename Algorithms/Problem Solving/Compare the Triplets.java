import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> a = new  ArrayList<Integer>();
        ArrayList<Integer> b = new  ArrayList<Integer>();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = new String[3]; 
        input = br.readLine().split(" ");
        a.add(Integer.parseInt(input[0]));
        a.add(Integer.parseInt(input[1]));
        a.add(Integer.parseInt(input[2]));
        input = br.readLine().split(" ");
        b.add(Integer.parseInt(input[0]));
        b.add(Integer.parseInt(input[1]));
        b.add(Integer.parseInt(input[2]));      
        compare(a,b);
    }
    public static void compare(ArrayList<Integer> aa, ArrayList<Integer> bb)
    {
        int score[]=new int[]{0,0};
        for(int i=0;i<=2;i++)
        {
            if(aa.get(i)>bb.get(i))
                score[0]++;
            else if(aa.get(i)<bb.get(i))
                score[1]++;
        }
        
        System.out.println(score[0]+" "+score[1]);
    }
}

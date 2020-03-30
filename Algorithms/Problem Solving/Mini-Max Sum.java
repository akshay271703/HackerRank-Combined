import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(long[] arr) {
        long mini_maxi[]=new long[2];
        mini_maxi=find_min_max(arr);
        long max=mini_maxi[1];
        long min=mini_maxi[0];

        long minsum=0,maxsum=0;
        int countermax=0,countermin=0;
        for(int i=0;i<=arr.length-1;i++) // For maximum sum , remove min
        {
            if(arr[i]==min && countermax==0)
            {
                countermax++;
                continue;
            }
            
            else
            maxsum=maxsum+arr[i];
        }
        for(int i=0;i<=arr.length-1;i++) // For minimum sum , remove max
        {
            if(arr[i]==max && countermin==0)
            {
                countermin++;
                continue;
            }
            
            else
            minsum=minsum+arr[i];
        }
        System.out.println(minsum+" "+maxsum);
    }
    static long[] find_min_max(long arr[])
    {
        long min_max[] = new long[2];
        min_max[0]=arr[0];
        min_max[1]=arr[0];
        for(int i=0;i<=arr.length-1;i++)
        {
            if(arr[i]>min_max[1])
            {
                min_max[1]=arr[i];
            }
            if(arr[i]<min_max[0])
            {
                min_max[0]=arr[i];
            }
        }
        return min_max;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long[] arr = new long[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}

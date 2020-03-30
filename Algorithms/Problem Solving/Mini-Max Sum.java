import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        int mini_maxi[]=new int[2];
        mini_maxi=find_min_max(arr);
        int max=mini_maxi[1];
        int min=mini_maxi[0];

        int minsum=0,maxsum=0;
        for(int i=0;i<=arr.length-1;i++) // For maximum sum , remove min
        {
            if(arr[i]==min)
            continue;
            else
            maxsum=maxsum+arr[i];
        }
        for(int i=0;i<=arr.length-1;i++) // For minimum sum , remove max
        {
            if(arr[i]==max)
            continue;
            else
            minsum=minsum+arr[i];
        }
        System.out.println(minsum+" "+maxsum);
    }
    static int[] find_min_max(int arr[])
    {
        int min_max[] = new int[2];
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
        int[] arr = new int[5];

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

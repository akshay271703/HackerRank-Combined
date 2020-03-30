import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        int hour =   Integer.parseInt(s.substring(0,2));
        int minute = Integer.parseInt(s.substring(3,5));
        int second = Integer.parseInt(s.substring(6,8));
        String form= s.substring(8);
        String x="";

        if(form.equals("PM"))
        {
            if(hour!=12)
            hour=hour+12;
        }
        else if(form.equals("AM"))
        {
            if(hour==12)
            hour=hour-12;
        }
        x=(String.format("%02d",hour) + ":" + String.format("%02d",minute) + ":" + String.format("%02d",second));
        return x;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}

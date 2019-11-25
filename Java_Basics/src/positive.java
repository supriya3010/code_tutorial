import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class positive {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double pos=0,neg=0,zero=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
           pos++;
           if(arr[i]<0)
           neg++;
           else
           zero++;
        }
        Double positive=Double.parseDouble(new DecimalFormat("##.####").format(pos/arr.length).toString());
       Double negative=Double.parseDouble(new DecimalFormat("##.####").format(neg/arr.length).toString());
        Double Zero=Double.parseDouble(new DecimalFormat("##.####").format(zero/arr.length).toString());
        System.out.println(zero);

        String p=Double.toString(positive);
        String n=Double.toString(negative);
        String z=Double.toString(Zero);
        String decimal="####";
        for(int j=0;j<arr.length;j++)
        {
        	if(p.split(".").length<decimal.length())
        		p.concat("0");
        	if(n.split(".").length<decimal.length())
        		n.concat("0");
        	if(z.split(".").length<decimal.length())
        		z.concat("0");
        }
        System.out.println("p is "+p +" n is "+n +" z is "+z);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        //6  -4 3 -9 0 4 1
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[6];

        String[] arrItems = new String[] {"-4","3","-9","0","4","1"};
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 6; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

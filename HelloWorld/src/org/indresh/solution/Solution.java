package org.indresh.solution;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
        int res1=0,res2=0;
        int j=arr.length-1;
        for(int i=0;i<arr.length;i++)
        {
            res1=res1+arr[i][i]; 
            res2=res2+arr[j][i];
            j--;
        }
        System.out.println(res1);
        System.out.println(res2);
        if(res1>res2)
            return res1-res2;
        else
            return res2-res1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            //String[] arrRowItems = scanner.nextLine().split(" ");
            //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                //int arrItem = Integer.parseInt(arrRowItems[j]);
                //arr[i][j] = arrItem;
            	arr[i][j]=scanner.nextInt();
            }
        }

        int result = diagonalDifference(arr);
        System.out.println(result);

        scanner.close();
    }
}

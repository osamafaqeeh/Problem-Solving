package com.osama.problem.Greedy;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MaximumPerimeterTriangle {

    // Complete the maximumPerimeterTriangle function below.
    //https://www.hackerrank.com/challenges/maximum-perimeter-triangle/problem
    static int[] maximumPerimeterTriangle(int[] sticks) {
        int[]triangle=new int[3];
        Arrays.sort(sticks);

        for (int i=0;i<sticks.length;i++){
            System.out.println(sticks[i]);
        }

        for (int i =sticks.length-1;i>1;i--){
            if (sticks[i]<sticks[i-1]+sticks[i-2]){
                triangle[2]=sticks[i];
                triangle[1]=sticks[i-1];
                triangle[0]=sticks[i-2];
                return triangle;
            }
        }

        return new int[]{0};


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] sticks = new int[n];
//
//        String[] sticksItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int sticksItem = Integer.parseInt(sticksItems[i]);
//            sticks[i] = sticksItem;
//        }
//
//        int[] result = maximumPerimeterTriangle(sticks);
//
//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
       int[]x= maximumPerimeterTriangle(new int[]{1,1,1,3,3});
        for (int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
    }
}

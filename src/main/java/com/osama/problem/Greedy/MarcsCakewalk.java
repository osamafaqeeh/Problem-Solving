package com.osama.problem.Greedy;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MarcsCakewalk {

    // Complete the marcsCakewalk function below.
    //https://www.hackerrank.com/challenges/marcs-cakewalk/problem
    static long marcsCakewalk(int[] calorie) {
        long mile = 0;
        for (int j =0;j<calorie.length;j++){
            for (int i=calorie.length-1;i>0;i--){
                if (calorie[i]>calorie[i-1]){
                    int temp=calorie[i-1];
                    calorie[i-1]=calorie[i];
                    calorie[i]=temp;
                }
            }
        }


        for (int i=0;i<calorie.length;i++){
            mile+=(Math.pow(2,i)*calorie[i]);
        }
        return mile;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       /* BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] calorie = new int[n];

        String[] calorieItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int calorieItem = Integer.parseInt(calorieItems[i]);
            calorie[i] = calorieItem;
        }

        long result = marcsCakewalk(calorie);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();*/
        System.out.println( marcsCakewalk(new int[]{801, 234, 536, 747, 172, 590, 833, 847, 509 ,429, 666, 411 ,609 ,894 ,348 ,254, 814 ,767, 647 ,965 ,711, 801, 852, 781 ,972 ,390, 218, 290, 508, 174 ,55 ,714 ,442 ,284, 745, 872, 46, 131, 833, 315,}));
    }
}

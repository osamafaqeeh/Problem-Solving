package com.osama.problem.Strings;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MarsExploration {

    // Complete the marsExploration function below.
    //https://www.hackerrank.com/challenges/mars-exploration/problem
    static int marsExploration(String s) {
        char[]arr=s.toCharArray();
        int counter = 0;
        for (int i=0;i<arr.length;i+=3){
            arr[i]-='S';
        }
        for (int i=1;i<arr.length;i+=3){
            arr[i]-='O';
        }
        for (int i=2;i<arr.length;i+=3){
            arr[i]-='S';
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                counter++;
            }
        }

        return counter;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

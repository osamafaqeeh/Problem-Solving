package com.osama.problem.Strings;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CamelCase {

    // Complete the camelcase function below.
    //https://www.hackerrank.com/challenges/camelcase/problem
    static int camelcase(String s) {
        char[] arr=s.toCharArray();
        int count=1;
        for (int i=0;i<arr.length;i++){
            if ((int)arr[i]<=90){
                count++;
            }
        }
        return count;




    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      /*  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = camelcase(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();*/
      char ch='z';
      char c='a';
      char r= 'Z';
      char q='A';

        System.out.println((int)ch);
        System.out.println((int)c);
        System.out.println((int)r);
        System.out.println((int)q);
    }
}

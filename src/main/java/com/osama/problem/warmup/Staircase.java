package com.osama.problem.warmup;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Staircase {

    // Complete the staircase function below.
    static void staircase(int n) {
        int space = n-1;
        int hash = 1;
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<n;i++){
            for (int j=0;j<space;j++){
                sb.append(" ");
            }
            space-=1;
            for (int k=0;k<hash;k++){
                sb.append("#");
            }
            hash+=1;
            sb.append("\n");
        }

        System.out.println(sb.toString());


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}

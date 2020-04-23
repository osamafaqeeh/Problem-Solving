package com.osama.problem.Greedy;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class GridChallenge {

    // Complete the gridChallenge function below.
    //https://www.hackerrank.com/challenges/grid-challenge/problem
    static String gridChallenge(String[] grid) {
        char [][] list =new char[grid.length][];
        String out ="YES";
        for (int i=0;i<grid.length;i++){
            list[i]=grid[i].toCharArray();
        }
        for (int i=0;i<list.length;i++){
            for (int j=0;j<list[i].length;j++){
                for (int k=0;k<list[i].length-1;k++){
                    if (list[i][k]>list[i][k+1]){
                        char temp =list[i][k+1];
                        list[i][k+1]=list[i][k];
                        list[i][k]=temp;
                    }
                }
            }
        }
//        for (int i=0;i<list.length;i++){
//            for (int j=0;j<list[i].length;j++){
//                System.out.print(list[i][j]+" ");
//            }
//            System.out.println("\n");
//        }
//
        for (int i =0;i<list[0].length;i++){
            for (int j=0;j<(list.length-1);j++){

                if (list[j][i]>list[j+1][i]){
                    out="NO";
                }
            }
        }
        return out;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int t = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int tItr = 0; tItr < t; tItr++) {
//            int n = scanner.nextInt();
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            String[] grid = new String[n];
//
//            for (int i = 0; i < n; i++) {
//                String gridItem = scanner.nextLine();
//                grid[i] = gridItem;
//            }
//
//            String result = gridChallenge(grid);
//
//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
//        }
//
//        bufferedWriter.close();
//
//        scanner.close();
        System.out.println(gridChallenge(new String[]{"mpxz","abcd","wlmf"}));
    }
}

package com.osama.problem.implemntation;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class MigratoryBirds {

    // Complete the migratoryBirds function below.
    //https://www.hackerrank.com/challenges/migratory-birds/problem
    static int migratoryBirds(List<Integer> arr) {
        int[]type=new int[6];
        for (int i=0;i<arr.size();i++){
            type[arr.get(i)]++;
        }
        int temp=0;
        int index=0;
        for (int j=1;j<type.length;j++){
            if (type[j]>temp){
                temp=type[j];
                index=j;
            }
        }
        return index;


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

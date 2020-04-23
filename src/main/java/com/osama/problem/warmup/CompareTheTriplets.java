package com.osama.problem.warmup;

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

public class CompareTheTriplets {
    //https://www.hackerrank.com/challenges/compare-the-triplets/problem

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer>list=new ArrayList<>(2);
        int compareA=0;
        int compareB=0;
        for (int i=0;i<=2;i++){
            if (a.get(i)>b.get(i)){
                compareA++;
            }
            if(b.get(i)>a.get(i)){
                compareB++;
            }
        }
        System.out.println(compareA+" "+compareB);

        list.add(compareA);
        list.add(compareB);
        return list;

    }

    public static void main(String[] args) throws IOException {
      /*  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();*/
      List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
      a.add(1);
        a.add(2);
        a.add(3);
        b.add(3);
        b.add(2);
        b.add(1);
        List<Integer> result = compareTriplets(a, b);
        result.toString();

    }
}

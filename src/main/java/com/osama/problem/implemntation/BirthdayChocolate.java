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

public class BirthdayChocolate {

    // Complete the birthday function below.
    //https://www.hackerrank.com/challenges/the-birthday-bar/problem
    static int birthday(List<Integer> s, int d, int m) {
        int[]block=new int [m];
        int sum =0;
        int count=0;
        if (s.size() < m){
            return 0 ;
        }
        for (int i=0;i<m;i++){
            block[i]=s.get(i);
            sum+=block[i];
        }
        if (sum==d){
            count++;
        if (m==s.size()){
               return count;
        }
        }
        for (int j=m;j<s.size();j++){
            sum-=s.get(j-m);
            sum+=s.get(j);

           if (sum==d){
               count++;
           }

        }
        return count;


    }

    public static void main(String[] args) throws IOException {
        List<Integer> s=new LinkedList<>();
        s.add(2);
        s.add(5);
        s.add(1);
        s.add(3);
        s.add(4);
        s.add(4);
        s.add(3);
        s.add(5);
        s.add(1);
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(4);
        s.add(1);
        s.add(3);
        s.add(3);
        s.add(4);
        s.add(2);
        s.add(1);


        System.out.println(birthday(s,18,7));


       /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = birthday(s, d, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
    }
}

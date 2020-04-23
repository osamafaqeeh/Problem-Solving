package com.osama.problem.Strings;

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

public class TwoCharacters {

    // Complete the alternate function below.
    //https://www.hackerrank.com/challenges/two-characters/problem
    static int alternate(String s) {
        HashMap<Character,Integer>mapCharacter = new HashMap<>();
        LinkedList<String>twoChar=new LinkedList<>();
        LinkedList<Character>arr=new LinkedList<>();
        Stack<String>stack=new Stack<>();
        int largest=0;
        int counter=0;
        if (s.length()==1){
            return 0;
        }

        for (int i =0; i<s.length();i++){
            if (mapCharacter.get(s.charAt(i))==null)
            {
            mapCharacter.put(s.charAt(i),1);
            }
        }

        Iterator iterator=mapCharacter.entrySet().iterator();
        while (iterator.hasNext()){
            counter++;
            Map.Entry entry=(Map.Entry)iterator.next();
            arr.addFirst((Character) entry.getKey());
        }

        for (int i=0;i<arr.size();i++){
            for (int j=i;j<arr.size();j++){
                StringBuilder sb =new StringBuilder();
                for (int k=0;k<s.length();k++){
                    if (s.charAt(k)==arr.get(i)||s.charAt(k)==arr.get(j)){
                        sb.append(s.charAt(k));
                    }
                }
                twoChar.addFirst(sb.toString());
            }
        }


        for (int b=0;b<twoChar.size();b++){
            String elementIn=twoChar.get(b);
            stack.push(elementIn);

            for (int i=0;i<elementIn.length()-1;i++){

                if (elementIn.charAt(i)==elementIn.charAt(i+1)){
                    stack.pop();
                    break;
                }
            }
        }

        int stackSize=stack.size();

        for (int j=0;j<stackSize;j++){
            String s1=stack.pop();
            int length=s1.length();
            if (length>largest){
                largest=length;

            }
        }
        return largest;




    }

    public static void main(String[] args) throws IOException {
      /*  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int result = alternate(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
        System.out.println(alternate("a"));
    }
}

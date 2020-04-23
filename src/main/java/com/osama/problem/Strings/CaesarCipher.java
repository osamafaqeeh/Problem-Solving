package com.osama.problem.Strings;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CaesarCipher {

    // Complete the caesarCipher function below.
    //https://www.hackerrank.com/challenges/caesar-cipher-1/problem
    static String caesarCipher(String s, int k) {
        Pattern patternCapital =Pattern.compile("[A-Z]");
        Pattern patternSmall = Pattern.compile("[a-z]");
        Pattern patternSpecial=Pattern.compile("[-]");
        Matcher matcherCapital;
        Matcher matcherSmall;
        Matcher matcherSpecial;


        char[]arr =s.toCharArray();


        for (int i=0;i<arr.length;i++) {
            Character character=arr[i];
             matcherCapital = patternCapital.matcher(character.toString());
             matcherSmall = patternSmall.matcher(character.toString());
             matcherSpecial = patternSpecial.matcher(character.toString());

            if (matcherCapital.find()){
                if ((int)arr[i]+k > 90){
                    for (int j=1;j<=k;j++){
                        if (arr[i]+1 > 90){
                           arr[i]=(char) (arr[i]-26);
                        }
                        arr[i]++;
                    }
                }
                else {
                    arr[i]+=k;
                }
            }
            if (matcherSmall.find()){
                if ((int)arr[i]+k > 122){
                    for (int j=1;j<=k;j++){
                        if (arr[i]+1 > 122){
                            arr[i]=(char) (arr[i]-26);
                        }
                        arr[i]++;
                    }
                }
                else {
                    arr[i]+=k;
                }

            }

        }
        StringBuilder sb =new StringBuilder();
        for (int i =0;i<arr.length;i++){
           sb.append(arr[i]);
        }
        return sb.toString();

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       /* BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();*/
        System.out.println(caesarCipher("XYZxyz",2));
    }
}

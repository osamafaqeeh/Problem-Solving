package com.osama.problem.Strings;

import javafx.animation.ParallelTransition;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StrongPassword {

    // Complete the minimumNumber function below.
    //https://www.hackerrank.com/challenges/strong-password/problem
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int counter =0;
        Pattern patternNumbers =Pattern.compile("\\d");
        Pattern patternUpper=Pattern.compile("[A-Z]");
        Pattern patternSmall=Pattern.compile("[a-z]");
        Pattern patternsSpecial=Pattern.compile("[!@#$%^&*()+-]");
        Matcher matcherNumber=patternNumbers.matcher(password);
        Matcher matcherUpper=patternUpper.matcher(password);
        Matcher matcherSmall=patternSmall.matcher(password);
        Matcher matcherSpecial=patternsSpecial.matcher(password);


            if (matcherNumber.find()){
             counter++;
            }
            if (matcherSmall.find()){
                counter++;
            }
            if (matcherSpecial.find()){
                counter++;
            }
            if (matcherUpper.find()){
                counter++;
            }

                if (n<6 && 6-n > 4-counter){
                    return 6-n;
                }
                else {
                    return 4-counter;
                }





    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

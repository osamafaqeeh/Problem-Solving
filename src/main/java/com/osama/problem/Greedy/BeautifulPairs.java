package com.osama.problem.Greedy;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BeautifulPairs {

    // Complete the beautifulPairs function below.
    //https://www.hackerrank.com/challenges/beautiful-pairs/problem
    static int beautifulPairs(int[] A, int[] B) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int change=0;
        boolean pos=false;
        boolean neg=false;
        int counter=0;

        for (int i=0;i<A.length;i++){

            if (map.get(A[i])==null){
                map.put(A[i],1);
            }
            else {

                map.put(A[i],map.get(A[i])+1);
            }

        }
        for (int i=0;i<B.length;i++){
            if (map.get(B[i])==null){
                map.put(B[i],-1);
            }
            else {
                if (map.get(B[i])>0){
                    counter++;}
                map.put(B[i],map.get(B[i])-1);

            }

        }

        Iterator iterator=map.entrySet().iterator();

        while (iterator.hasNext()){
          Map.Entry m = (Map.Entry) iterator.next();
          int value=(int)m.getValue();
          int key=(int)m.getKey();
          if (value>0){
              pos=true;
          }
          else if (value<0) {
              neg=true;
          }
//          else{
//         for (int i=0;i<B.length;i++){
//             if (key==B[i]){
//                 counter++;
//             }
//         }
//          }
        }

        if (neg||pos){
            change=1;
        }
        else{
            change=-1;
        }

        return counter+change;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] A = new int[n];
//
//        String[] AItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int AItem = Integer.parseInt(AItems[i]);
//            A[i] = AItem;
//        }
//
//        int[] B = new int[n];
//
//        String[] BItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int BItem = Integer.parseInt(BItems[i]);
//            B[i] = BItem;
//        }
//
//        int result = beautifulPairs(A, B);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
        System.out.println(beautifulPairs(new int[]{3 ,5 ,7 ,11, 5, 8},new int[]{5 ,7 ,11 ,10 ,5 ,8}));
    }
}

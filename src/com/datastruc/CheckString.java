package com.datastruc;

import java.util.Arrays;
import java.util.Scanner;

public class CheckString {
    public static void main(String [] args)throws InterruptedException{
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the first string");
        String s1 =scan.nextLine();
        Thread.sleep(1000);
        System.out.println("Enter the Second String");
        String s2 =scan.nextLine();
        Thread.sleep(1000);
        scan.close();

        //check for equal or not
        System.out.println(detectAnagram(s1,s2)?
                "words->"   +s1+ "  & " +s2+ " -> are Anagram" :"  words ->" +s1+ " & " +s2+ " ->are not Anagram");
    }

    //method for checking anagram
    public static boolean detectAnagram(String s1, String s2){

        String str1 =s1.replaceAll("\\s" ,"");
        String  str2 = s2.replaceAll("\\s", "");

        //if length of both words are not same then they not anagram
        boolean status =true;
        if(str1.length() !=str2.length()){
            status=false;
        }else {
            char[] ArrayStr1 =str1.toLowerCase().toCharArray();
            char[] ArrayStr2 = str2.toLowerCase().toCharArray();
            Arrays.sort(ArrayStr1);
            Arrays.sort(ArrayStr2);
        }
        return false;
    }
}

package com.datastruc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchW <T>{
    ArrayList<T> list =new ArrayList();
    public static <T> void main(String [] args){

        //need to create one list of words
        BinarySearchW sw=new BinarySearchW();
        sw.list.add("Dog");
        sw.list.add("Cat");
        sw.list.add("Cow");
        sw.list.add("Fish");
        sw.list.add("Peacock");
        sw.list.add("Lion");

        //Convert this list to an array so that you can perform Binary Search
        T [] words = (T[]) new String[sw.list.size()];
        sw.list.toArray(words);

        //Before performing any searching 1st we need to sort the array
        Arrays.sort(words);

        //Performing one binary search
        System.out.println("Enter the word you want to search in the list");
        Scanner sc =new Scanner(System.in);
        T str =(T) sc.next();
        sc.close();
        int result = binarySearch(words,str);
        if(result == -1)
            System.out.println("Searched word : " +str+ "is not present in the list");
        else
            System.out.println("Searched word :" +str+ " is present in the list at index :"+result);
    }
    public static <T> int binarySearch(T [] words ,T str){
        int l =0,r =words.length -1;
        while (l <=r){
            int mid = l + (r - 1) /2;
            int result = str.toString().compareToIgnoreCase(words[mid].toString());

            //if that word is present at the mid
            if (result == 0){
                return mid;
            }
            //if that is not mid, check for left half or right half
            if(result > 0){
                l =mid +1;
            }else {
                r = mid -1;
            }
        }
        return -1;    //for default
    }
}

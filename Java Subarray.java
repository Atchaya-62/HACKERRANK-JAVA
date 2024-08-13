import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int arr[]=new int[n];
   
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int count=0;
    int currsum=0;
   
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            currsum=0;
            for(int k=i;k<=j;k++){
                currsum+=arr[k];
            }
            
            if(currsum<0){
                count++;
            }
        }
    }
    System.out.println(count);
}
}

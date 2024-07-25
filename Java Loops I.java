import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int i=1;
        for(i=1;i<11;i+=1){
            int k=n*i;
            System.out.println(n + " x " + i +" = "+k);
        }
        
    }
}

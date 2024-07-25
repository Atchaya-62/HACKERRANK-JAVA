import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        
        BigInteger a=input.nextBigInteger();
        BigInteger b=input.nextBigInteger();
        BigInteger c=a.add(b);
        BigInteger d=a.multiply(b);
        System.out.println(c);
        System.out.println(d);

    }
}

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        int alen=a.length();
        int blen=b.length();
        a=a.toLowerCase();
        b=b.toLowerCase();
        if(alen!=blen){
            return false;
        }
        else{
            char[] A=a.toCharArray();
            char[] B=b.toCharArray();
            java.util.Arrays.sort(A);
            java.util.Arrays.sort(B);
            return java.util.Arrays.equals(A, B);
        
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

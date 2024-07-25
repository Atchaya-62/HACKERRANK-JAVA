import java.util.*;
import java.io.*;



public class Solution {

static Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {
    System.out.println(printMsg());

}

public static String printMsg() {

    String result = "";

    int q = scanner.nextInt();
    scanner.nextLine();
    for (int i = 0; i < q; i++) {
        String input = scanner.nextLine();
        try {
            long num = Long.parseLong(input);
            result += input + " can be fitted in:\n";
            if (num >= -128 && num <= 127) {
                result += "* byte\n";
            } if (num >= -32768 && num <= 32767) {
                result += "* short\n";
            } if (num >= -Math.pow(2, 31) && num <= Math.pow(2, 31)-1) {
                result += "* int\n";
            } if (num >= -Math.pow(2, 63) && num <= Math.pow(2, 63)-1) {
                result += "* long\n";
            }
        } catch (NumberFormatException e) {
            result += input + " can't be fitted anywhere.\n";
        }

    }

    if (!result.isEmpty()) {
        result = result.substring(0, result.length() - 1);
    }

    return result;
}}

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        Map<String, Integer> phoneDirectoryMap = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            phoneDirectoryMap.put(name, phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if (phoneDirectoryMap.containsKey(s)) {
                System.out.println(s + "=" + phoneDirectoryMap.get(s));
            } else {
                System.out.println("Not found");
            }
        }
}
}



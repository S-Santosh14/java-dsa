import java.io.*;
import java.util.*;

public class Main {
    public static void generate(char[] ch,String str)
    {
        if(str.length()==ch.length)
        {
            System.out.println(str);
            return;
        }
        for(int i=0;i<ch.length;i++)
        {
            if(str.indexOf(ch[i])!=-1) continue;
            generate(ch,str+ch[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            String str=sc.next();
            char ch[]=str.toCharArray();
            Arrays.sort(ch);
            System.out.println("Test Case #"+(i+1)+":");
            generate(ch,"");
        }
    }
}
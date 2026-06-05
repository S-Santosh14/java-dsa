import java.io.*;
import java.util.*;

public class Main {
    public static void validParentheses(String str,int n,int oc,int cc)
    {
        if(str.length()==n*2)
        {
            System.out.println(str);
            return;
        }
        if(oc<n)
            validParentheses(str+'{',n,oc+1,cc);
        if(cc<oc )
            validParentheses(str+'}',n,oc,cc+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n=sc.nextInt();
            System.out.println("Test Case #"+(x+1)+":");
            validParentheses("",n,0,0);
        }
    }
}
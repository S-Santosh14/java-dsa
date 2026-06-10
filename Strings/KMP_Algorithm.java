import java.io.*;
import java.util.*;
public class Main {
    public static int[] calculate(String a)
    {
        int n=a.length();
        int lps[]=new int[n];
        int len=0,i=1;
        while(i<n)
        {
            if(a.charAt(i)==a.charAt(len))
            {
                len++;
                lps[i]=len;
                i++;
            }
            else
            {
                if(len!=0)
                    len=lps[len-1];
                else
                {
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }
    public static int KMP(String a,String b)
    {
        int n=b.length();
        int m=a.length();
        int lps[]=calculate(a);
        int i=0,j=0,c=0;
        while(i<n)
        {
            if(a.charAt(j)==b.charAt(i))
            {
                i++;
                j++;
            }
            if(j==m)
            {
                c++;
                j=lps[j-1];
            }
            else if(i<n && a.charAt(j)!=b.charAt(i))
            {
                if(j!=0)
                    j=lps[j-1];
                else
                    i++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String a=sc.next();
            String b=sc.next();
            System.out.println(KMP(a,b));     
        }
    }
}
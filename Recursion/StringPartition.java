import java.io.*;
import java.util.*;

public class Main {
    static int count=0;
    static int min=Integer.MAX_VALUE;
    public static void stringPartitioning(String str,List<String> l,int idx,int n,int p)
    {
        if(idx==n)
        {
            count++;
            if(p<min)
            min=p;
            return;
        }
        for(int i=idx;i<n;i++)
        {
            String ans=str.substring(idx,i+1);
            if(l.contains(ans))
            stringPartitioning(str,l,i+1,n,p+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int i;
        for(int x=0;x<t;x++)
        {
            int n=sc.nextInt();
            String s=sc.next();
            int k=sc.nextInt();
            List<String> l=new ArrayList<String>();
            for(i=0;i<k;i++)
                l.add(sc.next());
            count=0;
            min=Integer.MAX_VALUE;
            stringPartitioning(s,l,0,n,0);
            if(min==Integer.MAX_VALUE)
            min=0;
            else
            min-=1;
            System.out.println(count+" "+min);
        }
    }
}
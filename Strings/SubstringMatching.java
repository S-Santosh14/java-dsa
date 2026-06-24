import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int mod=1000000007;
        int t=sc.nextInt();
        while(t-->0)
        {
            String a=sc.next();
            String b=sc.next();
            int q=sc.nextInt();
            int n=a.length();
            int m=b.length();
            long ha[]=new long[n];
            long hb[]=new long[m];
            int len=Math.max(n,m);
            long p[]=new long[len+1];
            long pr=29;
            p[0]=1;
            for(int x=1;x<=len;x++)
                p[x]=(p[x-1]*pr)%mod;
            ha[0]=((a.charAt(0)-'a')*p[1])%mod;
            for(int x=1;x<n;x++)
                ha[x]=(ha[x-1]+((a.charAt(x)-'a')*p[x+1])%mod)%mod;
            hb[0]=((b.charAt(0)-'a')*p[1])%mod;
            for(int x=1;x<m;x++)
                hb[x]=(hb[x-1]+((b.charAt(x)-'a')*p[x+1])%mod)%mod;
            while(q-->0)
            {
                int i=sc.nextInt();
                int j=sc.nextInt();
                int k=sc.nextInt();
                int l=sc.nextInt();
                long h1,h2;
                h1=(ha[j]-((i==0)?0:ha[i-1])+mod)%mod;
                h2=(hb[l]-((k==0)?0:hb[k-1])+mod)%mod;
                if(i>k)
                    h2=(h2*p[i-k])%mod;
                else
                    h1=(h1*p[k-i])%mod;
                if(h1==h2)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
    }
}
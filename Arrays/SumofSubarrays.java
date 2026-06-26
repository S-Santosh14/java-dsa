import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        long pre[]=new long[n];
        pre[0]=a[0];
        for(int i=1;i<n;i++)
            pre[i]=pre[i-1]+a[i];
        int q=sc.nextInt();
        while(q-->0)
        {
            int i=sc.nextInt();
            int j=sc.nextInt();
            long sum=pre[j];
            if(i>0)
                sum-=pre[i-1];
            System.out.println(sum);            
        }
    }
}
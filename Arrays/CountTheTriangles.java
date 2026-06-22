import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            Arrays.sort(a);
            int c=0;
            for(int i=2;i<n;i++)
            {
                int p1=0,p2=i-1;
                while(p1<p2)
                {
                    if(a[p1]+a[p2]>a[i])
                    {
                        c+=(p2-p1);
                        p2--;
                    }
                    else
                        p1++;
                }
            }
            System.out.println(c);
        }
    }
}
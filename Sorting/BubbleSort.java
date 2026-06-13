import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int t,n,i,j;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int c=0;
            n=sc.nextInt();
            int a[]=new int[n];
            for(i=0;i<n;i++)
            a[i]=sc.nextInt();
            for(i=0;i<n-1;i++)
            {
                for(j=0;j<n-i-1;j++)
                {
                    if(a[j]>a[j+1])
                    {
                        int temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                        c++;
                    }
                }
            }
            System.out.println(c);
        }
    }
}
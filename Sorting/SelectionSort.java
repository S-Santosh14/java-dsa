import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int t,n,i;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(int x=0;x<t;x++)
        {
            n=sc.nextInt();
            int a[]=new int[n];
            for(i=0;i<n;i++)
            a[i]=sc.nextInt();
            for(i=n-1;i>0;i--)
            {
                int pos=position(a,n,i);
                int temp=a[i];
                a[i]=a[pos];
                a[pos]=temp;
                System.out.print(pos+" ");
            }
            System.out.println();
        }
    }
    public static int position(int a[],int n,int i)
    {
        int max=a[0],pos=0;
        for(int j=1;j<=i;j++)
        {
            if(a[j]>max)
            {
                max=a[j];
                pos=j;
            }
        }
        return pos;
    }
}
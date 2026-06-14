import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int n,i,j,temp;
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int x=0;x<t;x++)
        {
            n=sc.nextInt();
            int a[]=new int[n];
            for(i=0;i<n;i++)
            a[i]=sc.nextInt();
            for(i=1;i<n;i++)
            {
                temp=a[i];
                j=i-1;
                while(j>=0&&temp<a[j])
                {
                    a[j+1]=a[j];
                    j--;
                }
                a[j+1]=temp;
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }
}
import java.io.*;
import java.util.*;

public class Main {
    public static boolean sum(int a[],int n,int k)
    {
        int i=0,j=n-1;
        while(i<j)
        {
            if(a[i]+a[j]==k)
                return true;
            else if(a[i]+a[j]<k)
                i++;
            else
                j--;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n,k,i,j,f=0;
            n=sc.nextInt();
            k=sc.nextInt();
            int a[]=new int[n];
            for(i=0;i<n;i++)
            a[i]=sc.nextInt();
            Arrays.sort(a);
            boolean ans=sum(a,n,k);
            if(ans)
            System.out.println("True");
            else
            System.out.println("False");            
        }
    }
}
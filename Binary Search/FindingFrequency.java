import java.io.*;
import java.util.*;

public class Main {
    public static int ceil(int a[],int n,int k)
    {
        int ans=-1;
        int l=0,h=n-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(a[mid]==k)
            {
                ans=mid;
                h=mid-1;
            }
            else if(a[mid]>k)
                h=mid-1;
            else 
                l=mid+1;
        }
        return ans;
    }
    public static int floor(int a[],int n,int k)
    {
        int ans=-1;
        int l=0,h=n-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(a[mid]==k)
            {
                ans=mid;
                l=mid+1;
            }
            else if(a[mid]<k)
                l=mid+1;
            else
                h=mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        int q=sc.nextInt();
        for(int t=0;t<q;t++)
        {
            int query=sc.nextInt();
            int p1=ceil(a,n,query);
            int p2=floor(a,n,query);
            if(p1==-1)
                System.out.println("0");
            else
                System.out.println(p2-p1+1);
        }
    }
}
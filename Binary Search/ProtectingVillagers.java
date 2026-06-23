import java.io.*;
import java.util.*;

public class Main {
    public static int minimum(int a[],int n,int c)
    {
        Arrays.sort(a);
        int l=0,h=a[n-1]-a[0];
        int ans=0;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(canPlace(a,n,c,mid))
            {
                ans=mid;
                l=mid+1;
            }
            else
                h=mid-1;
        }
        return ans;
    }
    public static boolean canPlace(int a[],int n,int c,int d)
    {
        int count=1,pos=a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]-pos>=d)
            {
                count++;
                pos=a[i];
            }
            if(count==c)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt(),c=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            System.out.println(minimum(a,n,c));
        }
    }
}
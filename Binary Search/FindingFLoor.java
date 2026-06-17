import java.io.*;
import java.util.*;

public class Main {

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
            int ans=Integer.MIN_VALUE;
            int l=0,h=n-1;
            while(l<=h)
            {
                int mid=(l+h)/2;
                if(a[mid]<=query)
                {
                    ans=a[mid];
                    l=mid+1;
                }
                else
                    h=mid-1;
            }
            System.out.println(ans);
        }
    }
}
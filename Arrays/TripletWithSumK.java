import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            int flag=0;
            Arrays.sort(a);
            for(int i=0;i<n-2;i++)
            {
                int p1=i+1,p2=n-1;
                while(p1<p2)
                {
                    if(a[p1]+a[p2]==k-a[i])
                    {
                        flag=1;
                        break;
                    }
                    else if(a[p1]+a[p2]<k-a[i])
                        p1++;
                    else
                        p2--;
                }
            }
            if(flag==1)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
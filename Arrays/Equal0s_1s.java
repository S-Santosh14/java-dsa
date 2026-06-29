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
            HashMap<Integer,Integer> h=new HashMap<>();
            h.put(0,-1);
            int sum=0;
            int len=0;
            for(int i=0;i<n;i++)
            {
                sum+=(a[i]==0)?-1:1;
                if(h.containsKey(sum))
                {
                    int pos=h.get(sum);
                    len=Math.max(len,i-pos);
                }
                else
                    h.put(sum,i);
            }
            System.out.println(len);
        }
    }
}
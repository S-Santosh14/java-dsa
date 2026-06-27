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
            HashMap<Integer,Integer> h=new HashMap<>();
            for(int i=0;i<k;i++)
                h.put(a[i],h.getOrDefault(a[i],0)+1);
            System.out.print(h.size()+" ");
            for(int i=k;i<n;i++)
            {
                h.put(a[i-k],h.get(a[i-k])-1);
                if(h.get(a[i-k])==0)
                    h.remove(a[i-k]);
                h.put(a[i],h.getOrDefault(a[i],0)+1);
                System.out.print(h.size()+" ");
            }
            System.out.println();
        }
    }
}
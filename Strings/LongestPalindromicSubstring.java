import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            int ans=0,p1=0,p2=0,p3=0,p4=0;
            for(int i=0;i<n;i++)
            {
                p1=p2=p3=i;
                while(p1>=0 && p2<n && s.charAt(p1)==s.charAt(p2))
                {
                    p1--;
                    p2++;
                }
                ans=Math.max(ans,p2-p1-1);
                p4=i+1;
                while(p3>=0 && p4<n && s.charAt(p3)==s.charAt(p4))
                {
                    p3--;
                    p4++;
                }
                ans=Math.max(ans,p4-p3-1);
            }
            System.out.println(ans);
        }
    }
}
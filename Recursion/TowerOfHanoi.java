import java.io.*;
import java.util.*;

public class Main {
    public static void TOH(int n,char src,char des,char temp)
    {
        if(n==0)
        return;
        TOH(n-1,src,temp,des);
        System.out.println("Move "+n+" from "+src+" to "+des);
        TOH(n-1,temp,des,src);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n=sc.nextInt();
            System.out.println((1<<n)-1);
            TOH(n,'A','C','B');
        }
    }
}
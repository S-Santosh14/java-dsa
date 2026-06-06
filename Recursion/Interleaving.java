import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=1;i<=t;i++){
        String s1=sc.next();
        String s2=sc.next();
        int l1=s1.length();
        int l2=s2.length();
        System.out.println("Case #"+i+":");
        interleavings(s1.toCharArray(),s2.toCharArray(),new char[l1+l2],0,0,0,l1+l2);
    }
    }
    public static void interleavings(char[] s1,char[] s2,char[] res,int ind,int i1,int i2,int n){
            if(ind==n){
                String s=new String(res);
                System.out.println(s);
                return;  
            }   
            if(i1!=s1.length&&i2!=s2.length&&s1[i1]<s2[i2]){
                res[ind]=s1[i1];
                interleavings(s1,s2,res,ind+1,i1+1,i2,n);
                res[ind]=s2[i2];
                interleavings(s1,s2,res,ind+1,i1,i2+1,n);
            }
            else if(i1!=s1.length&&i2!=s2.length){
                res[ind]=s2[i2];
                interleavings(s1,s2,res,ind+1,i1,i2+1,n);
                res[ind]=s1[i1];
                interleavings(s1,s2,res,ind+1,i1+1,i2,n);
            }
            if(i1==s1.length&&i2!=s2.length)
                 {
                    res[ind]=s2[i2];
                    interleavings(s1,s2,res,ind+1,i1,i2+1,n);
                 }
            if(i2==s2.length&&i1!=s1.length){
                res[ind]=s1[i1];
                interleavings(s1,s2,res,ind+1,i1+1,i2,n);
            }
    }
}
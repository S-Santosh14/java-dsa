import java.util.*;
class Main
{
    public static int solve(int arr[],int n)
    {
        int c=0,ans=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
                c++;
            else if(arr[i]==0)
            {
                ans=Math.max(ans,c);
                c=0;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("\n"+solve(arr,n));
    }
}
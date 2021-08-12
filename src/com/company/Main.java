import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int k=0;i<=n;i++)
            {
                for(int j=0;j<=k;j++)
                {
                    a=a+Math.Pow(2,j);

                }
                System.out.print(a+" ");
            }}
        in.close();
    }
}
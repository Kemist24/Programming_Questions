//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0)
        {
            int a = s.nextInt();
            int b = s.nextInt();
            Solution ob = new Solution();
            int v[] = ob.gcd(a,b);
            System.out.println(v[0] + " " + v[1] + " " + v[2]);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static int[] gcd(int a,int b){
        if(b == 0) {
            return new int[]{a, 1, 0};
        }
        int g[] = gcd(b, a%b);
        int gcd=g[0], x1=g[1], y1=g[2];
        int x=y1;
        int y=x1-(a/b)*y1;
        return new int[]{gcd, x, y};
    }
}
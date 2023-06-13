//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int N) {
        String s = String.valueOf(N);
        int digsum = 0;
        for(int i=0; i<s.length(); i++)
        {
            digsum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        
        String res = String.valueOf(digsum);
        return checker(res, 0, res.length()-1);
        
    }
    
    static int checker(String res, int l, int r)
    {
        if(l>=r)
        {
            return 1;
        }
        else if(res.charAt(l) == res.charAt(r))
        return checker(res, l+1, r-1);
        else return 0;
        }
        
    }

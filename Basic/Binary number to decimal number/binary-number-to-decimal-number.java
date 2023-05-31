//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.binary_to_decimal(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int binary_to_decimal(String str) {
       int n = str.length();
       int power = 0;
       int dec_number = 0;
       
       for(int i = n-1; i>=0; i--)
       {
           if(str.charAt(i) == '1')
           {
               dec_number += 1<<power;
           }
           power++;
       }
       return dec_number;
    }
}
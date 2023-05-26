//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;


// } Driver Code Ends
//User function Template for Java

class Solution{
    

     public static int countSetBits(int A) {
        
        if(A==0){
            return 0;
        }
        int x = largest2xvalue(A);
        int b_tillx = x * (1 << (x - 1));
        int msbfromx_to_A = A - (1 << x) + 1;
        int rest = A - (1 << x);
        int ans  = b_tillx + msbfromx_to_A + countSetBits(rest);
        return ans;
    }
    public static int largest2xvalue (int A)
         {
             int x = 0;
             while((1<<x) <= A)
             {
                 x++;
             }
             return x-1;
         }
}


//{ Driver Code Starts.

// Driver code
class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases
		int x, n;
		while(t-->0) {
	        n = sc.nextInt();//input n

		    Solution obj = new Solution();

		    System.out.println(obj.countSetBits(n));//calling countSetBits() method
		}
	}
}

// } Driver Code Ends
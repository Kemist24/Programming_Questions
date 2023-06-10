//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {   
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            Solution ob = new Solution();
            System.out.println(ob.MaxGcd(n, a));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int MaxGcd(int n, int arr[])
    {
        // Calculating MAX in
        // array
        int high = 0;
        for (int i = 0; i < n; i++)
            high = Math.max(high, arr[i]);
     
        // Maintaining count array
        int count[]=new int[high + 1];
        for (int i = 0; i < n; i++)
            count[arr[i]]++;
     
        // Variable to store
        // the multiples of
        // a number
        int counter = 0;
     
        // Iterating from MAX
        // to 1 GCD is always
        // between MAX and 1
        // The first GCD found
        // will be the highest
        // as we are decrementing
        // the potential GCD
        for (int i = high; i >= 1; i--)
        {
            int j = i;
     
            // Iterating from current
            // potential GCD till it
            // is less than MAX
            while (j <= high)
            {
                // A multiple found
                if (count[j]>0)    
                    counter+=count[j];        
     
                // Incrementing potential
                // GCD by itself
                // To check i, 2i, 3i....
                j += i;
     
                // 2 multiples found,
                // max GCD found
                if (counter == 2)        
                    return i;
            }
            counter=0;
        }
    return 1;
    }
}
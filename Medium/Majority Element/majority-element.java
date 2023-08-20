//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int arr[], int size)
    {
        
        int count = 1;
        int ansIndex = 0;
        int realCount = 0;
        
        for(int i =0; i<arr.length; i++)
        {
            if(arr[i] == arr[ansIndex])
            {
                count++;
                
            }
            else{
                count--;
                
            }
            if(count == 0)
            {
                ansIndex = i;
                count = 1;
            }
        }
        
        for(int i =0; i<arr.length; i++)
        {
            if(arr[i] == arr[ansIndex])
            {
                realCount++;
            }
            
        }
        
        if(realCount > size/2)
        {
            return arr[ansIndex];
        }
        else{
            return -1;
        }

    }
}
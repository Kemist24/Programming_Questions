//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to count inversions in the array.
    
    
    static long mergeSort(long arr[], int si, int ei)
    {
        long inv = 0;
        if(si<ei)
        {
           
        int mid = si + (ei-si)/2;
        
        inv += mergeSort(arr, si, mid);
       inv += mergeSort(arr, mid+1, ei);
       inv += merge(arr, si, mid, ei);
        }
       return inv;
        
    }
    
   static long merge(long arr[], int si, int mid,int ei){
        
        int i = si;
        int j = mid+1;
        int k = 0;
        long inv = 0;
        
        long temp[] = new long[ei-si+1];
        
        while(i<=mid && j <= ei) {
            if(arr[i]<= arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            
            else{
                temp[k] = arr[j];
                inv += (mid-i+1);
                j++;
            }
            k++;
        }
        
        while(i<=mid)
        {
            temp[k++] = arr[i++];
        }
        
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        
        for(k=0, i= si; k<temp.length; k++,i++)
        {
            arr[i] = temp[k];
        }
        
        return inv;
    }
    
    static long inversionCount(long arr[], long N)
    {
        
       return mergeSort(arr, 0, arr.length-1);
    }
}
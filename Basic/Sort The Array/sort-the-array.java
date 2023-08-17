//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 


class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt(); 
            int arr[] = new int[n];
            for (int i = 0; i < n; ++i)
            {
                arr[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            int []ans= obj.sortArr(arr, n);
            for(int i=0;i<n;i++)
            {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int[] sortArr(int[] arr, int n) 
    { 
        int si = 0;
        int ei = n-1;
       return quickSort(arr, si, ei);
         
    }
    
    public static int[] quickSort(int[] arr, int si, int ei)
    {
        if(si>=ei)
        {
            return arr;
        }
        
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1);  //left
        quickSort(arr, pIdx+1, ei);  //right
        return arr;
        
    }
    
    public static int partition(int arr[], int si, int ei)
    {
        int pivot = arr[ei];
        int i = si-1;
        
        for(int j = si; j<ei; j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            
            
        }
        
        i++;
       int temp = pivot;
       arr[ei] = arr[i];
       arr[i] = temp;
        
        return i;
        
    }
} 
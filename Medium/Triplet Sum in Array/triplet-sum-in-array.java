//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int X = Integer.parseInt(inputLine[1]);
		    int A[] = new int[n];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        A[i] = Integer.parseInt(inputLine[i]);
		    }
		    Solution ob=new Solution();
		    boolean ans = ob.find3Numbers(A, n, X);
		    System.out.println(ans?1:0);
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int arr[], int n, int X) { 
    
       if(arr == null || arr.length < 3)
        {
            return false;
        }

        Arrays.sort(arr);
        Set<List<Integer>> result = new HashSet<>();

        for(int i =0; i<arr.length -2; i++) // arr.length -2 because 2 elements cannot form  a triplet so we check upto when there are three elements in array.
        {
            int left = i+1;
            int right = arr.length-1;
            while(left<right)
            {
                int sum = arr[i]+arr[left]+arr[right];
                if(sum == X)
                {
                    return true;
                }
                else if(sum<X)
                {
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        
        return false;
    
    }
}

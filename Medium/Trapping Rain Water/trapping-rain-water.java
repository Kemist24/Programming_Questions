//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        
        //left of first element is the element itself.
        leftMax[0] = arr[0];
        for(int i =1; i<n; i++)
        {
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }
        
        //right of the last element is the element itself.
        rightMax[n-1] = arr[n-1];
        for(int i = n-2; i>=0; i--)
        {
            rightMax[i] = Math.max(rightMax[i+1], arr[i]);
        }
        long trappingRainwater = 0;
        //loop
        for(int i =0; i<arr.length; i++)
        {
            //waterlevel = min(left(max) boundary, right(max) boundary)
            long waterLevel = Math.min(leftMax[i], rightMax[i]);
            
            // ans = waterlevel - height (w-x) (if width is not given 1 then -> ans = (waterlevel - height) * wodth)
            trappingRainwater += (waterLevel - arr[i]);
        }
        return trappingRainwater;
    } 
}



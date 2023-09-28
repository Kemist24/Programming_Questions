//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxAverage(arr, n, k);
            for(int i=ans; i<ans+k; i++)
                System.out.print(arr[i]+" ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int findMaxAverage(int[] arr, int n, int k) {
      

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int ind = 0;

        // Calculate Initial Sum for the first subarray of length 'k'
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }

        maxSum = currentSum;

        // Iterate through the array to find the maximum sum of 'k' consecutive elements
        for (int i = k; i < n; i++) {
            currentSum += arr[i] - arr[i-k]; // Update sum by adding the next element and subtracting the first element in the current subarray
            if (currentSum > maxSum) {
                maxSum = currentSum;
                ind = i-k+1;
            }
            
        }

        // Calculate the maximum average
        return ind;

    }
}

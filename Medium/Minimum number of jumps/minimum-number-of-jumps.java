//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}

// } Driver Code Ends


class Solution{
    static int minJumps(int[] arr){
        int n = arr.length;
        if(n<=1){
            return 0;
        } 
        if(arr[0] == 0) {
            return -1;
            }
        
        int maxr = arr[0];
        int step = arr[0];
        int jump = 1;
        
        for(int i=1; i<n; i++)
        {
            if(i == n-1)
            {
                return jump;
            }
            maxr = Math.max(maxr, i+arr[i]);
            step--;
            if(step ==0)
            {
                jump++;
            if(i>=maxr) {
                return -1;
            }
            step = maxr - i;
        }
        }
         return -1;
    }
    
    
}
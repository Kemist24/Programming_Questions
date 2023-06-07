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
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            ArrayList<Integer> primes  = ob.sieveOfEratosthenes(N);
            for(int prime : primes) {
                System.out.print(prime+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Integer> sieveOfEratosthenes(int N){
     boolean arr[] = new boolean[N+1];
     Arrays.fill(arr, true);
        for (int i =2; i*i<=N; i++) //i*i<=n is same as i<= root(n)
        {
            for(int j =2*i; j<=N; j += i)
            /* j = 2*i because for 2 we want 4 for 
            3 we want 6 that is the second multiple and j= j +i because we want next 
            multiple for that for example after 6 we need 9 so 6 = 6 + i = 9 where i = 3 */
            {
                arr[j] = false;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i=2; i<N+1; i++) 
        {
            if(arr[i]) // if arr[i] = true keep adding elements
            {
                res.add(i);
            }
        }
        return res;
    }
}
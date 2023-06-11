//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            List<String> ans = ob.AllPossibleStrings(s);
            for(String i: ans)
                System.out.print(i + " ");
            System.out.println();
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        ArrayList<String> ans = new ArrayList<>();
       
        recursion(s, 0, "", ans);
        Collections.sort(ans);
        return ans;
      
    }
    
   public static void recursion(String s, int i, String cur, ArrayList<String> ans)
    {
      
        if(i==s.length())
        {
            
                if(cur.length() !=0)
                {
                    ans.add(cur);
                }
                return;
            
        }
         recursion(s, i+1, cur+s.charAt(i), ans);
         recursion(s, i+1, cur, ans);
        
        }
         
    }    
    
    

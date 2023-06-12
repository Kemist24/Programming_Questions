//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends


class Solution {
    public List<String> find_permutation(String s) {
        HashSet<String> set = new HashSet<>();
        permute(s, set, 0);
        List<String> ans = new ArrayList<>(set);
        Collections.sort(ans);
        return ans;
    }
    
    public static void permute(String s, HashSet<String> set, int l)
    {
        if(l >=s.length()-1)
        {
            set.add(s);
            return;
        }
        for(int i=l; i<s.length(); i++)
        {
            s = swap(s, l, i);
            permute(s,set, l+1);
            s = swap(s, l, i); //backtrack
        }
    }
    
    public static String swap(String s,int index,int i){
        char arr[]=s.toCharArray();
        char temp=arr[index];
        arr[index]=arr[i];
        arr[i]=temp;
        String res=new String(arr);
        return res;
    }
}
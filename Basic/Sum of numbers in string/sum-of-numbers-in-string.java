//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st=new StringTokenizer(br.readLine());
	    int t=Integer.parseInt(st.nextToken());
	    while(t-->0){
	        String s=br.readLine();
	        
	        Solution obj = new Solution();
	        
	        System.out.println(obj.findSum(s));
	    }
		
	}
}

// } Driver Code Ends




class Solution
{
    public static boolean isNumber(char c)
    {
        return('0'<= c && c<='9');
    }
    public static long findSum(String str)
    {
        int i = 0;
        int sum = 0;
        while(i<str.length())
        {
            String number = "";
            while(i<str.length() && isNumber(str.charAt(i)))
            {
                number = number + str.charAt(i);
                i++;
            }
            if(number.length()!=0){
                sum += Integer.parseInt(number);
            }
            i++;
        }
        return sum;
    }
    
}
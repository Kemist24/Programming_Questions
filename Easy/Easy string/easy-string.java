//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String s = read.readLine();
            Solution ob = new Solution();
            String ans = ob.transform(s);
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String transform(String str) 
    {
        StringBuilder sb = new StringBuilder("");
        
        for(int i=0; i<str.length(); i++)
        {
            Integer count = 1;
            while(i<str.length()-1 && (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(str.charAt(i+1))))
            {
                count++;
                i++;
            }
             if(count>0){
                sb.append(count.toString());
             }
             
            sb.append(Character.toLowerCase(str.charAt(i)));
           
        }
        return sb.toString();
    }
} 
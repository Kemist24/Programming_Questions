//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            ArrayList<ArrayList<String>> allPart = ob.allPalindromicPerms(S);
            
            for (int i=0; i<allPart.size(); i++)  
            { 
                for (int j=0; j<allPart.get(i).size(); j++) 
                { 
                    System.out.print(allPart.get(i).get(j) + " "); 
                } 
                System.out.println(); 
            } 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
   static ArrayList<ArrayList<String>> allPalindromicPerms(String S) {
       
       
       ArrayList<ArrayList<String>> res=new ArrayList<>();
       
       ArrayList<String> ans=new ArrayList<>();
       
       find(res,"",0,ans,S);
       return res;
   }
   public static void find(ArrayList<ArrayList<String>> res,String ans,int i,ArrayList<String> m,String s)
   {
       
       if(i==s.length())
       {
           if(palin(ans)) //if it is palindromic then only add else continue
           {
               m.add(ans);
               res.add(new ArrayList<>(m));
               m.remove(m.size()-1);
           }
           return;
       }
       
       char ch=s.charAt(i);
       if(palin(ans)&&ans.length()>0)  //size>0 bcz empty string is always palindromic
       {
             m.add(ans); //result set adding our palindromic string
           find(res,"",i,m,s);
           m.remove(m.size()-1); //removing our palindromic string it may form again palindrom
           find(res,ans+ch,i+1,m,s); //adding ith char and gng to next idx
       }
       else
       find(res,ans+ch,i+1,m,s);  //if our string is not palindromic then add ith ch and go for i+1
   }
   public static boolean palin(String s)
   {
       return s.equals(new StringBuilder(s).reverse().toString());
   }
   
}
//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.nQueen(n);
            if(ans.size() == 0)
                System.out.println("-1");
            else {
                for(int i = 0;i < ans.size();i++){
                    System.out.print("[");
                    for(int j = 0;j < ans.get(i).size();j++)
                        System.out.print(ans.get(i).get(j) + " ");
                    System.out.print("] ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static boolean isSafe(ArrayList<Integer> arr, int k, int col) {
        for (int i = 1; i < k; i++) {
            if (arr.get(i) == col || Math.abs(i - k) == Math.abs(arr.get(i) - col)) {
                return false;
            }
        }
        return true;
    }

    static void solveNQueen(int n, int k, ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> list) {
        for (int col = 1; col <= n; col++) {
            if (isSafe(arr, k, col)) {
                arr.set(k, col);
                if (k == n) {
                    arr.remove(0);
                    list.add(new ArrayList<>(arr));
                    arr.add(0,0);
                } else {
                    solveNQueen(n, k + 1, arr, list);
                }
            }
        }
    }

    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>(n + 1);
        
        for (int t = 0; t <= n; t++) {
            arr.add(0);
        }
        solveNQueen(n, 1, arr, list);
        return list;
    }
}
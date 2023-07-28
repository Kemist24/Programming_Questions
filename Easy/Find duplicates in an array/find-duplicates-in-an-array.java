//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        Set<Integer> set = new HashSet();
        Set<Integer> set2 = new HashSet();
        for(int i =0; i<n; i++)
        {
            if(set.contains(arr[i]))
            {
                set2.add(arr[i]);
            }
            else{
                set.add(arr[i]);
            }
        }
        if(set2.isEmpty())
        {
            set2.add(-1);
            return new ArrayList<>(set2);
        }
        ArrayList<Integer> list = new ArrayList<Integer>(set2);
        Collections.sort(list);
        return list;
    }
}

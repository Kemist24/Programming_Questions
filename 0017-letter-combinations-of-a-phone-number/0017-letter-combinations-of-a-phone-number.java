class Solution {

    public static void solve(String digits, int index, String output, ArrayList<String> ans,String mapping[])
    {
        if(index == digits.length())
        {
            ans.add(output);
            return;
        }

        int number  = digits.charAt(index) - '0';
        String val = mapping[number];

        for(int i=0; i<val.length(); i++)
        {
            output = output+val.charAt(i);
            solve(digits, index+1, output, ans, mapping);
            output = output.substring(0, output.length()-1);
        }
    }

    public List<String> letterCombinations(String digits) {
       
      ArrayList<String> ans = new ArrayList<>();
       if(digits.length() == 0)
        {
            return ans;
        }
      String mapping[] ={"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
      solve(digits, 0, "", ans, mapping);
      return ans;
    }
}
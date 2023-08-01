class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() == t.length())
        {
            char sCharArray[] = s.toCharArray();
            char tCharArray[] = t.toCharArray();

            Arrays.sort(sCharArray);
            Arrays.sort(tCharArray);

            if(Arrays.equals(tCharArray, sCharArray))
            {
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}
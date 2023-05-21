class Solution {
public:
    char nextGreatestLetter(vector<char>& letters, char target) {
        int low = 0, mid, high = letters.size()-1, res = letters.size()-1;
        
        if(target >= letters[letters.size()-1] or target < letters[0])
            return letters[0];
        
        while(low<=high)
        {
          
        mid = (low + high)/2;
        if(letters[mid] <= target)
            low = mid + 1;
        else if(letters[mid] > target){
            res = min(res, mid);
            high = mid -1;
        }
      
        }
        return letters[res];
          
    }
};
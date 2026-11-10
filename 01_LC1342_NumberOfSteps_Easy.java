# Intuition
 Describe your first thoughts on how to solve this problem. 

# Approach
 Describe your approach to solving the problem. 

# Complexity
Time complexity:
Add your time complexity here, e.g. $$O(n)$$ 

Space complexity:
 Add your space complexity here, e.g. $$O(n)$$ 

#Code
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        long start = 1;
        long end = num/2;
        long mid = 0;
        long square = 0;
        while(start<=end){
            mid = (start+end)/2;
            square = mid*mid;
            if(square == num){
                return true;
            }
            else if(square>num){
                end = mid-1;
            }
            else if(square<num){
                start = mid+1;
            }
            
        }
        return false;
    }
}

class Solution {
    public int addDigits(int num) {
        while(num >= 10){
            num = findSum(num);
        }

        return num;
    }

    public int findSum(int num) {
        int ans = 0;
        while(num > 0) {
            int temp = num % 10;
            ans += temp;
            num = num / 10;
        }

        return ans;
    }
}

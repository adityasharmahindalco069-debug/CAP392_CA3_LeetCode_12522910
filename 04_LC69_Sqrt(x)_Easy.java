class Solution {
    public int mySqrt(int x) {
        if(x<=1)
        return x;
        long num=x;
        while(num*num>x){
            num=(num+x/num)/2;
        }
        return (int)num;
    }
}

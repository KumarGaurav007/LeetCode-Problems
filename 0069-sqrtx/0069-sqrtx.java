class Solution {
    public int mySqrt(int x) {
        long s =0;
    
        long e =x;
        while(s<=e){
            long mid = s+(e-s)/2;
            if(mid*mid>(long)x){
                e=mid-1;
            }
            else if(mid*mid==(long)x) return (int) mid;
            else s=mid+1;
        }
        return Math.round(e);
    }
}
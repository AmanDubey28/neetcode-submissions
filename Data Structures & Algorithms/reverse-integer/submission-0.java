class Solution {
    public int reverse(int x) {
        long rev = 0;
        while(x!=0){
           int digit=x%10; //remainder i.e. the last digit
           rev= rev*10 + digit;
           x/=10; 
           if(rev>Integer.MAX_VALUE || rev< Integer.MIN_VALUE) return 0;
        }
        return (int) rev; 
    }
}

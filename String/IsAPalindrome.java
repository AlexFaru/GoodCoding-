class Solution {
    public boolean isPalindrome(int x) {
        int number =0;
        if((x%10==0&&x!=0) || x<0)
            return false;
        while(x>number){
            number = number*10 + x%10;
            x = x/10;
        }
        return (number == x || x==number/10);
    }
}

// Name: Number of 1 bits 

/* Write a function that takes an unsigned integer and returns the 
number of '1' bits it has (also known as the Hamming weight). */


public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        for(int i = 0; i < Integer.BYTES*8; i++){
            if((n&1)!=0){
                count++;
            }
            n = n>>>1; //Move my bits 
        }
        return count;
    }
}
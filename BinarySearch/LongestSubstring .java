public class Solution {
private int lo, maxLen;

public String longestPalindrome(String s) {
	int len = s.length();
	if (len < 2)
		return s;
	
    for (int i = 0; i < len-1; i++) {
     	extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
     	extendPalindrome(s, i, i+1); //assume even length. Center of palindrome null
    }
    return s.substring(lo, lo + maxLen); //The sume inclusive + dirence = exclusive
}

private void extendPalindrome(String s, int j, int k) {
	while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) { 
		j--; //This cycle checks over teh center of palindrom
		k++;
	}
	if (maxLen < k - j - 1) {
		lo = j + 1; //This number is inclusive for the substring;
		maxLen = k - j - 1; //Number of elements between two borders;
	}
}}

/* A palindrom can have 2*n-1 centers
where n is the length of the palindrom. */
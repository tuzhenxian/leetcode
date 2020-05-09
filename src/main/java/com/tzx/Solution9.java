package com.tzx;

/**
 * 回文数
 * @author tuzhenxian
 * @date 20-5-8
 */
public class Solution9 {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        return isPalindrome(s,0,s.length()-1);
    }

    public static boolean isPalindrome(String s,int start,int end) {
        if (end-start<1) return true;
        return (s.charAt(start)==s.charAt(end)&&isPalindrome(s,++start,--end));
    }
}

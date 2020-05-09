package com.tzx;


import java.util.Objects;

/**
 * 最长回文子串
 *
 * @author tuzhenxian
 * @date 20-5-7
 */
public class Solution5 {
    //性能不达标
    public String longestPalindrome(String s) {
        int length=0;
        String longest="";
        for (int i = 0; i < s.length(); i++) {
            for(int j=s.length()-1;j>=i;j--){
                    if(j-i+1>length){
                        if(isHw(s,i,j)) {
                            length = Math.max(length, j - i + 1);
                            longest = s.substring(i,j+1);
                            break;
                        }
                    }

            }
        }
        return longest;
    }

    public String longestPalindrome1(String s) {
        String str="";
       for(int i=0;i<s.length();i++){
           String fs=find(s,i);
           str=fs.length()>str.length()?fs:str;
       }
       return str;
    }

    private String find(String s, int low) {
        int high = low;
        while (high < s.length() - 1 && s.charAt(high+1)==s.charAt(low)) {
            high++;
        }
        while (low > 0 && high < s.length() - 1 && s.charAt(low-1) == s.charAt(high+1)) {
            low--;
            high++;
        }
        return s.substring(low,high+1);
    }

    public static boolean isHw(String s,int start,int end) {
        if (end-start<1) return true;
        return (s.charAt(start)==s.charAt(end)&&isHw(s,++start,--end));
    }
    public static void main(String args[]){
        Solution5 s5=new Solution5();
        System.out.println(s5.longestPalindrome1("abbac"));
    }
}

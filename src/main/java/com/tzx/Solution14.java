package com.tzx;

/**
 * 最长公共前缀
 *
 * @author tuzhenxian
 * @date 20-5-9
 */
public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)return "";
        if(strs.length==1)return strs[0];
        String common=strs[0];
        int i=1;
        while(i<strs.length){
            common=findCommonPrefix(common,strs[i++]);
        }
        return common;
    }

    public String findCommonPrefix(String s1,String s2){
        if(s1.length()==0||s2.length()==0)return "";
        int i=0;
        while (i<s1.length()&&i<s2.length()&&s1.charAt(i)==s2.charAt(i)){
            i++;
        }
        return s1.substring(0,i);
    }

    public static void main(String args[]){
        Solution14 s14=new Solution14();
        s14.longestCommonPrefix(new String[]{"tt","ttt","tttt"});
    }
}

package com.tzx;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 字符串转换整数 (atoi)
 *
 * @author tuzhenxian
 * @date 20-5-8
 */
public class Solution8 {
    public int myAtoi(String str) {
        Set<Character> s1=new HashSet<>(Arrays.asList('1','2','3','4','5','6','7','8','9','0','-','+'));
        Set<String> s2=new HashSet<>(Arrays.asList("-","+"));
        StringBuilder sb=new StringBuilder();
        str=str.trim();
        int i=0;
        while(i<str.length()&&s1.contains(str.charAt(i))){
            sb.append(str.charAt(i++));
        }
        String s=sb.toString();
        if(s.length()==0||(s.length()==1&&s2.contains(s)))return 0;
        Long l=Long.parseLong(s);
        if(l>0x7fffffff)return 0x7fffffff;
        if(l<0x80000000)return 0x80000000;
        return l.intValue();
    }

    public static void main(String args[]){
        Solution8 s8=new Solution8();
        System.out.println(s8.myAtoi("--"));
    }
}

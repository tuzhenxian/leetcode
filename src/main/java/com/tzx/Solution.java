package com.tzx;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 无重复字符的最长子串
 *
 * @author tuzhenxian
 * @date 20-5-7
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Byte> set=new HashSet<Byte>();
        int length=0;
        byte[] bytes=s.getBytes();
        for(int i=0;bytes.length-length>i;i++){
            int j=i;
            while (set.add(bytes[j])){
                if(j<bytes.length-1)  j++;
            }
            length=set.size()>length?set.size():length;
            set.clear();
        }
        return length;
    }
    //better
    public int lengthOfLongestSubstring1(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha), start);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return ans;
    }


    public static void main(String args[]){
        Solution solution=new Solution();
    }
}


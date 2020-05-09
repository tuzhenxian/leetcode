package com.tzx;

/**
 * 整数反转
 *
 * @author tuzhenxian
 * @date 20-5-8
 */

public class Solution7 {
    public int reverse(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x /=10;
        }
        return (int)n==n? (int)n:0;
    }

   public static void main(String args[]){
       Solution7 s7=new Solution7();
       System.out.println(s7.reverse(1534236469));
       System.out.println(0x7fffffff>1534236469);
   }
}

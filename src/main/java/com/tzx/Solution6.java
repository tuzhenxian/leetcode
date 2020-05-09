package com.tzx;

/**
 * @author tuzhenxian
 * @date 20-5-8
 */
public class Solution6 {
    public String convert(String s, int numRows) {
        char[] sChar = s.toCharArray();
        String result = "";

        if (numRows <= 1)
            return s;

        for(int i=0; i < numRows; i++){
            int up = i;  // 上方的行数
            int down = numRows - 1 - i;  //下方的行数
            int temp = i;
            int count = 0;
            while(temp < sChar.length){
                if(count % 2 == 0 && down != 0){ //向下
                    result += sChar[temp];
                    temp += 2 * down;
                } else if(count % 2 != 0 && up != 0) {
                    result += sChar[temp];
                    temp += 2 * up;
                }
                count ++;
            }
        }
        return result;
    }

    public static void main(String args[]){
        Solution6 s6=new Solution6();
        System.out.println(s6.convert("PAYPALISHIRING",                3));
    }
}
package com.tzx;

/**
 * 盛最多水的容器
 *
 * @author tuzhenxian
 * @date 20-5-8
 */
public class Solution11 {
    public int maxArea(int[] height) {
        //s=min(h1,h2)*abs(a1-a2)
        int[] range=new int[2];
        for(int i=0;i<height.length;i++){
            for(int j=height.length-1;j>i;j--){
                if(j-i>range[0]||Math.min(height[i],height[j])>range[1]){
                    if(Math.min(height[i],height[j])*(j-i)>range[0]*range[1]){
                        range[0]=j-i;
                        range[1]=Math.min(height[i],height[j]);
                    }
                }
            }
        }
        return range[0]*range[1];
    }
}

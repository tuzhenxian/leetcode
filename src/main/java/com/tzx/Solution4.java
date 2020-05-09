package com.tzx;

import static java.util.Arrays.asList;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * @author tuzhenxian
 * @date 20-5-7
 */
public class Solution4 {
    //. 寻找两个正序数组的中位数
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total=nums1.length+nums2.length;
        int[] ordered=new int[total];
        int p1=0,p2=0,cur=0;
        while(p1<nums1.length||p2<nums2.length){
            if(p1==nums1.length){
                System.arraycopy(nums2,p2,ordered,cur,nums2.length-p2);
                break;
            }

            if(p2==nums2.length){
                System.arraycopy(nums1,p1,ordered,cur,nums1.length-p1);
                break;
            }

            if(nums1[p1]<nums2[p2]){
                ordered[cur]=nums1[p1++];
            }else{
                ordered[cur]=nums2[p2++];
            }
            cur++;
        }
        if((total&1)==0){
          return (ordered[total/2]+ordered[total/2-1])/2.0;
        }else{
            return ordered[(total-1)/2];
        }
    }

    public static void main(String args[]){
        Solution4 s4=new Solution4();
        System.out.println(s4.findMedianSortedArrays(new int[]{1,2},new int[]{3,4}));
    }
}

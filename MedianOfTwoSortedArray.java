/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allleetcodeprojects;

/**
 *
 * @author Asus
 */
public class MedianOfTwoSortedArray {
    @SuppressWarnings("empty-statement")
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int count1=0,count2=0;
        if((nums1.length+nums2.length)%2 != 0){
            for (int i = 0; i < ((nums1.length + nums2.length) / 2); i++) {

                if (count2 == nums2.length || nums1[count1] < nums2[count2]) {
                    count1++;
                } else if (count1 == nums1.length || nums1[count1] >= nums2[count2]) {
                    count2++;
                } else {
                    return 0;
                }

            }
            if (count1 == nums1.length) {
                return nums2[count2];
            }
            if (count2 == nums2.length) {
                return nums1[count1];
            }

            if (nums1[count1] < nums2[count2]) {
                return nums1[count1];
            }

            return nums2[count2];
        }
        else{
            for (int i = 0; i < ((nums1.length + nums2.length)-1 / 2); i++) {

                if (count2 == nums2.length || nums1[count1] < nums2[count2]) {
                    count1++;
                } else if (count1 == nums1.length || nums1[count1] >= nums2[count2]) {
                    count2++;
                } else {
                    return 0;
                }

            }
            if (count1 == nums1.length) {
                return nums2[count2];
            }
            if (count2 == nums2.length) {
                return nums1[count1];
            }

            if (nums1[count1] < nums2[count2]) {
                return nums1[count1];
            }

            return nums2[count2];
        }
        
    }
}

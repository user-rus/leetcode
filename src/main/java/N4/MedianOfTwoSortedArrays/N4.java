package N4.MedianOfTwoSortedArrays;

import java.util.*;

public class N4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double answer = 0.0;
        int[] nums3 = new int[nums1.length + nums2.length];
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            nums3[i] = nums1[i];
            count++;
        }

        for (int i = 0; i < nums2.length; i++) {
            nums3[count++] = nums2[i];
        }
        Arrays.sort(nums3);
        for (int i = 0; i < nums3.length; i++) {
            System.out.print(nums3[i] + " ");
        }

        if (nums3.length % 2 == 1) {
            int i = (nums3.length - 1) / 2 ;
            answer = nums3[i];
        }else {
            int i = (nums3.length - 1) / 2 ;
            answer = (double) (nums3[i]+nums3[i+1])/2;
        }


        return answer;
    }


    public static void main(String[] args) {

        System.out.println(findMedianSortedArrays(new int[]{1, 1}, new int[]{1, 2}));
    }
}

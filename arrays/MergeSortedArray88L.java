package arrays;

import java.util.Arrays;

public class MergeSortedArray88L {
    public static void mergeApproach1(int[] nums1, int m, int[] nums2, int n) {
    
        
        for(int i=0;i<n;i++){
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);

    }

    public static void mergeApproach2(int[] nums1, int m, int[] nums2, int n) {
    
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

    }
    

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        mergeApproach2(nums1, m, nums2, n);

        Arrays.stream(nums1).forEach(System.out::println);
    }

    
}

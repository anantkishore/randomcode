package in.kishore.anant.july.day2;

public class MergeSortedArray {

    /*

    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
     */
    public static void main(String[] args) {

        int[] nums1 = {2,0};
        int[] nums2 = {1};

        int m = 3;
        int n = nums2.length;

        merge(nums1, 1, nums2, 1);

        for (int i : nums1) {
            System.out.print(i + " ");
        }

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        if(m+n>1)
            for (int i = 0; i < m; i++) {
                swap(nums1, i, m + i);
            }

        int i = m-1;
        int j = 0;
        int k = 0;
        while (m > 0 && i < m + n && j < n) {
            if (nums1[i] < nums2[j]) {
                nums1[k] = nums1[i];
                i++;
            } else {
                nums1[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (m > 0 && i < m + n) {
            nums1[k] = nums1[m + i];
            k++;
            i++;
        }

        while (j < n) {
            nums1[k] = nums2[j];
            j++;
            k++;
        }

    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

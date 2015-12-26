public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if ((m+n)%2==0)
        {
            return (find(nums1, 0, m, nums2, 0, n, (m+n)/2)+find(nums1, 0, m, nums2, 0, n, (m+n)/2+1))/2.0;
        }
        else
        {
            return find(nums1, 0, m, nums2, 0, n, (m+n+1)/2);
        }
        
    }
    
    public int find(int[] nums1, int startm, int m, int[] nums2, int startn, int n, int k)
    {
        if (m>n)
        {
            return find(nums2, startn, n, nums1, startm, m, k);
        }
        if (m==0)
        {
            return nums2[startn+k-1];
        }
        if (k==1)
        {
            return Math.min(nums1[startm+0], nums2[startn+0]);
        }
        int pa = Math.min(k/2, m);
        int pb = k-pa;
        if (nums1[startm+pa-1]<nums2[startn+pb-1])
        {
            return find(nums1, startm + pa, m - pa, nums2, startn, n, k - pa);
        }
        else if (nums1[startm+pa-1]>nums2[startn+pb-1])
        {
            return find(nums1, startm, m, nums2, startn + pb, n - pb, k - pb);
        }
        else
        {
            return nums1[startm+pa-1];
        }
    }
}
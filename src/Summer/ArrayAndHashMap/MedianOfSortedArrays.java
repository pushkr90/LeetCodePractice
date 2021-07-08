package Summer.ArrayAndHashMap;

public class MedianOfSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3=new int[nums1.length+nums2.length];

        int i=nums1.length-1;
        int j=nums2.length-1;
        int k=nums1.length+nums2.length-1;
        while(i>=0 &&j>=0)
        {
            if(nums1[i]<nums2[j])
            {
                nums3[k]=nums2[j];
                k--;
                j--;
            }
            else
            {
                nums3[k]=nums1[i];
                k--;
                i--;
            }

        }
        while(i>=0)
        {
            nums3[k]=nums1[i];
            k--;
            i--;
        }

        while(j>=0)

        {
            nums3[k]=nums2[j];
            k--;
            j--;
        }
        double median;
        if(nums3.length%2==0)
        {
            median=(double) nums3[(nums3.length/2)-1]+nums3[nums3.length/2];

        }
        else{
            median=(double) nums3[nums3.length/2];
        }
        return median;

    }
}

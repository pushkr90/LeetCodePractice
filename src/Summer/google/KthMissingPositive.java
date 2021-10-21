package Summer.google;

import java.util.HashMap;
import java.util.HashSet;

public class KthMissingPositive {
    public int findKthPositive(int[] arr, int k) {
        int count = 1;
        int i = 0;

        while (k != 0 && i < arr.length) {
            if (arr[i] != count) {
                k--;

                if (k == 0) return count;
                count++;
            } else {
                i++;
                count++;

            }
        }

        if (k != 0) {
            return count + k - 1;

        }
        return count;
    }}

     /*   HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
           set.add(arr[i]);
        }
        while(k!=0)
        {
            if(!set.contains(count))
            {
                k--;
                if(k==0) break;
                count++;
            }
            else{
                count++;
            }
        }

        return count;*/


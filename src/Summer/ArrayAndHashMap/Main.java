package Summer.ArrayAndHashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        TwoSum twoSum=new TwoSum();
        int[]nums=new int[]{2,7,11,15};
        int target=9;
        int[] res=twoSum.twoSum(nums,target);
        System.out.println(Arrays.toString(res));


        RobotBoundedInCircle robo=new RobotBoundedInCircle();
        String instructions = "GGLLGG";
        System.out.println(robo.isRobotBounded(instructions));

        TrappingOfRainWater tp=new TrappingOfRainWater();
        int height[]=new int[]{4,2,0,3,2,5};
        System.out.println("tp"+tp.trap(height));

        BestTimeToBuySellStock buy=new BestTimeToBuySellStock();
        int[] prices=new int[]{7,1,5,3,6,4};
        System.out.println(buy.maxProfit(prices));
        WordBreak wb=new WordBreak();
        String s="leetcode";
        List<String> wordDict=new ArrayList<>();
        wordDict.add("code");
        wordDict.add("leet");
        System.out.println(wb.wordBreak(s,wordDict));

        Permutations pem=new Permutations();
        int nums1[]=new int[]{1,2,3};
        System.out.println(pem.permute(nums1));


    }
}

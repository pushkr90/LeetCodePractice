package Summer.ArrayAndHashMap;

import java.util.Arrays;

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


    }
}

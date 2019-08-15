package com.jiangwz.leetcode.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jiangwz
 * @create 2019/8/15.
 */
public class TwoSum {

    static int[] nums = new int[]{1, 5, 5, 15};
    static int target = 10;

    public static void main(String[] args) {
        TwoSum t = new TwoSum();
        int[] ints = t.towSum(nums, target);
        System.out.println(Arrays.toString(ints));
    }

    private int[] towSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]))
                return new int[]{map.get(target - nums[i]), i};
            map.put( nums[i], i);
        }
        throw new IllegalArgumentException(" No solution ");
    }
}

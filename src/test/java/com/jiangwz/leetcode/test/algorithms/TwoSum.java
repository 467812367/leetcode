package com.jiangwz.leetcode.test.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * @author jiangwz
 * @create 2019/8/15.
 */
public class TwoSum {


//    int [] nums = new int[]{2,7,11,15};
//    int target = 9;
    int [] nums = new int[]{1,5,5,15};
    int target = 10;

    @Test
    public void run() throws Exception {
        long start = System.currentTimeMillis();
//        int[] ints = twoSumMyself(nums, target);
//        int[] ints = twoSum(nums, target);
        int[] ints = twoSum02(nums, target);
        System.out.println("cost " + (System.currentTimeMillis() - start));
        System.out.println(Arrays.toString(ints));
    }

    /**
     * 我自己第一次想出来的方式
     *
     * 执行用时 :86 ms, 在所有 Java 提交中击败了9.36%的用户
     * 内存消耗 :37.8 MB, 在所有 Java 提交中击败了83.56%
     * 的用户
     * @param nums
     * @param target
     * @return
     * @throws Exception
     */
    public int[] twoSumMyself(int[] nums, int target) throws Exception {
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = i+1; i1 < nums.length; i1++) {
                if (nums[i] + nums[i1] == target && (i!= i1)) {
                    return new int[]{i, i1};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 暴力解法
     *
     * 执行用时 :
     * 41 ms, 在所有 Java 提交中击败了49.37%的用户
     * 内存消耗 :37.5 MB, 在所有 Java 提交中击败了87.76%的用户
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 这种方法最牛
     * Runtime: 2 ms, faster than 98.89% of Java online submissions（在线提交速度） for Two Sum.
     * Memory Usage: 37.4 MB, less than 98.95% of Java online submissions for Two Sum.
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum02(int[] nums, int target) {
        Map<Integer,Integer> numsMap = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            if(numsMap.containsKey(target-nums[i]))
                return new int [] {numsMap.get(target-nums[i]),i};
            numsMap.put(nums[i],i);
        }
        throw new IllegalArgumentException("no match found");
    }


}

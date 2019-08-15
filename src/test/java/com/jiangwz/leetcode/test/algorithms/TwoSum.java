package com.jiangwz.leetcode.test.algorithms;

import java.util.Arrays;

import org.junit.Test;

/**
 * @author jiangwz
 * @create 2019/8/15.
 */
public class TwoSum {


    int [] nums = new int[]{2,7,11,15};
    int target = 9;

    @Test
    public void run() throws Exception {
        int[] ints = twoSumMyself(nums, target);
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
            for (int i1 = 1; i1 < nums.length; i1++) {
                if (nums[i] + nums[i1] == target && (i!= i1)) {
                    return new int[]{i, i1};
                }
            }

        }
        throw  new Exception(" not exsits");
    }

}

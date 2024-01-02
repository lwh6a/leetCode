package com.lwh6a.leetcode.solution;

import com.lwh6a.leetcode.utilPoJo.TreeNode;

/**
 * @author lwh6a
 * @since 2024/1/2
 */

public class Solution108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        return primary(nums, 0, nums.length - 1);
    }

    public TreeNode primary(int[] nums, int left, int right){
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = primary(nums, left, mid - 1);
        treeNode.right = primary(nums, mid + 1, right);
        return treeNode;
    }

}

import java.util.*;

class Solution {
    private int current;

    TreeNode<Integer> getKthLargest(TreeNode<Integer> root, int k) {
        if (root == null) {
            return null;
        }
        TreeNode<Integer> right = getKthLargest(root.getRight(), k);
        if (right != null && current == k) {
            return right;
        }
        current++;
        if (current == k) {
            return root;
        }

        return getKthLargest(root.getLeft(), k);
    }
}


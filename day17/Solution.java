import java.util.*;

public class Solution {
    public int lengthLongestPath(String input) {
        String[] files = input.split("\n");
        int[] stack = new int[files.length + 1];
        int maxLength = 0;
        stack[0] = 0;
        for (String s : files) {
            int level = s.lastIndexOf("\t") + 1;
            int curLength = stack[level] + s.length() - level + 1;
            stack[level + 1] = curLength;
            if (s.contains(".")) {
                maxLength = Math.max(maxLength, curLength - 1);
            }
        }
        return maxLength;
    }
    public static void main(String[] args){
    	Solution s = new Solution();
    	System.out.println(s.lengthLongestPath("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"));
    }
}

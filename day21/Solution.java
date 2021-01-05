import java.util.*;

public class Solution {
    public int minMeetingRooms(int[][] intervals) {
    Arrays.sort(intervals, Comparator.comparing((int[] itv) -> itv[0]));
 
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    int count = 0;
    for (int[] itv : intervals) {
        if (heap.isEmpty()) {
            count++;
            heap.offer(itv[1]);
        } else {
            if (itv[0] >= heap.peek()) {
                heap.poll();
            } else {
                count++;
            }
 
            heap.offer(itv[1]);
        }
    }
 
    return count;
}
    public static void main(String[] args){
    	Solution s = new Solution();
    	int[][] arr = {{30, 75}, {0, 50}, {60, 150}};
    	System.out.println(s.minMeetingRooms(arr));
    }
}

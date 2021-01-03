import java.util.*;

class Solution{
	public void highest(int[] arr, int k){
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		int i = 0;
		for(;i<k;i++){
			q.add(arr[i]);
		}
		System.out.println(q.peek());
		q.remove(arr[0]);
		for(;i<arr.length;i++){
			q.add(arr[i]);
			System.out.println(q.peek());
			q.remove(arr[i-k+1]);
		}
	}
	public static void main(String[] args){
		Solution sol =  new Solution();
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = s.nextInt();
		}
		sol.highest(arr,k);
	}
}

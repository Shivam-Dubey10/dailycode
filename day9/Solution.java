import java.util.*;

class Solution{
	public int adjSum(int[] arr){
		int sum1=arr[0];
		int sum2=arr[1];
		for(int i=0;i<arr.length-3;){
			if(arr[i]+arr[i+2]>=arr[i]+arr[i+3]){
				sum1=sum1+arr[i]+arr[i+2]-arr[i];
				i=i+2;
			}
			else{
				sum1=sum1+arr[i]+arr[i+3]-arr[i];
				i=i+3;
			}
		}
		for(int i=1;i<arr.length-3;){
			if(arr[i]+arr[i+2]>=arr[i]+arr[i+3]){
				sum1=sum1+arr[i]+arr[i+2]-arr[i];
				i=i+2;
			}
			else{
				sum1=sum1+arr[i]+arr[i+3]-arr[i];
				i=i+3;
			}
		}
		if(sum1>=sum2){
			return sum1;
		}
		else{
			return sum2;
		}
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		Solution sol = new Solution();
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		System.out.println(sol.adjSum(arr));
	}
}
//time complexity: O(n)

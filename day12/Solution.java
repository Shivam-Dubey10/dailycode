import java.util.Scanner;

class Solution{
	public int uniqueWays(int n){
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		else if(n==2){
			return 2;
		}
		else{
			return (uniqueWays(n-1)+uniqueWays(n-2));
		}
		
	}
	public static void main(String[] args){
		Scanner s =  new Scanner(System.in);
		int n = s.nextInt();
		Solution sol = new Solution();
		System.out.println(sol.uniqueWays(n));
	}
}

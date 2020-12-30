class Solution{
	int[] arr;
	int maxLength;
	int count;
	public Solution(int n){
		this.arr=new int[n];
		this.maxLength=n;
		this.count=0;
	}
	public void record(int order_id){
		arr[count]=order_id;
		count=count+1;
	}
	public int get_last(int i){
		return arr[count-i-1];
	}
	public static void main(String[] args){
		Solution s = new Solution(5);
		s.record(1);
		s.record(2);
		s.record(3);
		s.record(4);
		s.record(5);
		System.out.println(s.get_last(2));
	}
}
		
		

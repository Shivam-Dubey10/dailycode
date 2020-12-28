import java.util.Scanner;
import java.util.ArrayList;

class Solution{
	public String longestString(String str, int k){
		ArrayList<String> arr1 = new ArrayList<String>();
		ArrayList<Character> arr = new ArrayList<Character>();
		for(int j=0;j<str.length();j++){
		int k1=0;
			for(int i=j;i<str.length();i++){
				char c=str.charAt(i);
				if(arr.size()==0){
					arr.add(c);
					k1++;
				}
				else{
					if(arr.contains(c)){
						arr.add(c);
					}
					else{
						k1++;
						if(k1<=k){
							arr.add(c);
						}
					}
				}
				if(k1>k){
					break;
				}
			}
			arr1.add(arr.toString()
                            .substring(1, 3*arr.size()-1)
                            .replaceAll(", ", ""));
			arr.clear();
		}
		int max = (arr1.get(0)).length();
		int maxIndex=0;
		for(int i=1;i<arr1.size();i++){
			//System.out.println(arr1.get(i));
			if((arr1.get(i)).length()>max){
				max=(arr1.get(i)).length();
				maxIndex=i;
			}
		}
		return (arr1.get(maxIndex));
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int k=s.nextInt();
		String str = s.next();
		Solution sol = new Solution();
		System.out.println(sol.longestString(str,k));
	}
}

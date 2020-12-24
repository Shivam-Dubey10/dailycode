import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

class Solution1{
	private static Timer timer = new Timer();
	public static void gun(Bottle bot,int n){
		timer.schedule(new TimerTask() {
            		@Override
            		public void run() {
                		bot.f();
                		timer.cancel();
            		}
        	}, n);
        	
	}
	public static void main(String[] args){
		Solution sol = new Solution();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		gun(sol,n);
	}
}
interface Bottle{
	public void f();
}
class Solution implements Bottle{
	public void f(){
		System.out.println("Hello World");
	}
}

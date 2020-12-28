import java.util.Random;

public final class pi{
	private static final Random r = new Random();
	private static int N = 1000000;
	public static void main(String[] args){
		N = args.length>0?Integer.parseInt(args[0]):N;
		double pi_approx = 3.0;
		double n = 0.0;
		for(int i=1;i<N;i++){
			Double x = r.nextDouble();
			Double y = r.nextDouble();
			if((x*x)+(y*y)<=1){
				n++;
			}
			pi_approx=4*n/i;
		}
		System.out.println(pi_approx);
	}
}

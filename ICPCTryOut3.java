import java.util.*;

public class ICPCTryOut3 {

	public static void main(String[] args) {
	
		double w, g, h, r;
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int n = sc.nextInt();
			for(int i = 0; i < n; i++) {
				w = sc.nextDouble();
				g = sc.nextDouble();
				h = sc.nextDouble();
				r = sc.nextDouble();
				
				double min = Math.sqrt(Math.pow((Math.max(h, g) - Math.min(h, g)), 2) + w*w);
				double left = w *  (g-r)/ (h+g-2*r);
				double right = w * (h-r)/ (h+g-2*r);
				double max = Math.sqrt(left*left + (g-r) * (g-r)) + Math.sqrt(right*right + (h-r)*(h-r));
				System.out.println(min + " " + max);
			}
		}
	}

}

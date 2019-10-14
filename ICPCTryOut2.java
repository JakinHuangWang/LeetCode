import java.util.*;

public class ICPCTryOut2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.nextLine();
			String dnd = new String();
			
			dnd += str.charAt(0);
			for(int i = 1; i < str.length(); i++) {
				if(str.charAt(i) != str.charAt(i-1))
					dnd += str.charAt(i);
			}
			
			if(dnd.length() == 1) {System.out.println(0);}
			else {
				HashMap<Character, Integer> last_occur = new HashMap<>();
				int num = 0, increase = 0;
				for(int i = 0; i < dnd.length(); i++) {
					if(!last_occur.containsKey(dnd.charAt(i))) {
						num += increase;
						increase++;
					}else
						num += (i - last_occur.get(dnd.charAt(i))) - 1;
					last_occur.put(dnd.charAt(i), i);
					System.out.println(num + ", " + increase);
					}
				System.out.println(last_occur);
			}
		}
		
	}

}

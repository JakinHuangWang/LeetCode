import java.util.*;

public class ICPCTryOut {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Map<Character, Integer> vowels = new HashMap<>();
		vowels.put('A', 1);
		vowels.put('E', 2);
		vowels.put('I', 3);
		vowels.put('O', 4);
		vowels.put('U', 5);
		
		while(sc.hasNextInt()) {
			Map<String, String> hash = new HashMap<>();
			int n = Integer.parseInt(sc.nextLine());
			for(int i = 0; i < n; i++) {
				String orig = sc.nextLine();
				if(!hash.containsValue(orig)) {
					String noVowel = new String();
					for(char ch: orig.toCharArray()) {
						if(!vowels.containsKey(ch))
							noVowel += ch;
					}
					hash.put(noVowel, orig);
				}
			}
			
			String message = sc.nextLine();
			int start = 0, end = 0;
			while(end <= message.length()) {
				String sub = message.substring(start, end);
				if(hash.containsKey(sub)){
					if(end < message.length())
						System.out.print(hash.get(sub) + " ");
					else
						System.out.println(hash.get(sub));
					start = end;
				}
				end++;
			}
		}
	}
}
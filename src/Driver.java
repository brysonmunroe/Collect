import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class Driver {

	public static void main(String[] args) {
		String[] string = {"z","a","a","b","d","s","h","v", "f"};
		List<String> list = Arrays.asList(string);
		
		
		//Use TreeMap if you want to guarantee order
		//TreeMap will sort based on keys and maintain values of insertion, 
		//but HashMap maintains absolutely no order
		HashAndTree(string, list);
	}
	
	public static void HashAndTree(String[] string, List<String> list){
		HashMap<String, Integer> hash = new HashMap<>();
		TreeMap<String, Integer> tree = new TreeMap<>();
		Set<String> hashset = new HashSet<String>(list);
		System.out.printf("Unique Values: %s", hashset);
		System.out.println(" ");
		for(int i = 0; i<string.length; i++) {
			hash.put(string[i], i);
			tree.put(string[i], i);
		}
		System.out.println("HashMap: ");
		for(String key : hash.keySet()) {
			System.out.println(key + ": " + hash.get(key));
		}
		
		System.out.println("TreeMap");
		for(String key : tree.keySet()) {
			System.out.println(key + ": " + tree.get(key));
		}
		
	}
	

}

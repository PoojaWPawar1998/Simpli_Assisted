package map;

import java.util.*;

public class map {

	public static void main(String[] args) {
		
		System.out.println("\n");
		System.out.println("HashMap Elements");
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(01," Samar");
		hm.put(02," Ram");
		for(Map.Entry n:hm.entrySet()) {
			System.out.println(n.getKey()+""+n.getValue());
		}
		
		System.out.println("\n");
		System.out.println("HashTable Elements");
		Hashtable<Integer, String> ht= new Hashtable<Integer, String>();
		ht.put(3," Aayush");
		ht.put(4," Rani");
		for(Map.Entry o:ht.entrySet()) {
			System.out.println(o.getKey()+""+o.getValue());
		}
		
		System.out.println("\n");
		System.out.println("TreeMap Elements");
		TreeMap<Integer, String> tm= new TreeMap<Integer, String>();
		tm.put(5," Pooja");
		tm.put(6," sushila");
		for(Map.Entry p:tm.entrySet()) {
			System.out.println(p.getKey()+""+p.getValue());
		}
		
	}

}

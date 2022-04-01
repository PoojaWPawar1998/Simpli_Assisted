package collections;
import java.util.*;
public class collections {

	public static void main(String[] args) {
		
		    System.out.println("\n");
		    System.out.println("Arraylist");
			ArrayList<String> colors = new ArrayList<>();
			
			colors.add("Rose");
			colors.add("Lavender");
			colors.add("Daisy");
			colors.add("Lily");
			System.out.println("Arraylist: " +colors);
			
			
			System.out.println("\n");
			System.out.println("Vector");
			Vector<String> vec = new Vector<>();
		
			vec.add("BMW");
			vec.add("Jaguar");
		
			vec.addElement("Ferrari");
			vec.addElement("Porsche");
			
			System.out.println("Size is: " +vec.size());
			System.out.println("Capacity is" +vec.capacity());
			System.out.println("Vector: " +vec);
			
			
			System.out.println("\n");
			System.out.println("LinkedList");
			LinkedList<String> name = new LinkedList<String>();
		
			name.add("Ritu");
			name.add("Arjun");
			name.add("Rahul");
			name.add("Vijay");
			Iterator<String> itr= name.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			
		
			System.out.println("\n");
			System.out.println("HashSet");
			HashSet<Integer> set=new HashSet<Integer>();
			set.add(103);
			set.add(104);
			set.add(105);
			System.out.println(set);
			
			System.out.println("\n");
			System.out.println("LinkedHashSet");
			LinkedHashSet<Integer> num=new LinkedHashSet<Integer>();
			num.add(111);
			num.add(122);
			num.add(133);
			System.out.println(num);
			
			
		}

	}
	}



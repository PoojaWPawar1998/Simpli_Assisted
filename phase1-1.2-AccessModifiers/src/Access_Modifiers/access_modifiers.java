package Access_Modifiers;

class defult{
	void massage() {
		System.out.println("This the a massage");
	}
}
 class Flower {
	public int Petalscount;
	
	public void display() {
		System.out.println("I am an Flower");
		System.out.println("I have "+Petalscount+" Petals.");

	}
	
}
 class FlowerName{
	 private String name;
	 public String getName(){
		 return this.name;
		 
	 }
	 public void setName(String name) {
		 this.name=name;
	 }
 }
public class access_modifiers {
	public static void main(String args[]) {
		 Flower  animal = new  Flower();
		animal.Petalscount=5;
		animal.display();
		
		FlowerName an= new FlowerName();
		an.setName("Rose");
		System.out.println(an.getName());
		
		
	}
}
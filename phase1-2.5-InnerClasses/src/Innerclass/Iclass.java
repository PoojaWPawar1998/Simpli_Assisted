package Innerclass;

 class  Oclass
 {
	int x = 50;

   class Iclass
   {
	int  y=60;
	
   }
 }
 
public class Iclass  
{

	public static void main(String[] args)
	{
		Oclass myouter = new Oclass();
		Oclass.Iclass myinner= myouter.new Iclass();
	    System.out.println(myinner.y + myouter.x);
	   
	}

}

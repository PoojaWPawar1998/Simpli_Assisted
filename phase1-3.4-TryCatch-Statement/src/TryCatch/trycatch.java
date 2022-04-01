package TryCatch;
import java.io.*;

class NumberList{
	
	private int[] list = {5, 4, 8, 6, 2};
	
	public void writeList() {
		
		PrintWriter out = null;
		try {
			System.out.println("Try Statement");
			out = new PrintWriter(new FileWriter("OutputFile.txt"));
			
			for (int i = 0; i < 7; i++) {
				out.println("Value at: " + i + " = " + list[i]);
				}
			}
		catch (Exception e) {
			
			System.out.println("Exception => " + e.getMessage());
			
			}
		
		finally {
			
			if (out != null) {
				
	        System.out.println("Closing PrintWriter");
	        out.close();
	      }
			else {
				System.out.println("PrintWriter not open");
				}
			}
		}
	}

public class trycatch {
	
	public static void main(String[] args) {
		
		NumberList list = new NumberList();
	    list.writeList();
	}

}

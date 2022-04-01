package p1;
import java.io.File;
import java.io.IOException;
public class CreateFileDemo {
	public static void main(String[] args) {
      File myFile= new File("data2.txt");
      try {
		if(myFile.createNewFile()) {
			 System.out.println("File created successfully");
		    }
		 else {
			 System.out.println("File Creation Error");
		
		 }
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("File Error");
	}
	}

}

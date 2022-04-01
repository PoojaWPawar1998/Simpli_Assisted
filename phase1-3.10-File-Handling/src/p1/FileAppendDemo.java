package p1;

import java.io.FileWriter;
import java.io.IOException;

public class FileAppendDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data=" This Data is Append..";
		try {
			FileWriter output= new FileWriter("data1.txt",true);
			output.write(data);
			System.out.println("Data Append Successfully");
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File Append Error...");
		}

	}

}

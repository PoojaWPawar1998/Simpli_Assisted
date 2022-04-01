package Filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class UpdateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data=" This Data is Append..";
		try {
			FileWriter output= new FileWriter("data3.txt",true);
			output.write(data);
			System.out.println("Data Update Successfully");
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Data Update Error...");
		}

	}

}


package p1;

import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char[] data=new char[100];
        try {
			FileReader input= new FileReader("data1.txt");
			input.read(data);
			System.out.println("Data Received from a File");
			System.out.println(data);
			input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File Read Error...");
		}
	}

}

package p1;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="101,p.pawar,pune,mharashtra,India";
		try {
			FileWriter output= new FileWriter("data1.txt");
			output.write(data);
			System.out.println("Data is Written Successfully");
			output.close();
		} catch (IOException e) {
			System.out.println("File Write Error...");
		}
	}

}

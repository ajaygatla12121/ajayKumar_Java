package firstquestion;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Project_Deserializer {

	static Employee e;
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		try {

			FileInputStream fis = new FileInputStream("C:\\New folder\\Employee.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);

			Project obj = (Project)ois.readObject();
			obj.printData();

		} catch (Exception e) {
			System.out.println("Exception Occured");
		}
	}
}

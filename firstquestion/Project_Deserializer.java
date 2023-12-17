package firstquestion;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;


public class Project_Deserializer {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		try {

			FileInputStream fis = new FileInputStream("C:\\New folder\\Employee1.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Map<Project, ArrayList<Employee>> deserializedMap = (Map<Project, ArrayList<Employee>>) ois.readObject();
			ois.close();
			fis.close();

			for (Map.Entry<Project, ArrayList<Employee>> entry : deserializedMap.entrySet()) {
				System.out.println(entry.getKey());
				for (Employee employee : entry.getValue()) {
					System.out.println(employee);

				}
				System.out.println();

			}

		} catch (IOException excp) {
			excp.printStackTrace();
			return;
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Employee class not found");
			cnfe.printStackTrace();
			return;
		}

	}
}

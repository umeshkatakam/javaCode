package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializationEx {

	public static void main(String args[]) throws FileNotFoundException {
		
		try {
			Student s=new Student(101,"umesh");
			FileOutputStream out=new FileOutputStream("f.txt");
			ObjectOutputStream oos=new ObjectOutputStream(out);
			oos.writeObject(s);
			oos.flush();
			oos.close();
			System.out.println("success");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		
	}
}

package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			FileInputStream fis=new FileInputStream("f.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Student s=(Student) ois.readObject();
			System.out.println("data"+s.toString());
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}

// ��ü ���� ������� �ϱ� ����
// Ŭ������ Serializable interface�� �����ؾ� �Ѵ�
// file�� ����ϴ� ��츦 ����ȭ(serialization)
// file���� �д� ��츦 ������ȭ(deserialization)
// ���並 �����ϱ� ���ؼ��� ������(marshalling)�� �ʿ��ϴ�.(��ü�� ����Ʈ ������ ����

import java.io.*;

class Student implements Serializable {
	private static final long serialVersionUID = 100L;
	private int id;
	private String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return id + ", " + name;
	}
}
public class Pro03_ObjectStreamTest {
	public static void main(String[] args) {
		ObjectInputStream in = null;
		ObjectOutputStream out = null;
		
		try {
			out = new ObjectOutputStream(new BufferedOutputStream(
					new FileOutputStream("object.dat")));
			out.writeObject(new Student(1, "Hong"));	// IOException
			out.writeObject(new Student(2, "Kim"));
			out.writeObject(new Student(3, "Choi"));
			out.flush();
			
			in = new ObjectInputStream(new FileInputStream("object.dat"));
			
			System.out.println((Student)in.readObject());	// ClassNotFoundException
			// readObject() �� Object�� �����ϱ� ������ ����ȯ �ʿ�
			System.out.println((Student)in.readObject());
			System.out.println((Student)in.readObject());
			if (in != null)
				in.close();
			if (out != null)
				out.close();
		} catch (ClassNotFoundException e) {
			System.out.println("classNotFoundException");
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException");
			System.out.println(e.getMessage());
		}
	}
}
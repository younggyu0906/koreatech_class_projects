import java.util.Scanner;

public class Prog02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		String str;
		
		Scanner sc = new Scanner(System.in); // Scanner class�� next()
		System.out.print("Enter character : ");
		str = sc.next(); //�ܾ� (token) �Է�
		c = str.charAt(0);  //string���� �Է¹޾Ƽ� 0��° ���ڿ��� char�� ����
		switch (c) {
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' : System.out.println("Vowel"); break;
			default : System.out.println("Consonant"); break;
		}
	}
}
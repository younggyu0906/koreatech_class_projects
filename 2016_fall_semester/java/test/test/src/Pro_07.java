import java.util.Scanner;

public class Pro_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PYEONG = 3.3058;
		double pyeong, m2;
		Scanner input = new Scanner(System.in);
		
		System.out.print("�� : ");
		pyeong = (input.nextDouble());

		m2 = pyeong * PYEONG;
		System.out.println("�� : " + pyeong + "   m2 : " + m2);
		
		input.close();
	}
}
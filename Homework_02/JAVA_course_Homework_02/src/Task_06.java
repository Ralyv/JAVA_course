import java.util.Scanner;

// �������� ��������, ����� ���� �� ��������� ������� �r� �� ���� � 
// ��������� ������� ��������� � ����.

public class Task_06 {

	public static void main(String[] args) {
		
		float r;
		float pi = 3.14159f;
		float AreaCircle;
		float LengthCircle;
		
		Scanner task_06 = new Scanner(System.in);
		System.out.println();
		System.out.println("�������� �������� �� 'r':   ");
		r = task_06.nextFloat();
		
		AreaCircle = pi * (r * r);
		LengthCircle = 2 * pi * r;
		
		System.out.println();
		System.out.println("�������� �������� �� 'r':   " + r);
		System.out.println("���� �� �����: S = " + AreaCircle);
		System.out.println("�������� �� �����: L = " + LengthCircle);
		
		
		
		

	task_06.close();
	}

}

import java.util.Scanner;

// �������� �����, ����� �� ��������� ���� ������ ���� ����� � ����� ��� �������. 
// �������� ����������.

public class Task_08_int_type {

	public static void main(String[] args) {
		Scanner task_08 = new Scanner(System.in);
		System.out.println();
		System.out.println("�������� ���� �����: ");
		int UserNumber = task_08.nextInt();
		System.out.println();
		
		int Number = UserNumber % 2;
		
		System.out.println("���������� ���� ����� �: " + UserNumber);
		System.out.println();
		System.out.println("�������� �� ������� - ��������:");
		System.out.println();
		
		boolean Even = (Number == 0);
		System.out.println(UserNumber + " e �����: " + Even);
		System.out.println();
		//System.out.println("* ���������: ��� ��������� � \"false\" �� �� ��� �������, �� ���������� ���� ����� � �������");
		
		boolean Odd = (Number == 1);
		System.out.println(UserNumber + " e �������: " + Odd);
		System.out.println();
		
		task_08.close();		 


	}

}

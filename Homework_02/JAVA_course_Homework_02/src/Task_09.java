import java.util.Scanner;

// �������� �������� ����� ������ 2 ����������� ����� �� ���� � 
// ������� �������� �� ��������� �� �������.
 
public class Task_09 {

	public static void main(String[] args) {
		
	Scanner task_09 = new Scanner(System.in);
	System.out.println("�������� ���� �����: ");
	int A = task_09.nextInt();
	
	System.out.println("�������� ���� �����: ");
	int B = task_09.nextInt();
	
	System.out.println();
	System.out.println("�������� ���� ����� A = " + A);
	System.out.println("�������� ���� ����� B = " + B);
	
	int result = A % B;
	System.out.println();
	System.out.println("O������ ��� ������� �� � � �: " +  result);
	
	task_09.close();
		
		
		
		

	}

}

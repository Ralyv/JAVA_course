import java.util.Scanner;

//��������� ��������, ����� ������ ��� ����� � ������� ������� 
//��������� ��������� � �������� �� ������������. 
//����������� ������ �� ������� ������������ � � �������� �� ���������

public class Task_01_02 {

	public static void main(String[] args) {
		
		Scanner task_01 = new Scanner(System.in);
		System.out.println("�������� �������� �� ������� �� ������������� \"�\"");
		float a = task_01.nextFloat();
		
		System.out.println("�������� �������� �� ������ �� ������������� \"b\"");
		float b = task_01.nextFloat();
		
		System.out.println();
		System.out.println("������� = " + a);
		System.out.println("������ = " + b);
		
		System.out.println();
		System.out.println("���� �� ������������ = " + (a*b));
		
	task_01.close();
	}

}
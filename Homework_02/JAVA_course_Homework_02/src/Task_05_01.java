import java.util.Scanner;

//�������� ��������, ����� ���� �� ��������� ������ ����� �� ��� int � ��������� ������� ����.

public class Task_05_01 {

	public static void main(String[] args) {
		Scanner task_05 = new Scanner(System.in);
		
		System.out.println();
		int a;
		System.out.println("�������� �������� �� '�': ");
		a = task_05.nextInt();
		
		System.out.println();
		int b;
		System.out.println("�������� �������� �� 'b': ");
		b = task_05.nextInt();
		
		System.out.println();
		int c;
		System.out.println("�������� �������� �� 'c': ");
		c = task_05.nextInt();
		
		System.out.println();
		int d;
		System.out.println("�������� �������� �� 'd': ");
		d = task_05.nextInt();
		
		System.out.println();
		System.out.println("�������� ���������: ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println();
		
		int sum = a + b + c + d;
		System.out.println("����: � + b + c + d = " + sum);
		
		task_05.close();
		}

}

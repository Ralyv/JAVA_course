import java.util.Scanner;

// �������� ����� �����, ����� �� ��������� ���� ������ ���� ����� �� ���� 
// �� 5 � �� 7 ��� �������. �������� ���������.

public class Task_07_02 {

	public static void main(String[] args) {
		Scanner task_07 = new Scanner(System.in);
		System.out.println();
		System.out.println("�������� ���� �����: ");
		int UserNumber = task_07.nextInt();
		System.out.println();
		
		int number_5 = UserNumber % 5;
		int number_7 = UserNumber % 7;
		
		boolean User = (number_5 == 0 || number_7 == 0);
		System.out.println("�������� ���� ����� " + UserNumber);
		System.out.println("��������: " + User);
		
		task_07.close();		 

	}

}

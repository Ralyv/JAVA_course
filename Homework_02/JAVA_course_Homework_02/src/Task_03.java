import java.util.Scanner;

//�������� �� ������ �� ������� �� ���������� �� ���������� �� ���������.  
//��������� ��������, ����� ������� �������� ����������:
//���, �������, ������ (0, 120), ��� (���������� '�' ��� '�'), ���, �������. 
//��������� ����������� ������ ����� � ������������ ������� ����������. 
//��������� �� ��������� ������� ��������� �� �������� � ���� ���� �������� �� ���������

public class Task_03 {

	public static void main(String[] args) {
		Scanner task_03 = new Scanner(System.in);
		System.out.println("�������� ���: ");
		String Name = task_03.nextLine();
		
		System.out.println();
		System.out.println("�������� �������: ");
		String Surname = task_03.nextLine();
		
		System.out.println();
		System.out.println("�������� ��� - �� ��� '�', �� ���� '�': ");
		String Sex = task_03.nextLine();
		
		System.out.println();
		System.out.println("�������� �������: ");
		byte Age = task_03.nextByte();
		
		System.out.println();
		System.out.println("�������� ���: ");
		long PersonalNumber = task_03.nextLong();
		
		System.out.println();
		System.out.println("�������� ��������� �����: ");
		long PhoneNumber = task_03.nextLong();
		
		System.out.println();
		System.out.println("���:  " + Name);
		System.out.println("�������:  " + Surname);
		System.out.println("�������:  " + Age);
		System.out.println("���: " + Sex );
		System.out.println("���:  " + PersonalNumber);
		System.out.println("��������� �����:  " + PhoneNumber);
		
		task_03.close();
		} 

}

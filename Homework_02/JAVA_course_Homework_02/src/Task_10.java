import java.util.Scanner;

// ��������� ��������, ����� ������ ��� ���� ����� - 
// ��������� �������� � ���������� �� ����������. 
// ����������� ������ �� ������� ���������� � � �������� �� ���������.

public class Task_10 {
	
	    public static void main(String[] args) {
	    	Scanner task_10 = new Scanner(System.in);
	    	System.out.println("�������� �������� 'h':");
	    	short h = task_10.nextShort();
	    	
	    	System.out.println("�������� �������� '�':");
	    	short b = task_10.nextShort();
	    	
	    	System.out.println("��������: h = " + h);
	    	System.out.println("������: b = " + b);
	    	
	    	int Area = (h * b) / 2;
	    	System.out.println("���� �� �����������: S = " + Area);
	    	
	    	task_10.close();
	    	
	    	
	    	
	    	

	    }
}

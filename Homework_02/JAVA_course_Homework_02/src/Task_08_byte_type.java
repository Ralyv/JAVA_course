	// �������� �����, ����� �� ��������� ���� ������ ���� ����� � ����� ��� �������. 
	// �������� ����������.

	public class Task_08_byte_type {

		public static void main(String[] args) {
					
			byte UserNumber = 35;
			int Number;
			Number = UserNumber % 2;
			
			System.out.println();
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
			
			}

	}
package day01;

public class Test04 {

	public static void main(String[] args) {
		
	/* ����: �����͸� ������ �� �ִ� ����
		�������� �ڷ��� ������ �ʼ���
		
		bit: �������� �� �ڸ��� 1bit
		8bit = 1byte
		
		�ڷ���(type)�� ����
		1. byte		1byte	-128 ~ 127
		2. short	2byte	-32768 ~ 32767
		3. char		2byte	0 ~ 65535
		4. int		4byte
		5. float	4byte
		6. double	8byte
		7. void		���� ���� �ʴ� Ư���� ��������
		
	*/
		//�ڷ��� �����̸� = ���� ��
		int age = 40; // int: ���� ǥ��
		double weight = 65.3; //�Ǽ� ǥ��
		double height = 177.3; //�Ǽ� ǥ��
		
		System.out.println("���������� " + age + "��");
		System.out.println(height + "cm" + "����");
		System.out.println("�����Դ� " + weight + "kg" + "�� �ƴ��ٵ� �� �־");
		
		// char�� ���� �ϳ��� ǥ�� �� �� ���
		// ���� �ϳ��� ���� ����ǥ�� ǥ��
		 char ch = 'A'; //���� ����: �ʱ�ȭ ����
		 System.out.println("���� ��: " + ch);
		 ch = 'B';
		 System.out.println("���� ��: " + ch);
		 
		 System.out.println("����: " + (ch+32));
		 
		 //����ȯ
		 System.out.println("����: " + (char)(ch+32));
		 System.out.println("����: " + (double)(ch+32));
		 
		 System.out.println(1.111);
		 System.out.println((int)1.111);
		 
		 String name = "������";
		 System.out.println(name+ "�� �ȳ��ϼ���.");
		 name = "������";
		 System.out.println("�̸� ����: " + name);
		
	}

}

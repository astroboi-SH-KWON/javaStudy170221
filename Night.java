//���� ����Ʈ Ŭ�������� ���̿� Ű�� ����
//�������� �ϰ��� �Ѵ�.
//���̰� 30���̻� Ű�� 170�����̸�
//"���� ����" �׷��� ������ "���� �Ұ���"

import java.util.Scanner;

class Night
{
	public static void main(String[] args)
	{
		String name;
		int age;
		double h;

		Scanner sc= new Scanner(System.in);
		System.out.print("what's your name?==>");
		name=sc.next();
		System.out.print("how old are you?==>");
		age=sc.nextInt();
		System.out.print("how tall are you?==>");
		h=sc.nextDouble();

		if((age>=30)&&(h<=170))
		{
			System.out.println(name+" : ���� ����!!!");
		}
		else
		{
			System.out.println(name+" : ���� �Ұ�!!!");
		}

	}
}
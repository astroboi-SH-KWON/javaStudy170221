//����ڿ��Լ� �ΰ��� ������ �Է¹޾�
//�ΰ��� ���� ���� �������� 
//�Ǻ��ϴ� ���α׷��� �ۼ�.

import java.util.Scanner;

class CompNum
{
	public static void main(String [] args)
	{
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.print("ù���� �ڿ����� �Է��Ͻÿ�.");
		num1=sc.nextInt();
		System.out.print("�ι��� �ڿ����� �Է��Ͻÿ�.");
		num2=sc.nextInt();

		if(num1==num2)
		{
			System.out.print("�Է��� �� ���� ���� ���� �� �Դϴ�.");
		}
		else
		{
			System.out.print("�Է��� �� ���� ���� �ٸ� �� �Դϴ�");
		}



	}
}
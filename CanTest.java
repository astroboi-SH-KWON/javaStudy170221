/*
������� �̸��� ��������� �Է¹޾�
���� �ϰ��� ����� ���� �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.

�� ����ϰ��� ����ڴ� ����⵵�� 
Ȧ���̰� ���̰� 40�� �̻��̾�� �Ѵ�.
*/

import java.util.Scanner;

class CanTest
{
	public static void main(String[] args)
	{
		String name;
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.print("what's your name?==>");
		name=sc.next();
		System.out.print("what year were you born?==>");
		year=sc.nextInt();

		if(((2017-year)>=40)&&((year)%2)!=0)
			System.out.println(name+"�� �ϰ��� ������Դϴ�.");
		else
			System.out.println(name+"�� �ϰ��� ����ڰ� �ƴմϴ�.");

	}
}
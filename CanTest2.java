/*
������� �̸��� ��������� �Է¹޾�
���� �ϰ��� ����� ���� �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.

�� ����ϰ��� ����ڴ� ���̰� 40�� �̻��̰�
�� �ذ� Ȧ���� �̸� ��������� Ȧ���� ���
�� �ذ� ¦���� �̸� ��������� ¦���� ���

������ ������ �˾ƿ�����
java.util.Date�� import�ϰ�,
Date today = new Date();
int thisyear=today.getYear()+1900;
*/

import java.util.Scanner;
import java.util.Date;

class CanTest2
{
	public static void main(String[] args)
	{
		String name;
		int year,thisyear;
		Scanner sc=new Scanner(System.in);
		Date today = new Date();
		thisyear = today.getYear()+1900;
		System.out.print("what's your name?==>");
		name=sc.next();
		System.out.print("what year were you born?==>");
		year=sc.nextInt();

		if(((thisyear-year)>=40)&&((thisyear-year)%2)==0)
			System.out.println(name+"�� �ϰ��� ������Դϴ�.");
		else
			System.out.println(name+"�� �ϰ��� ����ڰ� �ƴմϴ�.");

	}
}
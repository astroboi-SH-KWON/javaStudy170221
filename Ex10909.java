import java.util.Scanner;

class Ex10909
{
	public static void main( String[] args)
	{
		int num,h,m,s,t;
		Scanner sc=new Scanner(System.in);
		System.out.print("10000���� ���� �ڿ����� �Է��Ͻÿ�.(ex)2345)==>");
		num=sc.nextInt();

		h=num/1000;
		m=(num-1000*h)/100;
		s=(num-1000*h-100*m)/10;
		t=num-1000*h-100*m-10*s;

		System.out.println(num+"�� õ�� �ڸ� : "+h+" , ���� �ڸ� : "+m+" , ���� �ڸ� : "+s+" ,���� �ڸ� : "+t+" �Դϴ�.");

	}
}
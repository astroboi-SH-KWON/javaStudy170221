import java.util.Scanner;

class MyInfo
{
	public static void main(String[]args)
	{
		String name,  add;
		int age;
		double height,weight, reye,leye;
		Scanner sc=new Scanner(System.in);
		System.out.print("�̸��� �Է��Ͻÿ�.==>");
		name =sc.next();

		sc.nextLine();
		System.out.print("�ּҸ� �Է��Ͻÿ�.(ex)������ ���̵�)==>");
		add =sc.nextLine();
		System.out.print("���̸� �Է��Ͻÿ�.==>");
		age =sc.nextInt();
		System.out.print("Ű�� �Է��Ͻÿ�.(ex)175)==>");
		height =sc.nextDouble();
		System.out.print("�����Ը� �Է��Ͻÿ�.(ex)70)==>");
		weight =sc.nextDouble();
		System.out.print("��� �÷��� �Է��Ͻÿ�.(ex)1.2)==>");
		reye =sc.nextDouble();
		System.out.print("�¾� �÷��� �Է��Ͻÿ�.==>");
		leye =sc.nextDouble();

		System.out.println();
		System.out.println("******************************");
		System.out.println(name+"���� �����Դϴ�.");
		System.out.println(" �ּҴ� "+add+"�Դϴ�.");
		System.out.println(" ���̴� "+age+" �� �Դϴ�.");
		System.out.println(" Ű�� "+height+" Cm �Դϴ�.");
		System.out.println(" �����Դ� "+weight+" Kg �Դϴ�.");
		System.out.println(" �÷��� ��� "+reye+" �׸��� �¾� "+leye+"�Դϴ�.");
		


	}
}
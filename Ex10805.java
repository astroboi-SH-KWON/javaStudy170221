import java.util.Scanner;

class Ex10805
{
	public static void main( String[] args)
	{
		int sec,h,m,s;
		Scanner sc=new Scanner(System.in);
		System.out.print("�ð��� �Է��Ͻÿ�.(ex)2300)==>");
		sec=sc.nextInt();

		h=sec/3600;
		m=(sec-3600*h)/60;
		s=sec-3600*h-60*m;

		System.out.println(sec+"�ʴ� "+h+"�ð�"+m+"��"+s+"�� �Դϴ�.");

	}
}
import java.util.Scanner;

class Ex10805
{
	public static void main( String[] args)
	{
		int sec,h,m,s;
		Scanner sc=new Scanner(System.in);
		System.out.print("시간을 입력하시오.(ex)2300)==>");
		sec=sc.nextInt();

		h=sec/3600;
		m=(sec-3600*h)/60;
		s=sec-3600*h-60*m;

		System.out.println(sec+"초는 "+h+"시간"+m+"분"+s+"초 입니다.");

	}
}
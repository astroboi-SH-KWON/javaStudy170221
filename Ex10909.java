import java.util.Scanner;

class Ex10909
{
	public static void main( String[] args)
	{
		int num,h,m,s,t;
		Scanner sc=new Scanner(System.in);
		System.out.print("10000보다 작은 자연수를 입력하시오.(ex)2345)==>");
		num=sc.nextInt();

		h=num/1000;
		m=(num-1000*h)/100;
		s=(num-1000*h-100*m)/10;
		t=num-1000*h-100*m-10*s;

		System.out.println(num+"의 천의 자리 : "+h+" , 백의 자리 : "+m+" , 십의 자리 : "+s+" ,일의 자리 : "+t+" 입니다.");

	}
}
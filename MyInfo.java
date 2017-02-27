import java.util.Scanner;

class MyInfo
{
	public static void main(String[]args)
	{
		String name,  add;
		int age;
		double height,weight, reye,leye;
		Scanner sc=new Scanner(System.in);
		System.out.print("이름을 입력하시오.==>");
		name =sc.next();

		sc.nextLine();
		System.out.print("주소를 입력하시오.(ex)마포구 방이동)==>");
		add =sc.nextLine();
		System.out.print("나이를 입력하시오.==>");
		age =sc.nextInt();
		System.out.print("키를 입력하시오.(ex)175)==>");
		height =sc.nextDouble();
		System.out.print("몸무게를 입력하시오.(ex)70)==>");
		weight =sc.nextDouble();
		System.out.print("우안 시력을 입력하시오.(ex)1.2)==>");
		reye =sc.nextDouble();
		System.out.print("좌안 시력을 입력하시오.==>");
		leye =sc.nextDouble();

		System.out.println();
		System.out.println("******************************");
		System.out.println(name+"님의 정보입니다.");
		System.out.println(" 주소는 "+add+"입니다.");
		System.out.println(" 나이는 "+age+" 세 입니다.");
		System.out.println(" 키는 "+height+" Cm 입니다.");
		System.out.println(" 몸무게는 "+weight+" Kg 입니다.");
		System.out.println(" 시력은 우안 "+reye+" 그리고 좌안 "+leye+"입니다.");
		


	}
}
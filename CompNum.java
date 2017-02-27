//사용자에게서 두개의 정수를 입력받아
//두개의 수가 서로 동일한지 
//판별하는 프로그램을 작성.

import java.util.Scanner;

class CompNum
{
	public static void main(String [] args)
	{
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번쩨 자연수를 입력하시오.");
		num1=sc.nextInt();
		System.out.print("두번쩨 자연수를 입력하시오.");
		num2=sc.nextInt();

		if(num1==num2)
		{
			System.out.print("입력한 두 수는 서로 같은 수 입니다.");
		}
		else
		{
			System.out.print("입력한 두 수는 서로 다른 수 입니다");
		}



	}
}
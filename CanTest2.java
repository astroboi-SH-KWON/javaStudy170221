/*
사용자의 이름과 출생연도를 입력받아
무료 암검진 대상자 인지 판별하는 프로그램을 작성하시오.

단 무료암검진 대상자는 나이가 40살 이상이고
그 해가 홀수해 이면 출생연도가 홀수인 사람
그 해가 짝수해 이면 출생연도가 짝수인 사람

올해의 연도를 알아오려면
java.util.Date를 import하고,
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
			System.out.println(name+"님 암검진 대상자입니다.");
		else
			System.out.println(name+"님 암검진 대상자가 아닙니다.");

	}
}
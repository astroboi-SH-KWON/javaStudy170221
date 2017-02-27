/*
사용자의 이름과 출생연도를 입력받아
무료 암검진 대상자 인지 판별하는 프로그램을 작성하시오.

단 무료암검진 대상자는 출생년도가 
홀수이고 나이가 40살 이상이어야 한다.
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
			System.out.println(name+"님 암검진 대상자입니다.");
		else
			System.out.println(name+"님 암검진 대상자가 아닙니다.");

	}
}
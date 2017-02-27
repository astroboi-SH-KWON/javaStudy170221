//사용자 한테 정수를 입력받아
//그 수가 짝수 인지 홀수 인지 판별하는 프로그램

import java.util.Scanner;

class Mod
{
	public static void main(String[] args)
		{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("자연수를 입력하시오.==>");
		num=sc.nextInt();

		if(num%2==0)
		System.out.println(num+" : 짝수 입니다.");
		else
		System.out.println(num+" : 홀수 입니다.");
		}
	
	

}
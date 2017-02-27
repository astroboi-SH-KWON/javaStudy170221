//신촌 나이트 클럽에서는 나이와 키에 따라
//물관리를 하고자 한다.
//나이가 30세이상 키가 170이하이면
//"입장 가능" 그렇지 않으면 "입장 불가능"

import java.util.Scanner;

class Night
{
	public static void main(String[] args)
	{
		String name;
		int age;
		double h;

		Scanner sc= new Scanner(System.in);
		System.out.print("what's your name?==>");
		name=sc.next();
		System.out.print("how old are you?==>");
		age=sc.nextInt();
		System.out.print("how tall are you?==>");
		h=sc.nextDouble();

		if((age>=30)&&(h<=170))
		{
			System.out.println(name+" : 입장 가능!!!");
		}
		else
		{
			System.out.println(name+" : 입장 불가!!!");
		}

	}
}
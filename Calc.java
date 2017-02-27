import java.util.Scanner;

class Calc
{
	public static void main(String[] args)
	{
		int num1,num2,cal;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번쩨 수를 입력하시오.==>");
		num1=sc.nextInt();
		System.out.print("두번쩨 수를 입력하시오.==>");
		num2=sc.nextInt();
		System.out.print("연산자를 입력하시오. 1)+ 2)- 3)* 4)/ ");
		cal=sc.nextInt();

		switch(cal){
			case 1:
				System.out.println("두수의 덧셈은 : "+num1+"+"+num2+"="+(num1+num2));
			break;

			case 2:
				System.out.println("두수의 뺄셈은 : "+num1+"-"+num2+"="+(num1-num2));
			break;

			case 3:
				System.out.println("두수의 곱셈은 : "+num1+"*"+num2+"="+(num1*num2));
			break;

			case 4:
				System.out.println("두수의 나눈셈은 : "+num1+"/"+num2+"="+(num1/num2));
			break;
		}		

	}
}
import java.util.Scanner;

class Calc
{
	public static void main(String[] args)
	{
		int num1,num2,cal;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("ù���� ���� �Է��Ͻÿ�.==>");
		num1=sc.nextInt();
		System.out.print("�ι��� ���� �Է��Ͻÿ�.==>");
		num2=sc.nextInt();
		System.out.print("�����ڸ� �Է��Ͻÿ�. 1)+ 2)- 3)* 4)/ ");
		cal=sc.nextInt();

		switch(cal){
			case 1:
				System.out.println("�μ��� ������ : "+num1+"+"+num2+"="+(num1+num2));
			break;

			case 2:
				System.out.println("�μ��� ������ : "+num1+"-"+num2+"="+(num1-num2));
			break;

			case 3:
				System.out.println("�μ��� ������ : "+num1+"*"+num2+"="+(num1*num2));
			break;

			case 4:
				System.out.println("�μ��� �������� : "+num1+"/"+num2+"="+(num1/num2));
			break;
		}		

	}
}
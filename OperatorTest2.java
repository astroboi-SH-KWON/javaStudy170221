class OperatorTest2 
{
	public static void main(String[] args) 
	{
		int age;
		int a=7, b=7;
		age = 28;
		System.out.println(age);
		age=age+1;
		System.out.println(age);
		age++;
		System.out.println(age);

		System.out.println("a = "+(++a));
		System.out.println("b = "+(b+1));

		System.out.println("a = "+a);
		System.out.println("b = "+b);

		//���������ڰ� ������ �տ� �ü��� �ְ�,
		//������ �ڿ� �� ���� �ִ�.
		//���������� �ܵ����� ���϶��� �տ� ���ų�
		//�ڿ����ų� �����ϴ�.
		//�׷��� �ٸ� �����ڿ� ���� ���� ���� �ǹ̰� �ٸ���.

		int c=7, d=7;
		int i=++c;//a=a+1; i=a;
		int j=d++;//j=b; b=b+1;

		System.out.println("c = "+c);//8
		System.out.println("d = "+d);//8
		System.out.println("i = "+i);//8
		System.out.println("j = "+j);//7


	}
}

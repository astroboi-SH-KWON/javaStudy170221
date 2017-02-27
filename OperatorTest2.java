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

		//증감연산자가 변수명 앞에 올수도 있고,
		//변수명 뒤에 올 수도 있다.
		//증감연산자 단독으로 쓰일때는 앞에 오거나
		//뒤에오거나 동일하다.
		//그러나 다른 연산자와 같이 쓰일 때는 의미가 다르다.

		int c=7, d=7;
		int i=++c;//a=a+1; i=a;
		int j=d++;//j=b; b=b+1;

		System.out.println("c = "+c);//8
		System.out.println("d = "+d);//8
		System.out.println("i = "+i);//8
		System.out.println("j = "+j);//7


	}
}

class ByteTest
{
	public static void main(String [] args)
	{
		byte a;
		a=28;
		System.out.println(a);

		a=127;
		System.out.println(a);

		//byte가 표현할 수 있는 최대값을 넘는 overflow 발생
		a=(byte)128;
		System.out.println(a);
		a=(byte)129;
		System.out.println(a);
		a=(byte)130;
		System.out.println(a);

		a=-128;
		System.out.println(a);
		//byte이 표현할 수 있는 최소값을 넘는 underflow 발생
		a=(byte)-129;
		System.out.println(a);
		a=(byte)-130;
		System.out.println(a);
		a=(byte)-131;
		System.out.println(a);

	}
}
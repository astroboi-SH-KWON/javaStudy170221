class ByteTest
{
	public static void main(String [] args)
	{
		byte a;
		a=28;
		System.out.println(a);

		a=127;
		System.out.println(a);

		//byte�� ǥ���� �� �ִ� �ִ밪�� �Ѵ� overflow �߻�
		a=(byte)128;
		System.out.println(a);
		a=(byte)129;
		System.out.println(a);
		a=(byte)130;
		System.out.println(a);

		a=-128;
		System.out.println(a);
		//byte�� ǥ���� �� �ִ� �ּҰ��� �Ѵ� underflow �߻�
		a=(byte)-129;
		System.out.println(a);
		a=(byte)-130;
		System.out.println(a);
		a=(byte)-131;
		System.out.println(a);

	}
}
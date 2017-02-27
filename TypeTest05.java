class TypeTest05
{
	public static void main(String [] args)
	{
		double a=5;
		double b=2;

		int r;
		r=(int)(a/b);
		//변수 a는 double형 변수 b도 double형
		//즉 a/b의 결과는 double형이다.
		//double 형의 값은 int형 변수인 r에
		//바로(직접) 저장할 수 없고,
		//형변환 시켜 저장할 수 있다.
/*
		    대입 연산자(=)를 기준으로 왼쪽의 변수의 자료형과 
			오른쪽 문장의 실행 결과값의 자료형이 서로 일치 해야 한다.

			만약 오른쪽의 실행결과값의 메모리 크기가 더 작고 
			왼쪽의 변수의 자료형의 크기가 더 크다면 별 문제 되지 않는다.

			그렇지 않고
			그 반대의 상황이라면
			즉, 오른쪽의 문장의 실행결과의 메모리 크기가
			왼쪽의 변수의 자료형의 크기보다 더 크다면
			반드시 형변환(Type Casting)해서 저장해야 한다.

*/
		System.out.println(r);
	}
}
package java200102;

public class Datatype2_typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자동형변환
		double d = 10; // 10을 10.0으로 변환을 해서 저장하는지 확인해보기
		System.out.println(d);
		
		// 숫자의 표현범위가 int보다 작은 변수에 저장 가능한 정수를 대입하면 형 변환해서 대입함.
		// 표현 범위가 더 큰 정수는 대입이 안되고 변수에 있는 데이터도 대입이 안됨 
		
		short s = 3000;
		// s = 65535;  표현 범위를 넘었기 때문에 에러가 발생함
		int n = 3000;
		//s = n;

		//정수와 정수를 나누면 결과는 정수가 나온다
		double result = 10/3;
		System.out.println(result);

		//산술 연산의 결과 최소 자료형은 int다!
		short s1 = 100;
		short s2 = 100;
		//short s3 = s1+s2; << 에러 short+short = int가 되어야함
		int s3 = s1+s2;
		System.out.println(s3);
		
		// 정수/정수를 실수 결과로 만들어보기
		double r = 10/7;
		System.out.println(r);    // 정수/정수는 정수이므로 r도 1.0을 return한다
		double r2 = (double)10/7;
		System.out.println(r2); // 실수/정수 = 실수이므로 r2는 실수가 된다.
		
		// 실수/실수를 정수로 만들어보기
		//int i1 = 10.3/5.2;
		//System.out.println(i1);  << 실수/실수 = 실수이므로 int로 하면 에러가 난다
		int i2 = (int)(10.3/5.2);
		System.out.println(i2);
		
		// task d를 소수 첫째자리에서 반올림해서 정수로 변환
		double d1 = 18.45;
		int n2 = (int)(d1+0.5); // 반올림식!!!!!!!
		System.out.println(n2);
		
		//1의자리에서 반올림 해보기   : 반올림하고 싶은 자리를 소수 첫째자리로 보내버리면 된다!
		int n3 = (int) (d1*0.1 + 0.5) *10;
		System.out.println(n3);
		
		//소수 둘째자리 반올림 해보기
		double n4 = (double)((d1*10 + 0.5 )* 0.1);
		System.out.println(n4);
	}

}

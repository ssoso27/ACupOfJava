public class Test006 {
	public static void main(String[] args) { 
		double j = 10.0;
		System.out.println(j);
		System.out.println(j + 5); // 5 int -> 5.0 double 자동 형변환
		System.out.println( (int) j + 5 ) // j double -> int로 강제 형변환
	}
}

/*
	byte < short < int < long < float < double
	작은 타입 -> 큰 타입은 자동변환 가능,
	큰 타입 -> 작은 타입은 강제변환 필요.
	
	"기본적으로, 같은 타입 변수만이 연산 가능."
*/
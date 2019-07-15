public class Test001 {
	// 변수 : 값을 저장하는 기억 공간
	public static void main(String[] args) {
		int i; // 변수 선언 => 기억 공간을 새로 확보 -> 값을 저장할 수 있게됨		
		i = 100; // 변수 대입
		i = 200; // 마지막 값이 저장이 됨
		System.out.println(i); // 200 출력
		
		byte j;
		j = 200; // byte의 최대값: 127 -> error!
		System.out.println(j);
		
		10 = i; // 대입의 형태: 오른쪽 값을 왼쪽에 넣음 -> error!
	}
}

// 문제 -> 자료형이란? 변수란? 변수를 선언하는 부분은? 변수를 대입하는 부분은? ... 
// 정수의 자료형 :: byte, short, int(32bit), long(64bit)
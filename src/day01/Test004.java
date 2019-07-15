public class Test004 {
	public static void main(String[] args) {
		int i;
		int j;
		i = 10;
		j = i; // i의 값이 복사되어 j에 대입
		System.out.println(i);
		System.out.println(j);
		
		i = i + 1; // 변수가 가진 값과 상수와의 연산. 순서: + -> =.
	
		k = 10; // 선언되지 않은 변수는 이용할 수 없음 -> error!
	}
}
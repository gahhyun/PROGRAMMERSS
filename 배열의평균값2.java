package programmerss;

import java.util.Arrays;

class 배열의평균값2 {
	public double sol(int[] numbers) {
		return Arrays.stream(numbers).average().orElse(0);
	}
	public static void main(String[] args) {
		
		 배열의평균값2 solution = new 배열의평균값2();
		 int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		 double answer = solution.sol(numbers);
		 System.out.println(answer);

}
}
/*
java.util.Arrays의 stream 함수를 이용해 int 배열을 IntStream으로 변경한다.
IntStream의 average 함수를 이용해 평균을 구한다.
average 함수는 OptionalDouble형을 return하는데 값이 존재하지 않는 경우가 있을 수 있으므로 
orElse 함수를 이용해 예외처리를 해준다.
orElse 메서드는 null이 있든 말든 해당 값이 null이거나 아니어도 실행 가능하다
 */
/*
 * 스트림은 '데이터의 흐름’입니다
 * 스트림은 컬렉션에 저장되어 있는 엘리먼트들을 하나씩 순회하면서 처리할 수 있는 코드 패턴이다
 * 람다식과 함께 사용되어 컬렉션에 들어있는 데이터에 대한 처리를 매우 간결하게 표현으로 작성할 수 있다
 * 또한 내부 반복자를 사용하기 때문에 병렬처리가 쉽다는 점이 있다
 * 스트림은 데이터 소스를 추상화하고, 데이터를 다루는데 자주 사용되는 메서드들을 정의해 놓았다.
 */

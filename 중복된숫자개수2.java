package programmerss;

public class 중복된숫자개수2 {
	public int solution(int[] array, int n) {
		int answer =0;
		for(int number : array) {
			if(number == n )
				answer++;
		}
		return answer;
	}
	public static void main(String[] args) {
		중복된숫자개수2 sol = new 중복된숫자개수2();
		int[] number = {1,2,3,3,4,3,6};
		int answer = sol.solution(number, 3);
		System.out.println(answer);
	}
}
/*
for(타입 변수명 : 배열 또는 켈렉션){
   //배열 또는 컬렉션에 저장된 값이 매 반복마다 하나씩 순서댈 읽혀져 변수에 저장
}
향상된 for문은 일반적인 for문과 달리 
배열과 컬렉션에 저장된 요소들을 읽어오는 용도로만 사용할 수 있다.
*/

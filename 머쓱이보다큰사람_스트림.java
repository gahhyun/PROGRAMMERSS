package programmerss;

import java.util.Arrays;

public class 머쓱이보다큰사람_스트림 {
	public int solution(int[] array, int height) {
		/*
		 * Java의 Stream API를 사용하여 "array" 매개변수에서 스트림을 생성합니다. 
		 * "필터" 방법은 "높이"보다 크지 않은 요소를 필터링하는 데 사용됩니다. 
		 * 마지막으로 "count" 메서드는 필터를 통과한 요소 수를 계산하는 데 사용됩니다.
		 */
		return (int) Arrays.stream(array).filter(n -> n > height).count();
	}
	public static void main(String[] args) {
		머쓱이보다큰사람_스트림 tall = new 머쓱이보다큰사람_스트림();
		
		int[] array = {150,151,165,170,185};
		
		int answer = tall.solution(array, 160);
		System.out.println(answer);
	}
}

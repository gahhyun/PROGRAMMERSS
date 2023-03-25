package programmerss;

public class 배열두배만들기 {
	public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i =0; i<numbers.length; i++){
            answer[i] = numbers[i]*2;
        }
        return answer;
    }
	public static void main(String[] args) {
		배열두배만들기 sol = new 배열두배만들기();
		int[] array = {1,2,3,4,5};
		int[] answer = sol.solution(array);
		for (int i = 0; i < answer.length; i++) 
		    System.out.print(answer[i] + " ");
		
	}
}
/*
 * "main" 메서드는 "배열두배만들기" 클래스의 인스턴스를 생성하고 "array"라는 정수 배열을 1, 2, 3, 4, 5 값으로 
 * 초기화한 다음 클래스의 "solution" 메서드를 호출합니다. "배열"을 인수로 사용합니다. 
 * 결과 배열은 "answer" 변수에 저장되고 "System.out" 개체의 "println" 메서드를 사용하여 콘솔에 인쇄됩니다.
 * 그러나 "println" 메서드는 내용이 아니라 배열 개체의 주소를 인쇄하기 때문에 코드의 출력은 예상한 것과 다릅니다. 
 * 배열의 내용을 인쇄하려면 루프를 사용하거나 "java.util" 패키지의 "Arrays.toString" 메서드를 사용해야 합니다.
 * for (int i = 0; i < answer.length; i++) {
    System.out.print(answer[i] + " ");
   }
 */
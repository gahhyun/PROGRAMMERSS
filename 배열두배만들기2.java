package programmerss;

public class 배열두배만들기2 {
    public int[] solution(int[] numbers) {
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }
        return numbers;
    }
    public static void main(String[] args) {
		배열두배만들기2 sol = new 배열두배만들기2();
		int[] array = {1,2,3,4,5};
		int[] answer = sol.solution(array);
		for (int i = 0; i < answer.length; i++) 
		    System.out.print(answer[i] + " ");
		
	}
}

package programmerss;

import java.util.Arrays;

/*
 * 정수 배열 numbers가 매개변수로 주어집니다. 
 * numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return
 */
public class 최댓값만들기 {
    public int solution(int[] numbers) {
        
    	//배열 numbers에서 가장 큰 원소와 그 다음으로 큰원소를 구하기 위해 정령
    	//Arrats.sort(int[]) 를 이용해서 오름차순 정렬을 해준다
    	Arrays.sort(numbers);
    	
    	//오름차순으로 정렬된 배열 numbers에서 가장 큰 원소 그 다음으로 큰원소는
    	//마지막 인덱스 번호에 해당하는 원소와 마지막 인덱스 -1 번호에 해당한다
    	//인덱스는 0부터 시작하기에 마지막 인덱스번호는 배열의 길이 -1을 해줘야 한다
    	int answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        
        return answer;
    }
    public static void main(String[] args) {
		최댓값만들기 max = new 최댓값만들기();
		int[] array = {1,2,3,4,5,6,7};
		int ans = max.solution(array);
		System.out.println(ans);
		}
}

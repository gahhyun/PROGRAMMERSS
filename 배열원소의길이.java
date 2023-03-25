package programmerss;

import java.util.Arrays;

/*
 * 문자열 배열 strlist가 매개변수로 주어집니다. 
 * strlist 각 원소의 길이를 담은 배열을 retrun
 */
class 배열원소의길이 {
	public int[] solution(String[] strlist) {
		//매개변수로 주어지는 배열의 길이와 동일한 길이의 배열 생성
        int[] answer = new int[strlist.length];
        //반복문을 돌면서
        for(int i=0; i<strlist.length; i++) {
        	//매개변수의 인덱스값에 길이를 정수num에 저장한다
        	int num = strlist[i].length();
        	//새로운 배열안에 0번부터 정수num를 저장한다 
        	answer[i] = num;
        }
        return answer;
    }
	public static void main(String[] args) {
		배열원소의길이 sol = new 배열원소의길이();
		String[] array = {"We", "are", "the", "world!"};
		int[] answer = sol.solution(array);
		System.out.println(Arrays.toString(answer));
	}

}

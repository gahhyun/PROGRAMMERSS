package programmerss;

import java.util.Arrays;

class 배열뒤집기 {
    public int[] solution(int[] num_list) {
    	//매개변수로 받는 배열의 길이랑 동일한 배열의 길이를 가진 배열 생성
        int[] answer = new int[num_list.length];
        
        for(int i=0; i<num_list.length; i++)
        	//새로운배열의 0부터부터 값을 저장하는데
        	//매겨변수로 받는 배열의 인덱스 마지막번호부터 값을 거꾸로 answer에 저장한다
        	answer[i] = num_list[num_list.length-i-1];
        return answer;
    }
    public static void main(String[] args) {
		배열뒤집기 re = new 배열뒤집기();
		int[] list = {1,1,2,5,4,9};
		int[] answer = re.solution(list);
		
		//배열을 그냥 출력하게 되면 배열의 주소값이 출력된다
		//배열안의 값들을 출력하고 싶다면 java.util.Arrat의 toString()메서드를 사용한다
		System.out.println(Arrays.toString(answer));
	}

}
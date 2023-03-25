package programmerss;

//정수 배열 numbers가 매개변수로 주어집니다. 
//numbers의 원소의 평균값을 return

class 배열의평균값 {
	public double solution(int[] numbers) {
      double answer = 0;
      double sum = 0;
      //배열의 길이만큼 반복문을 돌면서
      for(int i =0; i<numbers.length; i++) 
      	//배열의 모든 원소 값을 sum변수에 더해준다
      	sum += numbers[i];
      //모든 원소의 합의 평균을 answer변수에 저장한다
      answer = sum/numbers.length;
		return answer;
      
  }
	public static void main(String[] args) {
		
		 배열의평균값 sol = new 배열의평균값();
		 int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		 double answer = sol.solution(numbers);
		 System.out.println(answer);

	}
}
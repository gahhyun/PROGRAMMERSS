package programmerss;

//정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return

class 짝수의합 {
	    public int solution(int n) {
	        int answer = 0;
	        //반복문을 인자로 받은 n만큼 돌면서
	        for(int i=0; i<=n; i++) {
	        	//만약 i가짝수이면 answer에 더한다
	        	if(i % 2 ==0)
	        		answer +=i;
	        }
			return answer;

	    }
	

	public static void main(String[] args) {
		짝수의합 sol = new 짝수의합();
		int answer = sol.solution(60);
		System.out.println(answer);
	}
}
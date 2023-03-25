package programmerss;

public class 짝수홀수개수 {
	public int[] soiution(int[] num_list) {
		//크기가 2인 배열 생성 
		int[] answer = new int[2];
		//x, y 초기화
		int x = 0;
		int y = 0;
		
		for(int i=0; i<num_list.length; i++) {
			//만약 num_list를 2로 나누었을 떄 0이라면(짝수라면)
			if(num_list[i]%2 == 0)
				x++;
			//0이 아닐경우(홀수라면)
			else
				y++;}
		//answer 리스트 각 인덱스번호에 대입
		answer[0] = x;
		answer[1] = y;
		
		return answer;
		}
	}



package programmerss;

public class 배열의유사도 {
	public int solution(String[] s1, String[] s2) {
		int answer = 0;
		
		//중첩 반복문을 사용해서
		for(int i=0; i<s1.length; i++) {
			for(int j=0; j<s2.length; j++) {
				//배열s1과 배열s2의 원소 값이 동일하다면
				if(s1[i].equals(s2[j]))
					//answer를 카운트
					answer++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		배열의유사도 str = new 배열의유사도();
		String[] s1 = {"a", "b", "c"};
		String[] s2 = {"com", "b", "d", "c", "p"};
		int answer = str.solution(s1, s2);
		System.out.println(answer);
	}
}

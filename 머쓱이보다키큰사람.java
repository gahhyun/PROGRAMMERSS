package programmerss;
/*
 * 문제 설명
머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다. 
머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때, 
머쓱이보다 키 큰 사람 수를 return 
 */
public class 머쓱이보다키큰사람 {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        //반복문을 돌면서
        for(int i=0; i<array.length; i++ ) {
        	//매개변수로 주어진 height랑 배열의 모든수를 비교하면서
        	//height보다 크다면 answer을 카운트 해라
        	if(height < array[i]) 
        		answer++; 
    } 
        return answer;
    }
    public static void main(String[] args) {
		머쓱이보다키큰사람 tall = new 머쓱이보다키큰사람();
		
		int[] array = {150,151,165,170,185};
		
		int answer = tall.solution(array, 160);
		System.out.println(answer);
	}
}
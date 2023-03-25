package programmerss;

class 점의위치구하기 {
    public int solution(int[] dot) {
        int answer = 0;
        
        //만약 배열의 인덱스 첫번째 값과 두번째 값이 0보다 크다면
        if(dot[0]>0 && dot[1]>0)
        	//1을 출력해라
        	answer = 1;
        if(dot[0]<0 && dot[1]>0)
        	answer = 2;
        if(dot[0]<0 && dot[1]<0)
        	answer = 3;
        if(dot[0]>0 && dot[1]<0)
        	answer = 4;

        return answer;
    }
    
    public static void main(String[] args) {
		점의위치구하기 xy = new 점의위치구하기();
		int[] array = {5,-2};
		int answer = xy.solution(array);
		System.out.println(answer);
	}

}

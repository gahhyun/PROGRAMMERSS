package programmerss;

class 점의위치구하기2 {
	public int sol(int[] dot) {
		
		//만약 dot의 첫번째 인덱스의 값이 0보다 클때
		if(dot[0] > 0)
			//dot의 두번째 인덱스 값이 0보다 크다면 1을 작다면 4를
			return (dot[1] > 0) ? 1 : 4;
		//만약 dot의 첫번째 인덱스의 값이 0보다 작을 때
		else
			//dot의 두번째 인덱스 값이 0보다 크다면 1을 작다면 4를
			return (dot[1]>0) ? 2 : 3;
	}

}

/*위의 풀이는 x를 기준으로 삼항연산자를 이용해서 풀이함
 * 삼항연산자
 *  
 *  조건식  ?  값1  :  값2  ;
 *  
 *  조건식이 참이라면 값을 리턴하고 거짓이면 값2를 리턴한다
 */
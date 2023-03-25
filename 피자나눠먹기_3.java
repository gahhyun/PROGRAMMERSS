package programmerss;
/*
 * 머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다. 
 * 피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때, 
 * n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를 return
 */
class 피자나눠먹기_3 {
	public int solution(int slice, int n) {
        int answer = 0;
        //만약 사람수&조각의 값이 0이라면 
        if(n%slice == 0)
        	return n/slice;
      //만약 사람수&조각의 값이 0이 아니라면
        else
        	return n/slice + 1;
        
    }
	public static void main(String[] args) {
		피자나눠먹기_3 div = new 피자나눠먹기_3();
		int answer = div.solution(4,12);
		System.out.println(answer);
	}

}

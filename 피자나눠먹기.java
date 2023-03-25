package programmerss;


/*
 * 머쓱이네 피자가게는 피자를 일곱조각으로 잘라 줍니다.
 * 피자를 나눠먹을 사람의 수 n이 주어질때, 모든 사람이 피자를
 * 한조각 이상 먹기 위해 필요한 피자의 수를 return
 */
public class 피자나눠먹기 {
	public int pizza(int n) {   		//정수n를 매개변수로 받는 생성자
		int answer = 0;
		if(n >= 1 && n <= 100) {		//만약 매개변수가 1보다 크고 100이하 일 경우
			if(n % 7 == 0)				//만약 매개변수가 7로 나누었을 때 0이라면
				answer = n/7;			//매개변수를 7로 나눈다
			else
				answer = n/7 + 1;		//7로 나눈값이 0이 아니라면 나눠진 값의 정수부분에 +1를 한다
		}
		return answer;
	}
	
	public static void main(String[] args) {
		피자나눠먹기 piz = new 피자나눠먹기();		//객체 생성
		int answer = piz.pizza(30);		//매개변수에 30을 대입
		System.out.println(answer);
	}
}

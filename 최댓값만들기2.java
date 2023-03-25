package programmerss;

/*
 * 정수 배열 numbers가 매개변수로 주어집니다. 
 * numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return
 */
public class 최댓값만들기2 {
    public int solution(int[] numbers) {
        int answer = 0; 
        int temp = 0;
        //중첩 반복문 사용
        for(int i=0; i<numbers.length;i++){
        	
            for(int j=0; j<numbers.length; j++){
            	
                if(i == j)    // 같은 것을 뽑는 경우 제외
                    break;
                
                temp = numbers[i] * numbers[j];
                //처음에 answer은 0이고 temp에는 두수가 곱한 값이 저장되는데 당연히 answer보다 temp가 크다
                //answer보다 큰 temp를 다시 answer에 저장한다 
                //반복문을 계속 돌다보면 두수의 곱이 가장큰 값이 나오는데 그 수를 최종 answer에 저장하게 된다
                if(temp > answer) 
                	
                	answer = temp;
            }
        }
        return answer;
    }

}

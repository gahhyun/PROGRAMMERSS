package programmerss;

public class 제일작은수제거하기2 {
    public int[] java_02(int[] arr){    //매개변수가 배열인 생성자

        //만약 배열의 길이가 1인 경우
        if(arr.length == 1){
            //배열안의 값인 -1를 리턴
            int[] answer = {-1};
            return  answer;
        }
        //정수형 배열인 answer객체를 생성
        //배열의 길이는 가장 작은수를 뺴고 저장해야하기 떄문에 -1해준다
        int[] answer = new int[arr.length-1];

        //배열의 0번째 순서를 min으로 선언(하나의 값을 기준으로 잡음)
        int min = arr[0];

        //math.min(값1, 값2)는 입력받은 두개의 인자 값 중 작은 값을 리턴한다
        for(int i=0; i<arr.length; i++){
            //앞에 선언한 min을 이용해서 그 값과 반복문을 돌면서 배열안의 값을 비교한다
            //따라서 가장 작은 값이 min에 할당된다
            min = Math.min(min, arr[i]);
        }
        //반복문용 변수. 기장 직은 수가 여러개 일 수  있기 때문에 사용
        int index = 0;
        //배열전체를 돌면서 가장작은 값min과 동일한 값을 가진 인덱스값을 만나면 continue
        //즉, 가장 작은 값은 배열안에 포함하지 않도록 한다
        for(int i=0; i<arr.length; i++){
            if(arr[i] == min)
                continue;  //만나면 해당 반복부분 탈출 후 다음반복실행
            //배열을 돌면서 min이 아니라면 인덱스0부터 하나씩 증가면서 값을 배열안에 넣어라
            answer[index++] = arr[i];
        }
        //원래 배열에서 가장작은 수인 min를 제거한 값을만 저장된 배열을 리턴해라
        return answer;
    }
}
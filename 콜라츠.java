package programmerss;

public class 콜라츠 {
    public int cola(int n) {    //매개변수 n을 가지는 생성자
        long num = n;
        int count = 0;

        while (num != 0) {       //매개변수로 받는 num이 1이 아니면 반복한다
            if (num % 2 == 0)    //만약 num이 짝수라면
                num /= 2;        //num을 2로 나눈다
            else
                num = num * 3 + 1;      //num이 홀수라면 num*3+1을 해라
        }
        count++;         //while문을 1씩 증가 시킨다

        if (count > 500)  //1이 될때까지의 반복횟수가 500을 넘어가면 -1를 리턴
            return -1;

        return count;     //반복횟수를 리턴한다
    }

    public static void main(String[] args) {
        콜라츠 co = new 콜라츠();
        int answer  = co.cola(6);   
        System.out.println(answer);

    }
}

//오버플로우 와 언더플로
//변수의 선언된 데이터 유형 범위를 벗어난 값을 할당 할 때 발생한다
//절대값이 너무 크면 오버플로 라고 하고 값이 너무 작으면 언더 플로 라고 한다

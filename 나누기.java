package programmerss;

public class 나누기 {
    public int divide(int num1, int num2) {
        double di = (double)num1 / num2 * 1000;
        return (int) di;
    }

    public static void main(String[] args) {
        나누기 divide = new 나누기();
        int answer = divide.divide(3,2);
        System.out.println(answer);
    }
}

/*
 * 이 문제는 자료형, 타입 변환과 관련된 문제

데이터의 산술 연산 시에는 피연산자들의 타입이 모두 일치해야하며, 
타입 변환을 하는 시점에 따라 리턴값이 달라진다.

1) 이항 연산자는 두 피연산자들의 값이 일치해야 연산이 가능하다.
2) num1과 num2는 int형이다.
   따라서 입출력 예3의 값(1,16)을 대입한 1/16의 경우, 나누기 연산 이후 값이 0이 된다. 
   값 0에는 어떤 수를 곱해도 0이기 때문에 result값 62가 출력되지 않는 것이다.

((double) num1 / (double) num2) * (double) 1000 처럼 각각의 변수를 타입 변환 해주거나, 
double answer = ((double) num1 / num2) * 1000처럼 괄호 안에 (double) 타입 변환을 사용한다.
 */

package programmerss;

class 종이자르기 {
    public int papercut(int M, int N) {         //매개변수 정수 M, N가 주어진 생성자
        int answer = (M * N) - 1;               //규칙이 두 수의 곱에 -1이다
        return answer;

    }

    public static void main(String[] args) {
        종이자르기 a = new 종이자르기();
        int x =  a.papercut(2,2);
        System.out.println(x);


    }
}

//이 문제는 규칙을 찾으면 풀리는 문제다
//2*2 했을 때는 3번, 3*3 했을때는 8번, 4*4 하면 15번 ,
//즉, M과 N을 곱해서 -1를 뺀 결과가 계속적으로 규칙성을 나타낸다

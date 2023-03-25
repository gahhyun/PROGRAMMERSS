package programmerss;

/*
문제 설명
각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류합니다.
각 angle이 매개변수로 주어질 때 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 return
 */
public class 각도기 {
    public int solution(int angle) {
        if (0 < angle && angle < 90)
            return 1;
        else if (90 == angle)
            return 2;
        else if (90 < angle && angle < 180)
            return 3;
        else
            return 4;
    }


    public static void main(String[] args) {
        각도기 top = new 각도기();
        int answer = top.solution(50);
        System.out.println(answer);

    }
}

/*
int solution(int angle) {
    if(angle<90) return 1;
    if(angle==90) return 2;
    if(90<angle && angle<180) return 3;
    if(angle>180) return 4;
}
 */
/*
내가 작성한 답
int solution(int angle) {
    if(0<angle<90)
        return 1;
    else if (90 == angle)
        return 2;
    else if(90< angle<180)
        return 3;
    else
        return 4;
}
야기서 if(0<angle<90)는 안되고 if(0<angle && angle<90)로 작성해야한다
두 가지 연산을 같이 비교하고 싶다면 각각 연산을 한 뒤
and(&&)나 or(||)로 이어주어야 한다
 */
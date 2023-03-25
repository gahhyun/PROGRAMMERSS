package programmerss;

import java.util.Arrays;

public class 제일작은수제거하기3 {
    public int[] java_03(int[] arr){    //int[]로 리턴하며 매개변수로 int형 배열을 가진 생성자
        //정수형 배열 answer  선언
        int[] answer = {};
        //배열의 0번째 값을 min으로 선언(기준 값)
        int min = arr[0];
        //만약 배열의 길이가 1이라면ㄴ
        if(arr.length ==1)
            //값-1이 들어있는 새로운 배열을 생성해 리턴한다
            return answer = new int[] {-1};
        //반복문을 돌면서 만약 min값이 배열안의 값보다 크다면
        for(int i=0; i<arr.length; i++){
            //만약 min값이 배열안의 값보다 크다면 그때의 값을 min으로 저장한다
            if(min > arr[i])
                min = arr[i];
        }

        for(int i=0; i<arr.length; i++){
            //배열을 돌면서 만약 배열의 i번째 값이 최소값 min이라면
            if(arr[i] == min) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
            }
        }
        answer = Arrays.copyOf(arr, arr.length-1);

        return answer;
    }
}

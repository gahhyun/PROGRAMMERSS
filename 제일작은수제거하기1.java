package programmerss;

//프로그래머스 제일 작은 수 제거하기

import java.util.ArrayList;
class 제일작은수제거하기1 {

  public ArrayList<Integer> solution(int[] arr){  //매개변수가 있는 생성자
      //int타입의 리스트 생성
      ArrayList<Integer> answer = new ArrayList<>();
      //매개변수인 arr배열의 0번째 값을 min으로 지정
      int min = arr[0];
      //만약 리스트의 길이가 1이 아니라면
      if(arr.length != 1){
          //0번부터 배열의길이-1까지 인덱스번호를1씩 증가하면서 반복한다
          for(int i=0; i<arr.length; i++){
              //만약 인덱스0번째 값이 크다면
              if(min>arr[i]){
                  //그때의 인덱스값을 i번째
                  min = arr[i];
              }
          }
          //반복문을 돌면서 배열 arr안에 min이 아니라면 값을 넣어라
          for(int i=0; i<arr.length; i++){
              if(arr[i] != min){
                  answer.add(arr[i]);
              }
          }
      }else
          //배열의 길이가 1이라면 리스트 answer안에 -1 값을 넣어라
          answer.add(-1);
      return  answer;
  }

}



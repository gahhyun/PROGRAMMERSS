package programmerss;

class  중복된숫자개수{
    public int solution(int[] array, int n) {
     
        int count =0;
        for(int i=0; i<array.length; i++) {
        	if(array[i] == n)
        		count++;
        }
        return count;
    }
    public static void main(String[] args) {
		중복된숫자개수 sol = new 중복된숫자개수();
		int[] number = {1,2,3,3,4,3,6};
		int answer = sol.solution(number, 3);
		System.out.println(answer);
	}
}
/*for 루프의 조건식 i<=array.length은 배열의 인덱스가 0부터 시작하므로 
 * i<array.length로 바꾸어야 합니다. 그렇지 않으면 마지막 요소 이후의 인덱스를 참조하게 되어 
 * ArrayIndexOutOfBoundsException 에러가 발생할 수 있습니다.
 */
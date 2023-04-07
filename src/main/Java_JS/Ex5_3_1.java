public class Ex5_3_1 {
    public static void main(String[] args) {
        int[]score = {79, 88, 91, 33, 100, 55, 95}; //정수형 배열 score 선언하면서 값을 직접 대입
        int max = score[0]; // 최대값을 첫번째 값으로 초기화
        int min = score[0]; // 최소값도 첫번째 값으로 초기화

        for(int i = 1; i < score.length; i++){  // 두번째 값부터 전체 길이보다 작으면 하나씩 키우면서 크기 비교 시작(반복문)
            if(score[i]>max){  // 내가 비교하려는 위치의 값이 최대값보다 크다면
                max = score[i]; // 최대값 교체
            } else if(score[i]<min) { // 최대값보다 크지 않은데 최소값이랑 비교했을 때 더 작다면?
                min = score[i]; // 최소값 교체
            }
        }
        System.out.println("최대값은 : " + max);
        System.out.println("최소값은 : " + min);
    }
}

public class Ex5_3 {
    public static void main(String[] args) {
        // 배열의 최대값과 최소값
        int[]score = {79, 88, 91, 33, 100, 55, 95};

        int max = score[0];   //배열의 첫 번째 값으로 최대값을 초기화 한다. (첫 번째 값을 일단 저장해놓고)
        int min = score[0];   //배열의 첫 번째 값으로 최소값을 초기화 한다.

        for(int i = 1; i < score.length; i++){  // 아 첫 번째 값은 초기화 용으로 쓰고 두 번째부터 첫 번째 값이랑 비교 시작하려고 1부터 시작인 거구나
            if(score[i] > max) { // 반복문 속에 조건문을 넣어서 값 비교를 계속 반복하는 것, 이게 참이라면
                max = score[i];  // 내가 위에서 비교한 score[i]의 값이 max 값으로 들어가는 것
            } else if (score[i] < min) {  // score[i]가 min보다 작으면
                min = score[i];  // score[i]의 값을 min에 넘긴다.
            }
        } // end of for

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    } // end of main
} // end of class

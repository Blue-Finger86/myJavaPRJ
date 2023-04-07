public class Ex5_3 {
    public static void main(String[] args) {
        // 배열의 최대값과 최소값
        int[]score = {79, 88, 91, 33, 100, 55, 95};

        int max = score[0];   //배열의 첫 번째 값으로 최대값을 초기화 한다.
        int min = score[0];   //배열의 첫 번째 값으로 최소값을 초기화 한다.

        for(int i = 1; i < score.length; i++){  // 아 첫 번째 값은 초기화 용으로 쓰고 두 번째부터 첫 번째 값이랑 비교 시작하려고 1부터 시작인 거구나
            if(score[i] > max) {
                max = score[i];
            } else if (score[i] < min) {
                min = score[i];
            }
        } // end of for

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    } // end of main
} // end of class

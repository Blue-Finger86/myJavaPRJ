public class Ex5_9_6 {
    public static void main(String[] args) {
        System.out.println("번호 국어 영어 수학 총점 평균");
        System.out.println("=========================");

        int[][] score = {        // 과목별 점수 배열로 선언
                {100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
                , {50, 50, 50}
        };

        int korTotal = 0, engTotal = 0, mathTotal = 0; //과목별 총점 변수 선언

        for (int i = 0; i < score.length; i++) {
            System.out.println(i);
            for (int j = 0; j < score.length; j++) {
                System.out.printf("%3d", score[i][j]);
            }
        }
    }
}
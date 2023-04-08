public class Ex5_9 {
    public static void main(String[] args) {
        // 2차원 배열 선언 및 생성 (세 과목에 학생은 다섯 명)
        int[][]score = {
                {100, 100, 100}
                ,{20, 20, 20}
                ,{30, 30, 30}
                ,{40, 40, 40}
                ,{50, 50, 50}
        };

        // 과목별 총점 국어, 영어, 수학
        int korTotal = 0, engTotal = 0, mathTotal = 0;

        System.out.println("번호 국어 영어 수학 총점 평균");
        System.out.println("=========================");

        for(int i = 0; i < score.length; i++) {
            int sum = 0;       // 개인별 총점
            float avg = 0.0f;  // 개인별 평균

            korTotal += score[i][0]; // 개인별 국어 성적 입력
            engTotal += score[i][1]; // 개인별 영어 성적 입력
            mathTotal += score[i][2]; // 개인별 수학 성적 입력
            System.out.printf("%3d", i+1);  // 번호 출력

            // 3개의 값을 더하는 반복문
            for(int j = 0; j < score[i].length; j++) { // i는 그대로고 j만 변하잖아 이게 [i][0~2] 이렇게 되는 거야
                sum += score[i][j]; // 개인별 합계
                System.out.printf("%5d", score[i][j]); // 개인별 합계 출력
            }

            // 평균 구하기
            avg = sum/(float)score[i].length;
            System.out.printf("%5d %5.1f%n", sum, avg);
        }

        System.out.println("=======================");
        System.out.printf("총점 : %3d %4d %4d%n", korTotal, engTotal, mathTotal);
    }
}

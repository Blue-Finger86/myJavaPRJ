public class Ex5_9_2 {
    public static void main(String[] args) {
        int[][]score = {
                {100, 100, 100}
                ,{20, 20, 20}
                ,{30, 30, 30}
                ,{40, 40, 40}
                ,{50, 50, 50}
        };

        int korTotal = 0, engTotal = 0, mathTotal = 0;

        System.out.println("번호 국어 영어 수학 총점 평균");
        System.out.println("=========================");

        for(int i = 0; i < score.length; i++) {  // 변수 i를 키우면서 반복한다는 건 점수를 각각 입력되게 반복문을 사용한다는 것
            int sum = 0;
            float avg = 0;

            korTotal += score[i][0]; // 국어 점수가 [i][0]에 있는 애들이라는 뜻
            engTotal += score[i][1]; // 영어 점수는 [i][1]에 있는 애들이고
            mathTotal += score[i][2];
            System.out.printf("%3d", i+1);

            for(int j = 0; j < score[i].length; j++) {  // 과목별 합계를 구하고 각각의 값들이 출력되게 반복문 사용
                sum += score[i][j];

                System.out.printf("%5d", score[i][j]); // 번호별로 세 과목 점수 입력
            }
            avg = sum / (float)score[i].length;
            System. out. printf("%5d %5.1f%n", sum, avg);
        }
        System.out.println("==================================");
        System.out.printf("총점: %3d %4d %4d", korTotal, engTotal, mathTotal);
    }
}
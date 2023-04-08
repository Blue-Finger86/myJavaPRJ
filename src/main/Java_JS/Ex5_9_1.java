public class Ex5_9_1 {
    public static void main(String[] args) {
        int[][]score = {         //학생 다섯명, 과목 세 개 배열로 선언
                {100, 100, 100}
                ,{20, 20, 20}
                ,{30, 30, 30}
                ,{40, 40, 40}
                ,{50, 50, 50}
        };

        int korTotal = 0, engTotal = 0, mathTotal = 0; // 과목별 총합 변수 선언 후 0으로 초기화

        System.out.println("번호 국어 영어 수학 총점 평균"); // 첫 번째 줄에 이거 출력
        System.out.println("========================="); // 두 번째 줄에 이거 출력

        for(int i = 0; i < score.length; i++) {  // 배열의 행 길이만큼 반복할 것
            int sum = 0;      // 합을 담을 변수 선언 및 0으로 초기화
            float avg = 0.0f; // 평균 담을 변수 선언 및 초기화

            korTotal = score[i][0];
            engTotal = score[i][1];
            mathTotal = score[i][2];
            System.out.printf("%3d", i+1);   // 세 칸 들여 써서 번호 출력

            for(int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
                System.out.printf("%5d", score[i][j]);
            }
            avg = sum / (float)score[i].length;  // 평균계산
            System.out.printf("%5d %5.1f%n", sum, avg);
        }

        System.out.println("=========================");
        System.out.printf("총점 %3d %4d %4d", korTotal, engTotal, mathTotal);

    }
}

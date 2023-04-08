public class Ex5_9_5 {
    public static void main(String[] args) {
        int[][]score = {
                {100, 100, 100}
                ,{20, 20, 20}
                ,{30, 30, 30}
                ,{40, 40, 40}
                ,{50, 50, 50}
        };

        int korTotal = 0, engTotal = 0, mathTotal = 0;

        System.out.println("==========================");
        System.out.println("번호 국어 영어 수학 총점 평균");

        for(int i = 0; i < score.length; i++) {
            int sum = 0;
            float avg = 0;

            // 각 과목들 자리에 값을 하나하나 입력해주는 것
            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];

            System.out.printf("%3d", i + 1);

            for(int j = 0; j < score[i].length; j++) {
                sum += score[i][j];  // 여기서 j가 바뀔 때마다 더해줘야 총점을 구하지!(이미 이게 i의 반복문 안에 있는 거니까 j만 바뀌면 돼)

                // 각 과목들의 점수를 하나하나 출력
                System.out.printf("%5d", score[i][j]); // 이것도 마찬가지 i의 반목문이 이 반복문을 감싸고 있으니까 1열의 1행 2행 3행, 그 다음에 2열의 1행 2행 3행 이런 식으로 출력이 돌아가
            }
            avg = sum / (float)score[i].length;
            System.out.printf("%5d %5.1f\n", sum, avg); //번호 값 지나서 총점이랑 평균 출력되어야 하니까
        }
        System.out.println("==========================");
        System.out.printf("총점:%3d %4d %4d", korTotal, engTotal, mathTotal);
    }
}

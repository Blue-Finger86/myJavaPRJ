public class Ex5_9_3 {
    public static void main(String[] args) {
        int[][]score = {
                {100, 100, 100}
                ,{20, 20, 20}
                ,{30, 30, 30}
                ,{40, 40, 40}
                ,{50, 50, 50}
        };

        int korTotal = 0, engTotal = 0, mathTotal = 0;

        System.out.println("국어 영어 수학 총점 평균");
        System.out.println("====================");

        for(int i = 0; i < score.length; i++){
            int sum = 0;
            float avg = 0;

            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];
            System.out.printf("%3d", i+1); // 아 얘를 줄을 안 바꾸고 출력해야 이 뒤로 과목별 점수, 총점, 평균이 다 붙어서 나오는 구나 그래서 평균 출력할 때만 줄 바꾸는 거네

            for(int j = 0; j < score[i].length; j++) {
                sum += score[i][j];

                System.out.printf("%5d", score[i][j]);
            }
            avg = sum / (float)score[i].length;
            System.out.printf("%5d %5.1f\n", sum, avg);
        }
        System.out.println("====================");
        System.out.printf("총합:%3d %4d %4d", korTotal, engTotal, mathTotal);
    }
}

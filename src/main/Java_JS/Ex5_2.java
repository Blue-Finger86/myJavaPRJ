public class Ex5_2 {
    public static void main(String[] args) {
        //배열의 총 합과 평균값
        int sum = 0;
        float avg = 0;

        int[]score = {100, 88, 100, 100, 90};

        for(int i = 0; i < score.length; i++){
            sum = sum + score[i]; // 배열의 인덱스로 넣어주는 거 잊지 말기!
            // sum = sum + score[0] ==>  이걸 for문으로 바꾼 것
            // sum = sum + score[1]
            // sum = sum + score[2]
            // sum = sum + score[3]
            // sum = sum + score[4]
        }
        avg = sum / (float)score.length;  // 계산 후 결과를 실수형으로 얻으려면 형변환을 시켜주어야 함.

        System.out.printf("총 합은 %d\n", sum);
        //System.out.println("총합 : " + sum);
        System.out.printf("평균값은 %f\n", avg);
        //System.out.println("총합 : " + avg);
    }
}

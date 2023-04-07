public class Ex5_2_1 {
    public static void main(String[] args){
        int sum = 0;
        float avg = 0;
        int[]score = {100, 88, 100, 100, 90};

        for(int i = 0; i < score.length; i++){ // 뭐야 에러가 시작값을 1로 두고 조건식을 길이보다 같거나 작을 경우로 둬서 그랬다고? 왜?
            sum = sum + score[i];
        }

        avg = sum / (float)score.length; // 배열의 길이값은 정수형이기 때문에 실수형으로 형변환 시켜줘야 형변환으로 결과가 나옴

        System.out.println("총합은 : " + sum);
        System.out.println("평균은 : " + avg);
    }
}

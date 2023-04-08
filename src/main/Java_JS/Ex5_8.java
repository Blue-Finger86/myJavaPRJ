public class Ex5_8 {
    public static void main(String[] args) {
        int[][]score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40}
        };
        int sum = 0;

        // 2차원 배열은 이중반복문을 사용하는데 이 아래 부분은 거의 늘 고정이니까 외워두는 것이 좋다!
        for (int i = 0; i < score.length; i++) {  // 2차원 배열에서 참조변수 score가 가리키고 있는 건 행의 수, 그래서 여기는 score.length=4(A가 B를 가리키고
            for(int j = 0; j < score[i].length; j++) {  // score[i].length로 쓰는 거 신경 써야 함, 여기서는 지금 score[i]가 참조변수로 뒤에 오는 열의 배열을 가리키고 있는 것(B가 C를 가리킨다
                System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);  //%n이랑 \n이랑 똑같음

                sum += score[i][j];
            }
        }
        System.out.println("sum=" + sum);
    }
}

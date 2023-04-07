public class Ex5_5_2 {
    public static void main(String[] args) {
        // 로또 번호 뽑기 3번째 도전!
        int[]ball = new int[45];

        for(int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }

        int tmp = 0;
        int k = 0;

        for(int i = 0; i < 6; i++) {
            k = (int)(Math.random() * 45);
            tmp = ball[i]; // tmp에 먼저 값을 이동시켜야 함 i와 j를 처음부터 바꿔버리면 랜덤의 의미가 없음
            ball[i] = ball[k];
            ball[k] = tmp;

        }

        for(int i = 0; i < 6; i++) {
            System.out.printf("ball[%d] ==> %d\n", i, ball[i]);
        }
    }
}

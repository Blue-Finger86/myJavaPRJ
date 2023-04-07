public class Ex5_5_1 {
    public static void main(String[] args) {
        int[]ball = new int[45];

        for(int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }

        int tmp = 0;
        int k = 0;

        // 랜덤메서드 사용 안 함(다시)
        for(int i = 0; i < 6; i++) {
            k = (int)(Math.random()*45); // 이 k라는 변수가 랜덤메서드를 통해서 임의의 값을 가져야 다른 애들이랑 값을 바꾸러 갈 수가 있음
            tmp = ball[i];
            ball[i] = ball[k];
            ball[k] = tmp;
        }

        for(int i = 0; i < 6; i++)
        System.out.printf("ball[%d]:%d\n", i, ball[i]); // ball[i]를 넣어줘야 얘가 갖고 있는 값을 알려주겠지?
    }
}

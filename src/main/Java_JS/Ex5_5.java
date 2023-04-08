public class Ex5_5 {
    public static void main(String[]args) {
        // 로또 번호 만들기
        // index : 0~45-1, 0~44
        int[]ball = new int[45]; //45개의 정수를 저장하기 위한 배열 생성

        // 배열의 각 요소에 1~45의 값을 저장한다.
        for(int i = 0; i < ball.length; i++) {
            ball[i] = i + 1; // ball[0]에는 1이 저장된다.
        }
            int tmp = 0;  //두 값을 바꾸는데 사용할 임시변수
            int j = 0;    //임의의 값을 얻어서 사용할 변수

        // 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
        // 0번째부터 5번째 요소까지 모두 6개만 바꾼다. -> 45개의 값 중에서 6개만 바꾸는 건 45개 중에서 6개를 뽑는 거랑 같음(로또)
        for(int i = 0; i < 6; i++) {
            // 아래에서 *를 사용하는 이유는 내가 선택한 배열의 범위의 값을 얻기 위해서, 여기서는 배열의 길이가 45니까
            j = (int)(Math.random()*45); // 0~44범위의 임의의 값을 얻는다. -> 아 이거 뒤에 곱하기가 배열의 길이값이었구나 45개 중에서 랜덤!
            // ball[i]와 ball[j]의 값을 서로 바꾸기 위해서
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;
        }

        // 배열 ball의 앞에서 부터 6개의 요소를 출력한다.
        for(int i = 0; i < 6; i++) {
            System.out.printf("ball[%d] = %d%n", i, ball[i]);
        }

    }
}

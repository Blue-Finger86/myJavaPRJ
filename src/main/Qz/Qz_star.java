public class Qz_star {
    public static void main(String[] args) {
        // for문 한 번만 사용해서 * 찍기 줄마다 1개씩 늘어나도록
        int i, j;
        for (i = 1, j = 1; j < 6; i++) {
                System.out.print('*'); // 대체 어떻게 여러개가 찍히는 거야?
                if( i >= j ) {
                    i = 0;
                    j++;  // 얘 때문에! 얘가 1에서 부터 시작해서 ++을 만나서 2345까지 가잖아
                System.out.println(); // 그리고 줄바꿈을 만나서 다음 줄로 넘어가고! 이 위에서 i를 계속 0으로 초기화를 하니까 한 줄 씩 늘어나는 거고!!
            }
        }
    }
}



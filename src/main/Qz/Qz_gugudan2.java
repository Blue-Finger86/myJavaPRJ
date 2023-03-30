public class Qz_gugudan2 {
    public static void main(String[] args) {
        int j = 2;
        int k;

        for(k = 1; k < 10; k++) { // 1부터 9까지
                System.out.printf("%d * %d = %d\n", j, k, j * k);
            if ( k == 9 ) { // x9까지 갔으면
                j++; // j++해서 3, 4, 5 .... 하나씩 커지고
                k = 0; // k에 0넣어서 초기화 시켜 그래야 다시 올라가서 ++을 만나고 하나씩 커져
                System.out.printf("\n");
                if (j == 10) { // 9단까지만 출력할 수 있게
                    break;
                }
            }
        }
    }
}




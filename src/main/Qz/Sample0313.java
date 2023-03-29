public class Sample0313 {
    public static void main(String[] args) {

        int n = 0; // n이 길이값
        for (int i = 1; i < 13; i++) { // 행
            if (i < 8) {
                n++;
            } else {
                n--;
            }
            for (int j = 1; j < n; j++) { // 열에 들어가는 *의 개수
                System.out.print('*' );
            }
            System.out.println();
        }
    }
}

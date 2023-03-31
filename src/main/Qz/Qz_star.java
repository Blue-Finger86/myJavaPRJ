public class Qz_star {
    public static void main(String[] args) {
        // for문 한 번만 사용해서 * 찍기 줄마다 1개씩 늘어나도록
        int i, j;
        for (i = 1, j = 1; j < 6; i++) {
                System.out.print('*');
                if( i >= j ) {
                    i = 0;
                    j++;
                System.out.println();
            }
        }
    }
}



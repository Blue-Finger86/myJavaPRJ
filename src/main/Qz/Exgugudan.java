public class Exgugudan {
    public static void main(String[] args) {
        int i = 2;

        for( int j = 1; j < 10; j++) {
            System.out.printf("%d X %d = %d\n", i, j, i*j);

            if ( j == 9) {
                i++;
                j = 0;
                System.out.println();
            }

            if ( i == 10) {
                break;
            }
        }
    }
}

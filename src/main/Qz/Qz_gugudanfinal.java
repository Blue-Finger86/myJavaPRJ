public class Qz_gugudanfinal {
    public static void main(String[] args) {
        int j = 2;

        for(int i = 1; i<10; i++) {
            System.out.println(j + "*" + i + "=" + j*i);
            if(i==10) {
                j++;
                i=0;
                System.out.println();
                if(j==10) {
                    break;
                }
            }
        }
    }
}

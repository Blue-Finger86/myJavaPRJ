public class Qz_whilegugudan {
    public static void main(String[] args) {

        int a = 2;

        int b = 1;
        while(b<10) {
            System.out.printf("%d X %d = %d\n", a, b, a*b);
            b++;
            if(b==10){
                a++;
                b = 1;
                if(a==10) {
                    break;
                }
                System.out.println();
            }
        }
    }
}

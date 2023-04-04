public class Sample_gugudan2 {
    public static void main(String[] args) {
        int h = 2;

        for(int o=1; o<10; o++) {
            System.out.println(h + "*" + o + "=" + h*o);
            if(o==9) {
                h++;
                o=0;
                System.out.println();
                if(h==10) {
                    break;
                }
            }
        }
    }
}

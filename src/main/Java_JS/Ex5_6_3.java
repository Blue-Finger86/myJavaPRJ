public class Ex5_6_3 {
    public static void main(String[] args) {
        String[]names = {"Kim", "Lee", "Choi"};

        for(int i = 0; i < names.length; i++) {
            System.out.println("names["+i+"]:" + names[i]);
        }

        String tmp = names[2];
        System.out.println("tmp:"+names[2]);
        names[2] = "Hwang";

        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}

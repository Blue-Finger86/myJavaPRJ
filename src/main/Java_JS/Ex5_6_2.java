public class Ex5_6_2 {
    public static void main(String[] args) {
        String[]names = {"Kim", "Park", "Yi"};

        for(int i = 0; i < names.length; i++) {
            System.out.println("names["+i+"]:"+names[i]);
        }

        String tmp = names[2];
        System.out.println("tmp:" +names[2]); // 오오 그러니까 그대로 출력할 건 따옴표 안에 넣고 붙이는 건 따옴표 빼고 연산자로 붙이는 거구나
        names[2] = "Yu";

        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]); // 아 큰따옴표를 안 넣어야 값들이 출력이 되네 넣으면 똑같은 거 3개 나와 names[i] 이거
        }
    }
}

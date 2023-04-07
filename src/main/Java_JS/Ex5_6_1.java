public class Ex5_6_1 {
    public static void main(String[] args) {
        String[]names = {"Kim", "Park", "Yi"}; //문자열이기 때문에 요소 하나하나 다 큰따옴표 안에 넣어주어야 한다.

        for(int i = 0; i<names.length; i++) {
        System.out.println("names["+i+"]:"+names[i]); // ( )안에 들어가는 거 잘 기억하기
        }

        String tmp = names[2];
        System.out.println("tmp:"+tmp); //이것도 역시 괄호 안에 들어가는 거 잘 기억하기
        names[0] = "Yu";

        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]); // 아 차례대로 다 출력할 때만 이렇게 쓰는 거구나
        }
    }
}

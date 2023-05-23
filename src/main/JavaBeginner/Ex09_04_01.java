public class Ex09_04_01 {
    public static void main(String[] args) {
        String str = "안녕하세요 여러분? 오늘도 좋은하루 보내세요!";

        System.out.print("제일 처음 안녕이 나오는 위치는?:");
        System.out.println(str.indexOf("안녕"));
        System.out.print("제일 마지막으로 안녕이 나오는 위치는?:");
        System.out.println(str.lastIndexOf("안녕"));


        String str2 = "I'm sooooo happy!";

        System.out.print("제일 처음 happy가 나오는 위치는?: ");
        System.out.println(str2.indexOf("happy"));
        System.out.print("제일 마지막으로 happy가 나오는 위치는?:");
        System.out.println(str2.lastIndexOf("happy"));
    }
}

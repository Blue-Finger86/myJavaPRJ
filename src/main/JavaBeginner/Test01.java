public class Test01 {
    public static void main(String[] args) {
        String log = "123.123.123.123 - - [12/Apr/2018:17:03:50 +0900] \"GET /api/aaaa HTTP/1.1\" 200 34 1468 \"https://m.naver.com\" \"Mozilla/5.0 (iPhone; CPU iPhone OS 11_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E216 NAVER(inapp; search; 580; 8.6.3; 7)\"";

        //문제 IP만 출력하기 -> subString();, split();
        //출력 결과 : 123.123.123.123
        String ip[] = log.split(" ");
        System.out.println("ip는 : " + ip[0]);

        //문제 호출날짜와 시간만 출력하기
        ip = log.split(" ");
        System.out.println("시간: " +ip[3]);
        String time;
        time = ip[3].replace("[", "");

        System.out.println("시간: " + time);
        //출력 결과 : 2018:17:03:50


        //내가 풀려던 거
        // String logAry, logSub;
        // logSub = log.substring(1,15);




    }
}

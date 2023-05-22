import java.util.HashMap;
import java.util.Map;

public class MapExam {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("name", "이협건");
        map.put("email", "hglee67@kopo.ac.kr");
        map.put("dept", "데이터분석과");

        System.out.println("조회 결과");
        System.out.println("name : " + map.get("name"));
        System.out.println("email : " + map.get("email"));
        System.out.println("dept : " + map.get("dept"));


        //set이란 데이터 구조가 이런 거구나 이것만 알면 됨
        map.entrySet().forEach(entry -> {    //얘는 한 개라 원래 안 묶어도 되는데 길어지면 묶어야 함
            System.out.println(entry.getKey() + " : " + entry.getValue());
        });

    }
}

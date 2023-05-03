import java.util.ArrayList;
import java.util.Collections;

public class Ex11_1 {
    public static void main(String[] args) {
        //기본 길이(=용량, capacity)가 10인 ArrayList를 생성
        ArrayList list1 = new ArrayList(10);

        //ArrayList에는 객체만 저장 가능
        //autoboxing에 의해 기본형이 참조형으로 자동 변환
        //list1.add(5); 이렇게 쓰면 컴파일러가 list1.add(new Integer(5));이렇게 바꿔주는 걸 autoboxing이라고 함
        list1.add(5);
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        //생성자중에 ArrayList(Collection c)를 사용한 것
        ArrayList list2 = new ArrayList(list1.subList(1,4)); //ArrayList의 일부를 뽑아서 subList를 만드는 것, 1부터 4(읽기 전용)까지
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);    // 아래에 만들어놓은 메소드를 사용한 것
        System.out.println();

        //Collection은 인터페이스, Collections는 유틸 클래스(이 안에 정렬하는 클래스가 들어 있다.)
        Collections.sort(list1); //list1 오름차순으로 정렬
        Collections.sort(list2);
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);
        System.out.println();


        //list1이 list2의 모든 요소를 포함하고 있냐고 묻는 것과 그 결과
        System.out.println("list1.containsAll(list2):"+list1.containsAll(list2));
        System.out.println();

        list2.add("B"); //list2에 B 추가
        list2.add("C"); //list2에 C 추가
        list2.add(3, "A"); //위치를 지정(3)한 후에 A 추가 -> 다른 요소들은 다 자리를 옮겨야 함
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);
        System.out.println();

        list2.set(3, "AA"); //인덱스 3 위치에 있는 값을 AA로 변경
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);
        System.out.println();

        list1.add(0, "1"); //인덱스 0에 문자열 1을 삽입함
        //indexOf()는 지정된 객체의 위치(인덱스)를 알려준다.
        System.out.println("index="+list1.indexOf(1));
        System.out.println();
        list1.remove(0); // lise1.remove(new Integer(1));와 같은 것
        //list1.remove(5); -> 인덱스 5에 있는 객체를 삭제
        //list1.remove(1); -> 인덱스가 1인 객체를 삭제(이 위치에 있는 값을 지우는 것)
        //list1.remove(new Integer(1)); -> 1을 삭제(이 값을 지우는 것)
        //>>>>> 저장할 때는 편하게 써도 삭제할 때는 정확히 써주어야 한다. 그렇지 않으면 다른 것이 삭제되어 버린다.

        //list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
        System.out.println("list1.retatinAll(list2):"+list1.retainAll(list2)); //교집합만 남긴다.

        //list2에서 list1에 포함된 객체들을 삭제한다.
        for(int i = list2.size()-1; i >= 0; i--) {
            // 조건문이 true라면 요소 삭제
            if(list1.contains(list2.get(i))) {      //get(i)를 사용하며 list2에서 값을 하나씩 꺼낸다. 그리고 contains()로 꺼낸 객체가 list1에 있는지 확인한다.
                list2.remove(i);        // remove(i)로 해당 객체를 list2에서 삭제한다.
            }
            System.out.println("list1:"+list1);
            System.out.println("list2:"+list2);
            System.out.println();
        } //main의 끝



        // 왜인지는 모르겠으나 나는 이게 사용이 안 됨
//        static void print(ArrayList list1, ArrayList list2) {
//            System.out.println("list1:" + list1);
//            System.out.println("list2:" + list2);
//            System.out.println();
//        }
    } //class의 끝
}


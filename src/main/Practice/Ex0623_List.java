package myJavaPRJ.src.main.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex0623_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < 6; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        list.forEach(i ->

                System.out.print(i)
        );  //람다식은 세미콜론을 여기에 써야함 출력문 뒤에 쓰는 거 X
    }
}

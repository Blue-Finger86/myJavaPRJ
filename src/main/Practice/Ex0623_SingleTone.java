package myJavaPRJ.src.main.Practice;

public class Ex0623_SingleTone {
    public static void main(String[] args) {
        Book book1 = Book.getInstance();
        Book book2 = Book.getInstance();

        System.out.println(book1);
        System.out.println(book2);
    }
}

class Book {
    private static Book book = new Book(); //객체를 생성해서 메모리에 올린다.(인스턴스 생성)

    private Book() {
        //생성자를 private으로 선언한다.
        //인스턴스를 1개만 만들려면 new연산자를 사용하지 않아야 한다. 그래서 생성자를 private으로 선언하는 것이다.
        //생성자로 인스턴스를 못 받으면 어떻게? (아래 메서드로 고고)
    }

    //GetInstance 메서드 외에는 Book의 객체를 아무도 생성 및 사용할 수 없게 된다.
    //외부에서 객체를 가져올 수 있는 유일한 방법은 이 메서드를 호출하는 것 뿐이다.
    public static Book getInstance() {
        return book;
    }
}
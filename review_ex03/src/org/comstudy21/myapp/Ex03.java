package org.comstudy21.myapp;//다음 멤버를 가지고 직사각형을 표현하는 org.comstudy21.myapp.Rectangle 클래스를 작성하라.
//
//        - int 타입의 x, y, width, height 필드: 사각형을 구성하는 점과 크기 정보
//        - x, y, width, height 값을 매개변수로 받아 필드를 초기화하는 생성자
//        - int square() : 사각형 넓이 리턴
//        - void show() : 사각형의 좌표와 넓이를 화면에 출력
//        - boolean contatins(org.comstudy21.myapp.Rectangle r) : 매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴
//        - main() 메소드의 코드와 실행 결과는 다음과 같다
//public static void main(String[] args) {
//        Rectangle r = new Rectangle(2, 2, 8, 7);
//        Rectangle s = new Rectangle(5, 5, 6, 6);
//        Rectangle t = new Rectangle(1, 1, 10, 10);
//
//        r.show();
//        System.out.println("s의 면적은 "+s.square());
//        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
//        if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
//        }
//        (2,2)에서 크기가 8x7인 사각형
//        s의 면적은 36
//        t는 r을 포함합니다.

class Rectangle {

    private int x, y, width, height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int square() {
        return this.width * this.height;
    }

    public void show() {
        System.out.println("(" + this.x + ", " + this.y + ")에서 크기가 " + this.width + "X" + this.height + "인 사각형");
    }

    public boolean contatins(Rectangle r) {
        boolean flag = false;



        return flag;
    }

}

public class Ex03 {



}

//오버라이딩은 상속관계에서만!!!!!!!일어남 이게 오버로딩이랑 가장 큰 차이점임!!!!!!!!!!!!
//겉은 같고 속은 다름(겉 : 중괄호 바깥, 안 : 메소드 안의 내용)
//클래스 파일이 실행될 때(함수가 호출될 때) 결정(동적 바인딩)
class Shape{//슈퍼 클래스
    //draw() 메소드를 가지고 있다.
    //draw() 메소드는 Shape를 출력
    public Shape next; //기본 생성자(만들어도 되고 안만들어도 됨)
    public Shape(){
        next = null;
    }//초기화(각각의 멤버(rect, circ 등)가 나올 때마다 초기화시킴
                                   //어디에 있는 draw()를 써야하는지 간접적으로 알려줌
    public void draw(){
        System.out.println("Shape");
    }
}
class Line extends Shape{
    @Override //컴파일러가 읽도록 하는 주석 => 어노테이션
    //draw()라는 이름을 중복으로 쓰고 싶을 때 오버라이딩 사용
    //굳이 하나하나 이름 바꿀 필요 없이 메소드 하나로 사용 가능
    public void draw() {
        System.out.println("Line");
    } 
}
//Rect
class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("Rect");
    }
}
//Circle
class Circ extends Shape{
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
//Triangle
class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Triangle");
    }
}

public class OverRidingEx {
    static void paint(Shape p){
        p.draw(); //p가 가리키는 객체 내에 오버라이딩 된 draw() 호출
        //동적 바인딩 : 재정의 된 애를 상황에 맞게 가져오는 것
    }//매개변수를 전달하는 과정에서 오버라이딩이 일어나게 된다!

    public static void main(String[] args) {
        Line line = new Line();
        paint(line); //두줄로 길게 쓴 거
        paint(new Shape()); //줄인 거
        paint(new Line());
        paint(new Rect());
        paint(new Circ());
        paint(new Triangle());
    }
}
//업캐스팅 : 슈퍼 객체를 이용하여 부모 클래스에 접근할 수 있도록 하는 것
//다운캐스팅 : 업캐스팅 된 애를 원래대로 되돌리는 것(타입 변환 표시를 해야한다. 자동X)

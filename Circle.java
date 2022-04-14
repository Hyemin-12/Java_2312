//오버로딩은 동일한 클래스나 상속 관계에서 가능함!!!
//겉은 다르고 속은 같음(겉 : 매개변수의 타입, 개수, 속 : 메서드의 내용)
//컴파일 될 때 결정(정적 바인딩)
public class Circle {
    int radius;
    String name;

    public Circle(){
        radius = 1;
        name = "";
    } //생성자1 (반지름 1, 이름은 빈칸으로 초기화)

    public Circle(int r, String n){
        radius = r;
        name = n;
    } //생성자 2 (매개변수가 존재하는 생성자)

    public Circle(int r){
        radius = r;
    } //생성자 3

    public Circle(String n){
        radius = 15;
        name = n;
    } //생성자 4
    public double getArea(){
        return 3.14 * radius * radius;
    }
    public static void main(String[] args) {
        Circle pizza = new Circle(10, "자바피자"); //선언과 동시에 초기화
        //pizza.radius = 10; //피자 반지름 설정
        //pizza.name = "자바피자"; //피자 이름 설정
        double area = pizza.getArea(); //피자 넓이 구하기

        System.out.println(pizza.name + "의 면적은 " + area);

        Circle donut = new Circle(); //Circle 클래스로 도넛 객체 생성
        //donut.radius = 2; //도넛 반지름 설정
        //donut.name = "자바도넛"; //도넛 이름 설정
        area = donut.getArea(); //도넛 면적 구하기

        System.out.println(donut.name + "의 면적은 " + area);

        Circle c1 = new Circle(5);
        c1.name = "c1";
        area = c1.getArea();
        System.out.println(c1.name + "의 면적은 " + area);

        Circle c2 = new Circle("c2");
        area = c2.getArea();
        System.out.println(c2.name + "의 면적은 " + area);

    }
}

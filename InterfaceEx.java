//추상메서드 : 선언은 되어 있는데 정의는 되어 있지 않다
//          어차피 자식 클래스에서 쓸거니까 굳이 부모 클래스에서 정의를 해놓을 필요가 없음
//추상 클래스랑 인터페이스
//추상 메서드를 재정의 하며 사용
//유사점 : 객체를 생성할 수 없고, 상속을 위한 슈퍼 클래스로만 사용됨
//         클래스의 다형성을 실현하기 위한 목적
//추상클래스 : 추상메서드 O, 변수 O, 상수 O
//            직접 만들어서 씀
//            상속받은 상태(서브클래스)에서 구현할 수 밖에 없는 기능을 주로 추상클래스로 선언
//인터페이스 : 추상메서드 O, 변수 X, 상수 O, 오로지 기능만, 인터페이스끼리 상속 O, 클래스랑 상속할 때는 앞에 implements를 쓴다(구현한다)
//          만들어져 있는 걸 가져다 씀
//인터페이스를 더 많이 쓴다
//둘의 가장 큰 차이점 : 다중 상속(구현)
//                    =>인터페이스는 다중 상속이 가능하다(클래스는 단일 상속만 지원)
interface PhoneInterface{
    final int TIMEOUT = 10000; // 인터페이스에 상수 필드 선언
    void sendCall(); // 인터페이스에서는 abstract 생략해도 추상메서드로 인식함
    void receiveCall(); // 추상 메서드
    default void printLogo(){ // default 메서드
        System.out.println("** Phone **");
    }
}

interface MobilePhoneInterface extends PhoneInterface{
    void sendSMS(); // 추상 메서드
    void receiveSMS(); // 추상 메서드
}

interface MP3Interface{
    public void play();
    public void stop();
}

class PDA{
    public int calculate(int x, int y){
        return x + y;
    }
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{

    @Override
    public void sendCall() {
        System.out.println("전화걸기");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화받기");
    }

    @Override
    public void sendSMS() {
        System.out.println("문자보내기");
    }

    @Override
    public void receiveSMS() {
        System.out.println("문자받기");
    }

    @Override
    public void play() {
        System.out.println("Music Start");
    }

    @Override
    public void stop() {
        System.out.println("Music Stop");
    }
    //추가로 작성한 메서드
    public void schedule(){
        System.out.println("일정 관리");
    }
}

class SamsungPhone implements PhoneInterface{
    // PhoneInterface의 모든 추상 메서드를 구현해야 함!!!
    @Override
    public void sendCall() {
        System.out.println("띠리리링");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화가 왔습니다.");
    }
    // 삼성폰에만 있는 메서드
    public void flash(){
        System.out.println("전화기의 불이 켜졌습니다.");
    }
}

public class InterfaceEx{
    public static void main(String[] args) {
        SamsungPhone phone = new SamsungPhone();
        phone.printLogo(); // 인터페이스에 존재하는 디폴트 메서드
        phone.sendCall(); // 삼성폰에서 재정의한 메서드
        phone.receiveCall(); // 삼성폰에서 재정의한 메서드
        phone.flash(); //삼성폰에만 있는 메서드

        SmartPhone sPhone = new SmartPhone();
        sPhone.printLogo(); // PhoneInterface에 존재하는 디폴트 메서드
        sPhone.sendCall(); // PhoneInterface에 존재하는 추상메서드
        sPhone.play(); // MP3Interface에 존재하는 추상메서드
        System.out.println("3과 5를 더하면 " + sPhone.calculate(3, 5)); // PDA 클래스에 존재하는 메서드
        sPhone.schedule(); // SmartPhone에 존재하는 메서드
    }
}
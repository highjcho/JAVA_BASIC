package polymorphism;

public interface Scheduler {
    void getNextCall();
    void sendCallToAgent();
}

// 추상메소드: 자료형 메소드명(); -> 강제적, 무조건 오버라이딩해서 재구현해야 함
// 디폴트메소드: default 자료형 메소드명(){구현} -> 선택적, 오버라이딩해서 재구현해도 되고 아니면 이미 구현되어있는 것을 디폴트로 사용할 수 있음
// 스태틱메소드: static 자료형 메소드명(){구현} -> 강제적, 오버라이딩 할 수 없고 제공되는 형태로만 사용 가능

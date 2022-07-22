package polymorphism;

public class RoundRobin implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("들어오는 순서대로 전화를 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("모든 상담원 동일한 상담 건수를 처리합니다. ");
    }
}

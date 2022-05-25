package polymorphism;

public class LeastJob implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("들어오는 순서대로 전화를 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("상담을 하지 않는 상담원이나 가장 짧은 대기열을 보유한 상담원에게 배분합니다.");
    }
}

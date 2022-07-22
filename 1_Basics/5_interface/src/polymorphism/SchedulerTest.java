package polymorphism;

import java.io.IOException;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담 할당 방식을 선택하세요.");
        System.out.println("R: 한명씩 차례로 할당");
        System.out.println("L: 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
        System.out.println("P: 우선순위가 높은 고객 먼저 할당");
        char a = (char)System.in.read();
        Scheduler scheduler;
        scheduler = null;
        if (a == 'R' || a == 'r')
            scheduler = new RoundRobin();
        else if (a == 'L' || a == 'l')
            scheduler = new LeastJob();
        else if (a == 'P' || a == 'p')
            scheduler = new PriorityAllocation();
        if (scheduler != null)
        {
            scheduler.getNextCall();
            scheduler.sendCallToAgent();
        }
        else
            System.out.println("Invalid input");
    }
}

package templateMethod;

public abstract class PlayerLevel {
    protected abstract void run();
    protected abstract void jump();
    protected abstract void turn();
    protected abstract void showLevelMessage();
    final protected void go(int times)
    {
        showLevelMessage();
        run();
        for(int i = 0; i < times; i++)
            jump();
        turn();
    }
}

// 추상화 - 오버라이딩 차이?
// 클래스 라이프 사이클 - gc가 어떻게 알고 수거하는 가? 언제 소멸되었다는 것을 알아서?
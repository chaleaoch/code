import javax.print.event.PrintEvent;

interface TestInterface {
    public abstract void name();
}

class TestImplements implements TestInterface {
    public void name() {
        System.out.print("用print输出");
    }
}

class TestJava {
    public static void main(String[] args) {

        TestInterface a = new TestImplements();
        a.name();
    }
}
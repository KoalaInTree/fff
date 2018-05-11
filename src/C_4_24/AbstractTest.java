package C_4_24;

public abstract class AbstractTest {
    public AbstractTest(){
        System.out.println("i'm AbstractTest");
    };
}

class TestSon extends AbstractTest{
    public TestSon(){
        System.out.println("i'm abtest son");
    }

    public TestSon(String s){
        System.out.println(s+"ssssssssssssssssss");
    }

    public static void main(String[] args) {
        new TestSon("a");
    }
}

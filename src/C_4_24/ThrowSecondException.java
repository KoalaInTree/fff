package C_4_24;

public class ThrowSecondException {
    static class Throw2Excp{
        void f() throws MyException{
            throw new MyException("a");
        };

        void dispose()throws MyException2{
            throw new MyException2("b");
        }
    }
    /*public static void main(String[] args) throws Exception{
        Throw2Excp t = new Throw2Excp();
        try {
            t.f();
        } finally {
            t.dispose();
        }
    }*/
    public static void main(String[] args) throws Exception{
        Throw2Excp t = new Throw2Excp();
        t.f();
    }
}

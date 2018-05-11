package C_4_24;

public class ExceptionTest {
    public static void f() throws MyException,Exception{
        throw new MyException("a");
    }

    public static void main(String[] args) {
        try {
            f();
        }   catch (MyException e){
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

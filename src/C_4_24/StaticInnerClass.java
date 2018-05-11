package C_4_24;

public class StaticInnerClass {

    class inner2 {

    }
    static class inner {
        public inner(){
            System.out.println("inner class");
        }
    }

    private class inner3 {}
    public static void main(String[] args) {

    }
}

class main{
    public static void main(String[] args) {
        StaticInnerClass.inner i = new StaticInnerClass.inner();
        StaticInnerClass s = new StaticInnerClass();
        StaticInnerClass.inner2 i2 = s.new inner2();
    }
}

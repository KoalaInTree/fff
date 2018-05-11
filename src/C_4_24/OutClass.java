package C_4_24;

public class OutClass {
    int a;

    private class inner {
        String name;

        inner(String name) {
            this.name = name;
            System.out.println(name);
        }
        void add(){
            a++;
        }

    }
    inner getInner(){
        return new inner("a");
    }

    public void test(){
        inner inner = new inner("test_inner_create");
        System.out.println(inner.name);
    }

    public static void main(String[] args) {
/*        OutClass outClass = new OutClass();
        OutClass.inner i = outClass.new inner("");*/
        OutClass outClass = new OutClass();
        OutClass.inner inner1 = outClass.getInner();
        OutClass.inner inner2 = outClass.getInner();

        inner1.add();
        System.out.println(outClass.a);
        inner2.add();
        System.out.println(outClass.a);

    }
}

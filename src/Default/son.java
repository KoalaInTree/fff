package Default;

import java.util.Arrays;

public class son extends Parent {

    public void say(){
        System.out.println("Default.son say" + a);
    }
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        /*Default.son s =Default.son.class.newInstance();
        for(int i=0;i<3;++i){
            System.out.println(i);
        }*/
        /*Integer[] integers = new Integer[10];
        integers[0] = 1;
        Integer[] integers2 = new Integer[10];
        integers2[0] = 2;
        Integer[] integers3 = new Integer[10];
        integers3[0] = 3;
        Integer[] integerss = Arrays.copyOf(integers, integers.length + integers2.length + integers3.length);
        System.out.println(integerss.length);
        System.out.println(integerss[1]);
        System.arraycopy(integers2, 0, integerss, integers.length, integers2.length);
        System.out.println(integerss[10]);
        System.arraycopy(integers3,0,integerss,integers.length+integers2.length,integers3.length);
        System.out.println(integerss[20]);
*/
        new son();
    }
    public son(){
        super("erzi");
    }
}

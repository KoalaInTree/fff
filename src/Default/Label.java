package Default;

public class Label {
    public static void main(String[] args) {
        label1:
        while(true){
            System.out.println("1");
            continue label1;

        }
    }
}

package C_4_24;

public class NestTryCatch {
    public static void main(String[] args) {
        try {
            try {
                new Exception();
            }catch (Exception e){

            }finally {
                System.out.println("inner finally say out");
            }
        }catch (Exception e){

        }finally {
            System.out.println("out finally say out");
        }
    }
}

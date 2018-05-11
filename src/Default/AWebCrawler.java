package Default;

public abstract class AWebCrawler implements WebCrawler {

    @Override
    public void getWebInfo() {
        System.out.println("getWebInfo");
    }

    @Override
    public void getClient() {
        System.out.println("getClient");
    }
}

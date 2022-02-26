package Crawler;

abstract class Crawler implements Searchable {

    private String baseUrl;

    public void setBaseUrl(String url) {
        this.baseUrl = url;
    }

    public abstract void crawl();

}

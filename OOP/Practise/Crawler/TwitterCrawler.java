package Crawler;

public class TwitterCrawler extends Crawler {
    public void crawl() {
        System.out.println("Crawl tweets!");
    }

    public void search(String s) {
        System.out.println("Search tweets: " + s);
    }

}

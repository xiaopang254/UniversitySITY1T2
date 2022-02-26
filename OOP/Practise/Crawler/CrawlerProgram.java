package Crawler;

public class CrawlerProgram {
    public void crawl(Crawler crawler) {
        crawler.crawl();
    }

    public void search(Searchable searcher, String s) {
        searcher.search(s);
    }

    public static void main(String[] args) {
        CrawlerProgram crawlerProgram = new CrawlerProgram();

        Crawler twitterCrawler = new TwitterCrawler();
        Crawler redditCrawler = new RedditCrawler();

        twitterCrawler.setBaseUrl("url");

        crawlerProgram.crawl(twitterCrawler);
        crawlerProgram.search(twitterCrawler, "1");

        crawlerProgram.crawl(redditCrawler);
        crawlerProgram.search(twitterCrawler, "2");

        crawlerProgram.search(new StorangeHandler(), "3");

    }

}

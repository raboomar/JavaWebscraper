
import scraper.JobScraper;

public class Main {
    public static void main(String[] args) {
        JobScraper jobScraper = JobScraper.getInstance();
        jobScraper.getJobs();


    }
}

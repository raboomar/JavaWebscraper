package scraper;
import JsonMaker.JsonMaker;
import environment.Environment;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import JsonMaker.File;
import java.util.ArrayList;


public class JobScraper {
    private final String url = Environment.getInstance().getUrl();

    public static JobScraper getInstance() {
        JobScraper jobScraper;
        return jobScraper = new JobScraper();
    }

    public void getJobs() {

        ArrayList<String> jobList = new ArrayList<>();
        try {

            Long id = 0L;
            final Document document = Jsoup.connect(url).get();
            for (Element listItem : document.select("ul li")) {
                if (listItem.text().contains("|")) {
                    String job = JsonMaker.getInstance().json(listItem, id);
                    jobList.add(job);
                    id++;
                }
            }

        File.getInstance().makeJsonFile("jobs",jobList);

        } catch (Exception error) {
            error.printStackTrace();
        }
    }
}

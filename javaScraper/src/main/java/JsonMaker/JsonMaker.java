package JsonMaker;

import DataScraped.JobsWithoutWhiteBoards;
import com.google.gson.Gson;
import org.jsoup.nodes.Element;

public class JsonMaker {
    public static JsonMaker jsonMaker;

    public static JsonMaker getInstance() {
        return jsonMaker = new JsonMaker();
    }

    public String json(Element selectedElement, Long id) {
        String companyName = selectedElement.select("a").text();
        String url = selectedElement.select("a").attr("href");
        String discription = selectedElement.text();
        JobsWithoutWhiteBoards jobsWithoutWhiteBoards = new JobsWithoutWhiteBoards(id, companyName, url, discription);
        return new Gson().toJson(jobsWithoutWhiteBoards);
    }
}

package DataScraped;

public class JobsWithoutWhiteBoards {
    private Long id;
    private String companyName, url, description;

    public JobsWithoutWhiteBoards(Long id, String companyName, String url, String description) {
        this.id = id;
        this.companyName = companyName;
        this.url = url;
        this.description = description;
    }

    @Override
    public String toString() {
        return
                "id:" +  id +
                ", companyName \' :'" + companyName + '\'' +
                ", url:'" + url + '\'' +
                ", description:'" + description + '\''
                ;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

package hello;

public class AppArticle {

    private int id;
	private String title;
    private String content;

    public AppArticle(int id, String title, String content) {
    		this.id = id;
        this.title = title;
        this.content = content;
    }
    
    public int getId() {
    		return id;
    }

    public String getTitle() {
        return title;
    }
    
    public String getParagraph() {
        return content;
    }
}

package hello;

public class AppArticle {

    private int id;
	private String title;
    private String paragraph;

    public AppArticle(int id, String title, String paragraph) {
    		this.id = id;
        this.title = title;
        this.paragraph = paragraph;
    }
    
    public int getId() {
    		return id;
    }

    public String getTitle() {
        return title;
    }
    
    public String getParagraph() {
        return paragraph;
    }
}

package hello;

public class AppArticle {

    private int id;
    private String icon;
	private String title;
    private String paragraph;

    public AppArticle(int id, String icon, String title, String paragraph) {
    		this.id = id;
    		this.icon = icon;
        this.title = title;
        this.paragraph = paragraph;
    }
    
    public int getId() {
    		return id;
    }
    
    public String getIcon() {
        return icon;
    }

    public String getTitle() {
        return title;
    }
    
    public String getParagraph() {
        return paragraph;
    }
}

package hello;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;

@RestController
public class AppArticleController {

    private String appName;
    private int nArticle;
    
    @CrossOrigin(origins = "http://localhost:8100")
    @RequestMapping("/apparticle")
    public ArrayList AppArticle(@RequestParam(value="app") String name, @RequestParam(value="amount") int nArticle) {
    	
    	//Define variables to pass to SiteCore
    	this.appName = name;
    	this.nArticle = nArticle;
    	
    	//Define new instance of Lorem Ipsum generator
    	Lorem lorem = LoremIpsum.getInstance();
    	
    	//Define ArrayList
    	ArrayList al = new ArrayList();
    	
    	//For-loop to determine how many articles put in the ArrayList
    	for (int i = 0; i < nArticle; i++) {
    		al.add(new AppArticle(i, lorem.getTitle(2, 4), lorem.getHtmlParagraphs(2, 4)));
    	}
    	
    	//Return the ArrayList
    	return al;
    	
    }
    
}

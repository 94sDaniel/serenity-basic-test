package seekers.dogpile.pageObject;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.youtube.com/") // Corrected URL: dogpile.com, not dogfile.com
public class DogpileMainPage extends PageObject {

    WebDriver driver = new ChromeDriver();

    @FindBy(css = "#center > yt-searchbox > div.ytSearchboxComponentInputBox > form > input")
    WebElementFacade searchBox;

    @FindBy(css = "button[title='Search'] yt-icon div")
    WebElementFacade searchBottom;

    public void enterKeyWord (String keyword){
        searchBox.type(keyword);
    }

    public void doSearch (){
        searchBottom.click();
    }

}

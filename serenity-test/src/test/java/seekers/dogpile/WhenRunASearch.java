package seekers.dogpile;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import seekers.dogpile.steps.DogPileUser;

@RunWith(SerenityRunner.class)
public class WhenRunASearch {
    @Steps
    DogPileUser dani;

    @Managed
    WebDriver driver;

    @Test
    public void should_watch_important_resoults(){
        dani.enter_page();

        dani.key_word_search("nacional rock");

        dani.watch_key_word_resoults("rock");
    }
}

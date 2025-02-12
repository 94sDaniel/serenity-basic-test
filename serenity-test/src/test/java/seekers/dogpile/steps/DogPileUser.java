package seekers.dogpile.steps;

import net.serenitybdd.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.hamcrest.Matchers;
import seekers.dogpile.pageObject.DogpileMainPage;
import seekers.dogpile.pageObject.DogpileresoultPage;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class DogPileUser extends ScenarioSteps {

    String actor;
    DogpileMainPage mainPage;
    DogpileresoultPage resoultaPage;


    @Step("#actor go to Main Page DogPile") //el # reemplaza el valor por el actor del WhenRunASearch
    public void enter_page(){
        System.out.println("Main Page" + mainPage);;
        mainPage.open();
    }
    @Step("#actor do a search about: {0}") // el cero en corchetes {0} reemplaza por el valor que este por parametro en la funcion
    public void key_word_search(String keyWord){
        mainPage.enterKeyWord(keyWord);
        mainPage.doSearch();
    }
    @Step
    public void watch_key_word_resoults(String expectedWord){
        List<String> results = resoultaPage.getResoults();
        results.replaceAll(String::toLowerCase);
        for(int i = 0; i < results.size(); i++){
            System.out.println(results.get(i));
        }
        assertThat(results, Matchers.everyItem(Matchers.containsString(expectedWord)));
    }
}

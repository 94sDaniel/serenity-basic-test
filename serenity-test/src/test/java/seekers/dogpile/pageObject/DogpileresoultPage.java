package seekers.dogpile.pageObject;

import net.thucydides.core.pages.PageObject;

import java.util.List;
import java.util.stream.Collectors;

public class DogpileresoultPage extends PageObject {

    public static final String RESOULT_TITTLE = ".web-yahoo__title";

    public List<String> getResoults(){
        return findAll(RESOULT_TITTLE)
                .stream()
                .map(element -> element.getAttribute("textContext"))
                .collect(Collectors.toList());

    }
}

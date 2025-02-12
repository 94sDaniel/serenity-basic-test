package motoresdebusqueda.dogpile;

import motoresdebusqueda.dogpile.steps.UsuarioDogPile;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CuandoEjecutamosUnaBusqueda {

    @Steps
    UsuarioDogPile juan;

    @Managed
    WebDriver driver;

    @Test
    public void deberiamos_ver_resultados_relevantes(){
        juan.ingresa_a_dogpile();

        juan.busca_por_palabra_clave("rock nacional");

        juan.deberia_ver_resutlados_con_palabra("rock");
    }

    @Test
    public void resultado_de_wikipedia_contiene_texto_correcto(){
        juan.ingresa_a_dogpile();

        juan.busca_por_palabra_clave("rock  nacional");

        juan.deberia_ver_resultado_de_titulo_con_texto_correcto("Argentine rock - Wikipedia",
                "Argentine Rock Nacional is one of the principal predecessors");
    }
}

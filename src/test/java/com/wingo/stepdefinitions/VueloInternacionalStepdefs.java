package com.wingo.stepdefinitions;
import com.wingo.pages.ResultadoBusqueda;
import com.wingo.task.BuscarVueloInternacional;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class VueloInternacionalStepdefs {

    @Cuando("{actor} busca vuelo de {string} a {string}")
    public void buscaVueloDeA(Actor actor, String origen, String destino) {
        actor.attemptsTo(
                BuscarVueloInternacional.simple(origen,destino)
        );
    }
    @Entonces("{actor} debe encontrar un vuelo de ida y regeso")
    public void debeEncontrarUnVuelo(Actor actor) {
        String mainHandle = getDriver().getWindowHandle();
        Set<String> allHandles = getDriver().getWindowHandles();
        for (String windowHandle:allHandles             ) {
            if (!mainHandle.equals(windowHandle)){
                getDriver().switchTo().window(windowHandle);
            }
        }

        OnStage.theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(ResultadoBusqueda.VUELO_IDA, isVisible()).forNoMoreThan(Duration.ofSeconds(5))
        );

        actor.attemptsTo(
                Ensure.that(ResultadoBusqueda.VUELO_IDA).values().hasSizeGreaterThanOrEqualTo(1)
        );

        WebElement element = getDriver().findElement(By.xpath(ResultadoBusqueda.XPATH_VUELO_REGRESO));
        Coordinates coordinate = ((Locatable)element).getCoordinates();
        coordinate.onPage();
        coordinate.inViewPort();

        actor.attemptsTo(
                Ensure.that(ResultadoBusqueda.VUELO_REGRESO).values().hasSizeGreaterThanOrEqualTo(1)
        );
    }

}

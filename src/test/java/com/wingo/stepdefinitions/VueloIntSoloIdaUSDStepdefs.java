package com.wingo.stepdefinitions;

import com.wingo.pages.ResultadoBusqueda;
import com.wingo.task.BuscarVueloInternacional;
import com.wingo.task.BuscarVueloInternacionalSoloIdaenUSD;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;
import java.util.Set;

import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class VueloIntSoloIdaUSDStepdefs {
    @Cuando("{actor} busca vuelo de {string} a {string} en dolares y solo de ida en la ultima fecha disponible del mes siguiente")
    public void busca_vuelo_de_a_en_dolares_y_solo_de_ida_en_la_ultima_fecha_disponible_del_mes_siguiente(Actor actor, String origen, String destino) {
        actor.attemptsTo(
                BuscarVueloInternacionalSoloIdaenUSD.simple(origen,destino)
        );
    }
    @Entonces("{actor} debe encontrar un vuelo de ida en la ultima fecha disponible del mes siguiente")
    public void debe_encontrar_un_vuelo_de_ida_en_la_ultima_fecha_disponible_del_mes_siguiente(Actor actor) {
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
    }
}

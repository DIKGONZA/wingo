package com.wingo.stepdefinitions;

import com.wingo.pages.ResultadoBusqueda;
import com.wingo.task.MuestraTarifasDelMes;
import com.wingo.task.SeleccionarMejorTarifaMesSiguiente;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CasoCuatro {

    @Cuando("{actor} busca vuelo de {string} a {string} para el mes siguiente")
    public void buscaVueloDeAParaElMesSiguiente(Actor actor, String origen, String destino) {
        actor.attemptsTo(
                com.wingo.task.CasoCuatro.simple(origen,destino)
        );
    }
    @Entonces("{actor} debe seleccionar la mejor tarifa del mes")
    public void debe_seleccionar_la_mejor_tarifa_del_mes(Actor actor) {
        actor.attemptsTo(
                MuestraTarifasDelMes.simple()
        );
        OnStage.theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(ResultadoBusqueda.MEJOR_TARIFA_MES, isVisible()).forNoMoreThan(Duration.ofSeconds(5))
        );
        actor.attemptsTo(
                SeleccionarMejorTarifaMesSiguiente.simple()
        );
    }

}

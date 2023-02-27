package com.wingo.stepdefinitions;


import com.wingo.pages.destinosInternacionales;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CasoDos {

    @Cuando("{actor} busca un destino internacional como {string}")
    public void busca_un_destino_internacional_como(Actor actor, String destino) {
        actor.attemptsTo(
                com.wingo.task.CasoDos.simple(destino)
        );
    }
    @Entonces("{actor} debe encontrar al menos {string} vuelos para {string}")
    public void debeEncontrarAlMenosVuelosPara(Actor actor, String totalVuelos, String destino) {
        WaitUntil.the(destinosInternacionales.CONTENEDOR_MENOR_PRECIO, isVisible()).forNoMoreThan(Duration.ofSeconds(5));
        Ensure.that(destinosInternacionales.VUELOS_INTERNACIONLES).values().hasSizeGreaterThanOrEqualTo(3);
    }
}

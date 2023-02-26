package com.wingo.stepdefinitions;

import com.wingo.task.BuscalVueloNacionalSoloIdaMejorTarifaMesSiguiente;
import com.wingo.task.SeleccionarMejorTarifaMesSiguiente;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;

public class VueloNacionalSoloIdaMejorTarifaMesSiguienteStepDefs {
    @Cuando("{actor} busca vuelo de {string} a {string} para el mes siguiente")
    public void busca_vuelo_de_a_para_el_mes_siguiente(Actor actor, String origen, String destino) {
        actor.attemptsTo(
        BuscalVueloNacionalSoloIdaMejorTarifaMesSiguiente.simple(origen,destino)
        );
    }
    @Entonces("{actor} debe seleccionar la mejor tarifa del mes")
    public void debe_seleccionar_la_mejor_tarifa_del_mes(Actor actor) {
        actor.attemptsTo(
                SeleccionarMejorTarifaMesSiguiente.simple()
        );
    }
}

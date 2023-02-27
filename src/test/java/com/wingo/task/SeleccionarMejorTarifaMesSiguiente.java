package com.wingo.task;

import com.wingo.pages.ResultadoBusqueda;
import com.wingo.pages.formularioBusqueda;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

import java.util.Set;

import static net.serenitybdd.core.Serenity.getDriver;

public class SeleccionarMejorTarifaMesSiguiente {

    public static Performable simple() {
        return Task.where("{0} selecciona la mejora tarifa del mes seleccionado",
                Click.on(ResultadoBusqueda.MEJOR_TARIFA_MES)
        );
    };
}



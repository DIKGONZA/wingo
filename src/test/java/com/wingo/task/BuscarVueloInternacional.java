package com.wingo.task;

import com.wingo.pages.ResultadoBusqueda;
import com.wingo.pages.formularioBusqueda;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuscarVueloInternacional {
    public static Performable simple(String origen,String destino) {
        return Task.where("{0} busca una vuelo desde '" + origen + "' hacia '" + destino,
                Open.url("https://www.wingo.com/es"),
                Click.on(formularioBusqueda.SELECT_DESDE),
                Enter.theValue(origen).into(formularioBusqueda.INPUT_DESDE),
                Click.on(formularioBusqueda.AEROPUERTO_ORIGEN),
                Click.on(formularioBusqueda.AEROPUERTO_DESTINO),
                Click.on(formularioBusqueda.INPUT_FECHA_IDA),
                Click.on(formularioBusqueda.FECHA_IDA),
                Click.on(formularioBusqueda.FECHA_REGRESO),
                Click.on(formularioBusqueda.BOTON_BUSCAR)
                );
    }

}

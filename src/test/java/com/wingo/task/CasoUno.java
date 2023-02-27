package com.wingo.task;

import com.wingo.pages.formularioBusqueda;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class CasoUno {
    public static Performable simple(String origen,String destino) {
        return Task.where("{0} busca una vuelo desde '" + origen + "' hacia '" + destino,
                Open.url("https://www.wingo.com/es"),
                Click.on(formularioBusqueda.SELECT_DESDE),
                Enter.theValue(origen).into(formularioBusqueda.INPUT_DESDE),
                Click.on(formularioBusqueda.AEROPUERTO_ORIGEN_MED),
                Click.on(formularioBusqueda.AEROPUERTO_DESTINO_PUJ),
                Click.on(formularioBusqueda.INPUT_FECHA_IDA),
                Click.on(formularioBusqueda.FECHA_IDA),
                Click.on(formularioBusqueda.FECHA_REGRESO),
                Click.on(formularioBusqueda.BOTON_BUSCAR)
                );
    }

}

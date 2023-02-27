package com.wingo.task;

import com.wingo.pages.formularioBusqueda;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class CasoTres {
    public static Performable simple(String origen, String destino) {
        return Task.where("{0} busca una vuelo desde '" + origen + "' hacia '" + destino + " solo de ida y en usd",
                Open.url("https://www.wingo.com/es"),
                Click.on(formularioBusqueda.CHECK_SOLO_IDA),
                Click.on(formularioBusqueda.SELECT_DESDE),
                Enter.theValue(origen).into(formularioBusqueda.INPUT_DESDE),
                Click.on(formularioBusqueda.AEROPUERTO_ORIGEN_MED),
                Click.on(formularioBusqueda.AEROPUERTO_DESTINO_CUN),
                Click.on(formularioBusqueda.ULTIMA_FECHA_DISPONIBLE_MES_2),
                Click.on(formularioBusqueda.INPUT_MONEDA),
                Click.on(formularioBusqueda.MONEDA_DOLAR),
                Click.on(formularioBusqueda.BOTON_BUSCAR)
        );
    }
}

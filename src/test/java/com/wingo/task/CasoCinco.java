package com.wingo.task;

import com.wingo.pages.formularioBusqueda;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class CasoCinco {

    public static Performable simple(String origen, String destino) {
        return Task.where("{0} busca una vuelo desde '" + origen + "' hacia '" + destino + " solo de ida y en usd",
                Open.url("https://www.wingo.com/es"),
                Click.on(formularioBusqueda.INPUT_VER_MES),
                Click.on(formularioBusqueda.CHECK_SOLO_IDA),
                Click.on(formularioBusqueda.SELECT_DESDE),
                Enter.theValue(origen).into(formularioBusqueda.INPUT_DESDE),
                Click.on(formularioBusqueda.AEROPUERTO_ORIGEN_BOG),
                Click.on(formularioBusqueda.AEROPUERTO_DESTINO_CTG),
                Click.on(formularioBusqueda.INPUT_FECHA_IDA),
                Click.on(formularioBusqueda.SIGUIENTE_MES),
                Click.on(formularioBusqueda.FECHA_MES_2_PRIMERA_FECHA_DISPONIBLE),
                Click.on(formularioBusqueda.INPUT_MONEDA),
                Click.on(formularioBusqueda.MONEDA_DOLAR),
                Click.on(formularioBusqueda.BOTON_BUSCAR)
        );
    }
}

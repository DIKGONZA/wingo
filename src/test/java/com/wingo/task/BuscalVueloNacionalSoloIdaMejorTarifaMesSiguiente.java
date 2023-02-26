package com.wingo.task;

import com.wingo.pages.formularioBusqueda;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class BuscalVueloNacionalSoloIdaMejorTarifaMesSiguiente {
    public static Performable simple(String origen, String destino) {
        return Task.where("{0} busca una vuelo nacional desde '" + origen + "' hacia '" + destino + " solo de ida y mejora tarifa mes siguiente",
                Open.url("https://www.wingo.com/es"),
                Click.on(formularioBusqueda.INPUT_VER_MES),
                Click.on(formularioBusqueda.CHECK_SOLO_IDA),
                Click.on(formularioBusqueda.SELECT_DESDE),
                Enter.theValue(origen).into(formularioBusqueda.INPUT_DESDE),
                Click.on(formularioBusqueda.AEROPUERTO_ORIGEN_MED),
                Click.on(formularioBusqueda.AEROPUERTO_DESTINO_BOG),
                Click.on(formularioBusqueda.FECHA_MES_2_ULTIMA_FECHA_DISPONIBLE),
                Click.on(formularioBusqueda.BOTON_BUSCAR)
        );
    }
}

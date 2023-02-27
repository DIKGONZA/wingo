package com.wingo.task;

import com.wingo.pages.formularioBusqueda;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class CasoDos {
    public static Performable simple(String destino) {
        return Task.where("{0} busca  vuelos para '" + destino + "",
                Open.url("https://www.wingo.com/es"),
                Click.on(formularioBusqueda.LINK_DESTINOS),
                Click.on(formularioBusqueda.LINK_DESTINO_LIMA)
        );
    }
}

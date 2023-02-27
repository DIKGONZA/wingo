package com.wingo.task;

import com.wingo.pages.ResultadoBusqueda;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.Set;

import static net.serenitybdd.core.Serenity.getDriver;

public class MuestraTarifasDelMes {
        public static Performable simple() {
            String mainHandle = getDriver().getWindowHandle();
            Set<String> allHandles = getDriver().getWindowHandles();
            for (String windowHandle:allHandles) {
                if (!mainHandle.equals(windowHandle)){
                    getDriver().switchTo().window(windowHandle);
                }
            }
            return Task.where("{0} selecciona la mejora tarifa del mes seleccionado",
                    Click.on(ResultadoBusqueda.BOTON_TARIFAS_X_MES)
            );
        };

}

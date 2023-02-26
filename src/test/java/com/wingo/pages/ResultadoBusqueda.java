package com.wingo.pages;

import net.serenitybdd.screenplay.targets.Target;

public class ResultadoBusqueda {
    public static Target VUELO_IDA = Target.the("vuelo ida").locatedBy("//div[@id='vuelos-ida']");
    public static String XPATH_VUELO_REGRESO = "//div[@id='week-regreso']";
    public static Target VUELO_REGRESO = Target.the("Vuelo de regreso").locatedBy("//div[@id='vuelos-regreso']");

}

package com.wingo.pages;

import net.serenitybdd.screenplay.targets.Target;

public class destinosInternacionales {

    public static Target CONTENEDOR_MENOR_PRECIO = Target.the("CONTENEDOR DE MENOR PRECIO").locatedBy("//div[@class='menorprecio-container']");
    public static Target VUELOS_INTERNACIONLES = Target.the("Listado Vuelos Internacionales").locatedBy("//div[@class='slick-list']/child::div[@class='slick-track']/child::div[@aria-hidden='false']");
}

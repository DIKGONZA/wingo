package com.wingo.pages;

import net.serenitybdd.screenplay.targets.Target;

public class formularioBusqueda {

    public static Target INPUT_DESDE = Target.the("input origen").locatedBy("//input[@id='inputOrigen']");
    public static Target SELECT_DESDE = Target.the("input origen").locatedBy("//input[@id='inputOrigen']/preceding-sibling::div[@class=' styledSelect styledSelectOrigen']");
    public static Target INPUT_HACIA = Target.the("input hacia").locatedBy("//input[@id='inputDestino']");
    public static Target AEROPUERTO_ORIGEN = Target.the("Aeropuerto Origen").locatedBy("//li[@data-cod='MDE']");
    public static Target AEROPUERTO_DESTINO = Target.the("Aeropuerto destino").locatedBy("//li[@data-cod='PUJ']");
    public static Target INPUT_FECHA_IDA = Target.the("Input Fecha ida").locatedBy("//div[@id='btBalendarFrom']");
    public static Target FECHA_IDA = Target.the("Fecha Regreso").locatedBy("(//div[@id='inputOutboundDate']//descendant::table[@class='month1']//descendant::div[contains(@class,' valid')])[last()]");
    public static Target FECHA_REGRESO = Target.the("Fecha Regreso").locatedBy("(//div[@id='inputReturnDate']//descendant::table[@class='month2']//descendant::div[contains(@class,' valid')])[last()]");
    public static Target BOTON_BUSCAR = Target.the("Botón Buscar").locatedBy("//div[@class='btn-search bt-search']");
}


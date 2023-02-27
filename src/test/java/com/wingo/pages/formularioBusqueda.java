package com.wingo.pages;

import net.serenitybdd.screenplay.targets.Target;

public class formularioBusqueda {

    public static Target CHECK_SOLO_IDA = Target.the("check solo ida").locatedBy("//button[@id='btnIda']");
    public static Target INPUT_DESDE = Target.the("input origen").locatedBy("//input[@id='inputOrigen']");
    public static Target SELECT_DESDE = Target.the("input origen").locatedBy("//input[@id='inputOrigen']/preceding-sibling::div[@class=' styledSelect styledSelectOrigen']");
    public static Target AEROPUERTO_ORIGEN_MED = Target.the("Aeropuerto Origen de medellin").locatedBy("//li[@data-cod='MDE']");
    public static Target AEROPUERTO_DESTINO_PUJ = Target.the("Aeropuerto destino punta cana").locatedBy("//li[@data-cod='PUJ']");
    public static Target AEROPUERTO_DESTINO_CUN = Target.the("Aeropuerto destino cancun").locatedBy("//li[@data-cod='CUN']");
    public static Target AEROPUERTO_DESTINO_BOG = Target.the("Aeropuerto destino bogota").locatedBy("//li[@data-cod='BOG']");
    public static Target AEROPUERTO_DESTINO_CTG = Target.the("Aeropuerto destino Cartagena").locatedBy("//li[@data-cod='CTG']");
    public static Target AEROPUERTO_ORIGEN_BOG = Target.the("Aeropuerto origen bogota").locatedBy("//li[@data-cod='BOG']");
    public static Target INPUT_FECHA_IDA = Target.the("Input Fecha ida").locatedBy("//div[@id='btBalendarFrom']");
    public static Target FECHA_IDA = Target.the("Fecha Regreso").locatedBy("(//div[@id='inputOutboundDate']//descendant::table[@class='month1']//descendant::div[contains(@class,' valid')])[last()]");
    public static Target FECHA_REGRESO = Target.the("Fecha Regreso").locatedBy("(//div[@id='inputReturnDate']//descendant::table[@class='month2']//descendant::div[contains(@class,' valid')])[last()]");
    public static Target ULTIMA_FECHA_DISPONIBLE_MES_2 = Target.the("ultima fecha disponble mes siguiente").locatedBy("(//div[@id='inputOutboundDate']//descendant::table[@class='month2']//descendant::div[contains(@class,' valid')])[last()]");
    public static Target SIGUIENTE_MES = Target.the("Siguiente mes").locatedBy("//table[@class='month2']//descendant::span[@class='next']");
    public static Target FECHA_MES_2_PRIMERA_FECHA_DISPONIBLE = Target.the("primera fecha disponble 2 mes siguiente").locatedByFirstMatching("(//div[@id='inputOutboundDate']//descendant::table[@class='month2']//descendant::div[contains(@class,' valid')])");
    public static Target BOTON_BUSCAR = Target.the("Botón Buscar").locatedBy("//div[@class='btn-search bt-search']");
    public static Target INPUT_MONEDA = Target.the("Input moneda").locatedBy("//div[@class='styledSelect styledSelectMoneda']");
    public static Target MONEDA_DOLAR = Target.the("MONEDA DOLAR").locatedBy("//ul[@id='currencies']/child::li[contains(text(),'USD')]");
    public static Target INPUT_VER_MES = Target.the("Ver Tarifas del mes").locatedBy("//input[@id='ver-mes']/..");
    public static Target LINK_DESTINOS = Target.the("Link destinos").locatedBy("//a[@class='nav-link' and contains(text(),'Destinos')]");
    public static Target LINK_PRO = Target.the("Link destinos").locatedBy("//a[@class='nav-link' and contains(text(),'Destinos')]");
    public static Target LINK_DESTINO_LIMA = Target.the("Link destino LIMA").locatedBy("//a[contains(text(),'Lima')]");
}


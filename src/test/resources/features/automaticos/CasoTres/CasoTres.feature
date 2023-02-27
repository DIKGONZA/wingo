# language: es
Característica: VueloInternacionalEnUSDSoloIda

  Escenario: Buscar vuelo para cancun en dolares y solo ida
    Cuando "Juan" busca vuelo de "Medellín" a "Cancun" en dolares y solo de ida en la ultima fecha disponible del mes siguiente
    Entonces "Juan" debe encontrar un vuelo de ida en la ultima fecha disponible del mes siguiente
# language: es
Característica: VueloInternacionalMenosde100USD

  @manual
  @Manual:Passed
  Escenario: Buscar vuelo para cancun en dolares y solo ida
    Cuando "Jorge" busca vuelo de "Bogota" a "Caracas" en dolares
    Entonces "Jorge" debe encontrar un vuelo por menos de 100 usd


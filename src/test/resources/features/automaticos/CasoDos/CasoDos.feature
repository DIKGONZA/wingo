# language: es
Característica: Buscar un destino internacional

  Escenario: Buscar vuelos para un destino internacional
    Cuando "Andres" busca un destino internacional como "lima"
    Entonces "Andres" debe encontrar al menos "3" vuelos para "lima"
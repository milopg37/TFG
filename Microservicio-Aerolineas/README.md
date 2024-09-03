## Endpoints de la API 🧫

Microservicio Aerolinea:
```
CRUD
    GET    /aerolinea/findAll: Busca y devuelve todas las aerolineas
    GET    /aerolinea/{nombre}: Busca y devuelve una aerolinea dado su nombre
    POST   /aerolinea/addAerolinea: Agrega una nueva aerolinea a la BBDD. Se pasa por el request body en formato JSON
    PUT    /aerolinea/updateFlota/{codigoAerolinea/{flota}:  Actualiza la flota de una aerolinea, dado su codigo
    DELETE /aerolinea/deleteAerolinea/{codigoAerolinea}: Borra la aerolinea de la BBDD indicando su codigo

EXTRAS
    GET   /aerolinea/buscarPorPais/{paisOrigen}: Obtener las aerolineas por pais de origen
    GET   /aerolinea/buscarPorTipo/{tipo}: Obtener aerolineas segun cual sea su tipo (comercial, militar)
    GET   /aerolinea/filtrarPorFundacion/{inicio}/{fin}: Obtener aerolineas fundadas entre un rango de años dado
    GET   /aerolinea/contarPorPais/{paisOrigen}: Contar las aerolineas por pais de origen. Devuelve un número
    GET   /aerolinea/flotaSuperior/{flotaMinima}: Obtener las aerolineas con una flota mayor o igual a la indicada
```

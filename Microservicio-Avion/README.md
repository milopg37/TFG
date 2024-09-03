## Endpoints de la API 🧫

Microservicio Avion:
```
CRUD
    🟢GET          /avion/findByModelo/{modelo}:                  Busca y devuelve un avion cuyo modelo sea parecido a uno que se encuentre en la BD
    🔵PUT          /avion/updateAvion/{modelo}/{numeroSerie}:     Actualiza el numero de serie de un avion mediante busqueda por modelo
    🔴DELETE       /avion/deleteAvion/{matricula}:                Borra un avion de la BD dada su matricula
    🟡POST         /avion/addAvion:                               Agrega un nuevo avion en la BD. Se envía el nuevo objeto por Request Body

EXTRAS
    🟢GET          /avion/byfabricante/{fabricante}:              Devuelve lista de aviones que pertenezcan al fabricante especificado
    🟢 GET         /avion/byfechafabricacion/{inicio}/{fin}:      Devuelve lista de aviones cuyo año de fabricacion se encuentre en el rango dado
    🟢GET          /avion/bytipomotor/{tipomotor}:                Devuelve lista de aviones filtrando por tipo de motor dado
    🟢GET          /avion/byvelocidadmayor/{velocidadComparar}:   Devuelve lista de aviones cuya velocidad maxima supere la especificada
    🟢GET          /avion/bytipo/{tipo}:                          Devuelve lista de aviones pertenecientes al tipo requerido
    🟢GET          /avion/byvelocidad:                            Devuelve la lista de aviones completa ordenandolos por velocidad maxima en descendiente
    🟢GET          /avion/bymtwo:                                 Devuelve lista de aviones completa ordenandolos por MTOW descendiente
```

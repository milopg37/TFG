## Endpoints de la API 🧫

Microservicio Avion:
```
CRUD
    <span style="color:green;">GET</span>         /avion/findByModelo/{modelo}:                  Busca y devuelve un avion cuyo modelo sea parecido a uno que se encuentre en la BD
    <span style="color:blue;">PUT</span>          /avion/updateAvion/{modelo}/{numeroSerie}:     Actualiza el numero de serie de un avion mediante busqueda por modelo
    <span style="color:red;">DELETE</span>        /avion/deleteAvion/{matricula}:                Borra un avion de la BD dada su matricula
    <span style="color:yellow;">POST</span>       /avion/addAvion:                               Agrega un nuevo avion en la BD. Se envía el nuevo objeto por Request Body

EXTRAS
    <span style="color:green;">GET</span>         /avion/byfabricante/{fabricante}:              Devuelve lista de aviones que pertenezcan al fabricante especificado
    <span style="color:green;">GET</span>         /avion/byfechafabricacion/{inicio}/{fin}:      Devuelve lista de aviones cuyo año de fabricacion se encuentre en el rango dado
    <span style="color:green;">GET</span>         /avion/bytipomotor/{tipomotor}:                Devuelve lista de aviones filtrando por tipo de motor dado
    <span style="color:green;">GET</span>         /avion/byvelocidadmayor/{velocidadComparar}:   Devuelve lista de aviones cuya velocidad maxima supere la especificada
    <span style="color:green;">GET</span>         /avion/bytipo/{tipo}:                          Devuelve lista de aviones pertenecientes al tipo requerido
    <span style="color:green;">GET</span>         /avion/byvelocidad:                            Devuelve la lista de aviones completa ordenandolos por velocidad maxima en descendiente
    <span style="color:green;">GET</span>         /avion/bymtwo:                                 Devuelve lista de aviones completa ordenandolos por MTOW descendiente
```

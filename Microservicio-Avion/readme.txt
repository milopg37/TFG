MICROSERVICIO: Avion

Vamos a ofrecer un CRUD de Aviones más algunas funciones extras utilizando BD con Spring JPA

GET 	--> 	Recuperar
POST 	--> 	Insertar
PUT 	--> 	Actualizar
DELETE 	--> 	Borrar

http://localhost:8080/avion/ + {{una ruta del controller}}					
http://localhost:8080/avion/ + {{una ruta del controller}}							
http://localhost:8080/avion/ + {{una ruta del controller}}	
http://localhost:8080/avion/ + {{una ruta del controller}}				
http://localhost:8080/avion/ + {{una ruta del controller}}			
http://localhost:8080/avion/ + {{una ruta del controller}}	

	Antes de nada, crear la carpeta Scripts en resources -> scriptsSQL o en una carpeta externa al proyecto.
	Donde estarán nuestros scripts de creacion de la tabla del modelo con sus columnas
	Y el insert into para rellenar con algunos datos

1- Crear proyecto y poner dependencias (Starter Web, Spring Data JPA, Thymeleaf, lo que necesitemos)

2- Definir el modelo (package models) y mapearlo con anotaciones JPA a la tabla de la BD

3- Crear Acceso a Datos (package DAO) e interfaz que implemente JpaRepository
	Esto es necesario cuando tenemos BD
	3.1 Crear la interfaz que herede de JpaRepository

4- Trabajar con la capa de servicio (package service)
	4.1 Crear la interfaz y añadir los métodos necesarios
	4.2 Crear clase que implemente esa interfaz (@Service) (crear RestTemplate y poner Autowired en caso de necesitarlo)
	
4- Implementar el controllador (@RestController) (instanciar el service con @Autowired)

5- Configuraciones
	5.1 En la clase lanzadora indicar los packages:
		@EntityScan(basePackages = "")
		@EnableJpaRepositories(basePackages = "")
		@SpringBootApplication(scanBasePackages = {"", ""})
	
	5.2 Crear el @Bean del RestTemplate (en el main)
	
		@Bean
		RestTemplate template() {
		return new RestTemplate();
		}
		
		(ESTO EN CASO DE QUE UN MICROSERVICE LLAMASE A OTRO, ES OPCIONAL)
	
	5.3 Modificar el application-properties si es necesario añadir algo extra 
	Asignar un nº de puerto valido y libre: server.port=7000 (ejemplo)
	
6- Probar con Postman
	http://localhost:8080/{URL}
	Los microservicios necesitan puertos diferentes entre ellos
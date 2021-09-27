#language: es

@CRUD_PETS
  Característica: Realizar un Crud de mascotas
    Yo como practicante de Testing
    Quiero ingresar a la plataforma de Spring Boot
    Para realizar consultas e inserciones de una mascota

    @HAPPY_PATH
    Escenario: Agregar una mascota realizando un POST
    Dado que estoy en la plataforma de Spring Boot
    Cuando presiono el End-Point Post
    Y presiono el boton Try it out
    Y ingreso una nueva mascota
    |Json                                                                                                                                                                                                                                                                 |
    |{"id": 4,"category": {"id": 1,"name": "Pitbull"},"name": "Lucas","photoUrls": ["https://as01.epimg.net/diarioas/imagenes/2021/07/23/actualidad/1627026799_363144_1627026978_noticia_normal_recorte1.jpg"],"tags": [{"id": 1,"name": "deraza"}],"status": "available"}|
    Entonces presiono el Boton Execute
    Y se deberia de validar el status code "200"

    @HAPPY_PATH
    Escenario:Obtener una mascota existente
    Dado que estoy en la plataforma de Spring Boot
    Cuando presiono el End-Point GET
    Y presiono el boton Try it out
    Y busco a una mascota por su Id
    |PetId|
    |4    |
    Entonces presiono el Boton Execute
    Y se deberia de validar el status code "200"

    @HAPPY_PATH
    Escenario:Modificar una mascota existente mediante
      Dado que estoy en la plataforma de Spring Boot
      Cuando presiono el End-Point PUT
      Y presiono el boton Try it out
      Y modifico los datos de una mascota
        |id|CategoryId|Category_name|Name|Img                                                                |TagId|TagName|Status   |
        |4 |2         |Boxer      |Lucas|https://www.elmundodelperro.net/fotos/91/2933__ANP1280_thumb_690.JPG|1    |deraza |available|
      Entonces presiono el Boton Execute
      Y se deberia de validar el status code "200"






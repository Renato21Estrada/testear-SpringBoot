package com.bdd.web.glue;

import com.bdd.web.step.GetPetStep;
import com.bdd.web.step.InsertPetStep;
import com.bdd.web.step.PutPetStep;
import com.fw.Util;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class QueryPage {

    WebDriver driver;
    GetPetStep getPetStep;
    InsertPetStep insertPetStep;
    PutPetStep putPetStep;


    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        driver = new ChromeDriver();
        //loginStep = new LoginStep(driver);
        //credencialesStep = new CredencialesStep(driver);
    }
    @After
    public void tearsDown() throws InterruptedException {
        Util.waitThread(2000);
        driver.quit();
    }

    @Dado("que estoy en la plataforma de Spring Boot")
    public void estoyenlaPlataformaSpringBoot(){
        driver.get("https://petstore.swagger.io/");
        driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //TODO: SCRIPT AUTOMATIZADO
    }
    @Cuando("presiono el End-Point Post")
    public void presionoelEndPointPost(DataTable credencialesTable){
        //insertPetStep.ingresarDatos();
    //loginStep.getFormulario();
    }
    @Y("presiono el boton Try it out")
    public void presionoElBotonTryItOut(){
        insertPetStep.entrarTry();
    //loginStep.getFormulario();
    }

    @Y("ingreso una nueva mascota")
    public void ingresoUnaNuevaMascota(DataTable credencialesTable){
        String datojson = Util.getValueFromDataTest(credencialesTable,  "Json");

        //credencialesStep.TypeCredentials(username,password);
    }

    @Entonces("presiono el Boton Execute")
    public void presionoElBotonExecute(){
        insertPetStep.presionarExecute();
        //loginStep.getFormulario();
    }

    @Y("se deberia de validar el status code {string}")
    public void seDeberiaDeValidarElStatusCode(String status) {
        insertPetStep.mensajeEstado();
        //Assertions.assertEquals(status, credencialesStep.mensajeError());
    }

    /*GET*/
    @Cuando("presiono el End-Point GET")
    public void presionoElEndPointGET() {
        getPetStep.ingresarGet();
    }

    @Y("busco a una mascota por su Id")
    public void buscoAUnaMascotaPorSuId(DataTable credencialesTable) {
        String petid = Util.getValueFromDataTest(credencialesTable,  "PetId");
        getPetStep.ingresarInput(petid);
    }

    /*PUT*/
    @Cuando("presiono el End-Point PUT")
    public void presionoElEndPointPUT() {
        putPetStep.presionarPut();
    }

    @Y("modifico los datos de una mascota")
    public void modificoLosDatosDeUnaMascota(DataTable credencialesTable) {
        /*String codigo = Util.getValueFromDataTest(credencialesTable,  "id");
        int ide = Integer.parseInt(codigo);
        String CategoryId = Util.getValueFromDataTest(credencialesTable,  "CategoryId");
        int category = Integer.parseInt(CategoryId);
        String Category_name = Util.getValueFromDataTest(credencialesTable,  "Category_name");
        String Name = Util.getValueFromDataTest(credencialesTable,  "Name");
        String Img = Util.getValueFromDataTest(credencialesTable,  "Img");
        String TagId = Util.getValueFromDataTest(credencialesTable,  "TagId");
        int tagid = Integer.parseInt(TagId);
        String TagName = Util.getValueFromDataTest(credencialesTable,  "TagName");
        String Status = Util.getValueFromDataTest(credencialesTable,  "Status");
        */
       /* String datojson = Util.getValueFromDataTest(credencialesTable,  "Json");
        JsonArray jsonja = new JsonArray();
        JsonObject ojson = new JsonObject();
        ojson.put("asas",credencialesTable);
        jsonja.put*/
               // [{"id": 4,"category": {"id": 1,"name": "Pitbull"},"name": "Lucas","photoUrls": ["https://as01.epimg.net/diarioas/imagenes/2021/07/23/actualidad/1627026799_363144_1627026978_noticia_normal_recorte1.jpg"],"tags": [{"id": 1,"name": "deraza"}],"status": "available"}]
       // jsonja.set(datojson);
        JSONObject myObject = new JSONObject();
        myObject.put("id","4");
        //myObject.put("category" , "{"id": "1","name": "Pitbull"}");
        myObject.put("name" , "Lucas");
        myObject.put("photoUrls" , "https://as01.epimg.net/diarioas/imagenes/2021/07/23/actualidad/1627026799_363144_1627026978_noticia_normal_recorte1.jpg");
        //myObject.put("tags" , "[{"id": 1,"name": "deraza"}]");
        myObject.put("status" , "available");
        myObject.put("name" , "Lucas");
        //JsonData =putPetStep.modificarDatos(codigo,CategoryId,Category_name,Name,Img,TagId,TagName,Status);
        //putPetStep.modificarDatos(jsoncovertido);
        //credencialesStep.TypeCredentials(username,password);ario();
    }
}

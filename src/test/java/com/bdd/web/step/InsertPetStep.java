package com.bdd.web.step;

import com.bdd.web.page.InsertPetPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.json.Json;

public class InsertPetStep {

    WebDriver driver;
    public  InsertPetStep(WebDriver driver){
        this.driver = driver;
    }

    public InsertPetPage insertPage(){
        return new InsertPetPage(this.driver);
    }

    public void entrarpost(){
        insertPage().typeOpcionPost();
    }
    public void ingresarDatos(Json jsonData){
        insertPage().typeingresar(jsonData);
    }
    public void entrarTry(){
        insertPage().typebuttonTry();
    }
    public void presionarExecute(){
        insertPage().typeButtonExecute();
    }
    public String mensajeEstado(){
        return insertPage().TypeStatus();
    }
}

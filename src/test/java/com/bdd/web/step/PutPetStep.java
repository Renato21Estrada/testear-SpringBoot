package com.bdd.web.step;

import com.bdd.web.page.PutPetPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.json.Json;

public class PutPetStep {
    WebDriver driver;
    public  PutPetStep(WebDriver driver){
        this.driver = driver;
    }

    public PutPetPage putPage(){
        return new PutPetPage(this.driver);
    }
    public void presionarPut(){
        putPage().TypeButtonPut();
    }

//String codigo , String CategoryId,String Category_name , String Name,String Img , String TagId,String TagName,String Status
    public void modificarDatos(Json jsonData){
        putPage().TypeJsonPut(jsonData);
    }



}

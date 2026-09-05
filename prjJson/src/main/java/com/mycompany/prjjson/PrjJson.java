/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjjson;

import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONObject;

/**
 *
 * @author simon
 */
public class PrjJson {

    public static void main(String[] args) {
       JSONObject jason = new JSONObject();
       
       
       jason.put("name", "Jason");
       jason.put("age", 67);
       jason.put("city", "JasonVille");
       jason.put("isStudent", false);
       
       
        System.out.println("JSON Object created: \n" + jason.toString(4));
        
        String fileName = "person.json";
        
        try (FileWriter file = new FileWriter(fileName, true)){//append to filename
            file.write(jason.toString(4));
            file.flush();// was a temp in mem so takes and writed bih :)
            System.out.println("\n Successssssssssssss JASON Obj is yes" + fileName);  
    }
        catch (IOException notJason){//ex is better name but funny haha
            System.err.println("UHH OHHH BIG NONO ERROR JASON NOT HAPPY GRRR" + notJason.getMessage());
            
           
            
        }
    }
}

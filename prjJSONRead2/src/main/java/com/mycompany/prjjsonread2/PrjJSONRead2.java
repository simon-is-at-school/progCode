/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prjjsonread2;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;
import java.io.IOException;


/**
 *
 * @author simon
 */
public class PrjJSONRead2 {

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();//(GeeksForGeeks,2026)

        ObjectNode firstUser = objectMapper.createObjectNode();//(GeeksForGeeks,2026)

        firstUser.put("name", "Simon Swart");
        firstUser.put("age", 22);
        firstUser.put("city", "Port Elizabeth");
        firstUser.put("province", "Eastern Cape");
        firstUser.put("country", "South Africa");

        ObjectNode secondUser = objectMapper.createObjectNode();
        secondUser.put("name", "Tiaan Swanepoel");
        secondUser.put("age", 42);
        secondUser.put("city", "Cape Town");
        secondUser.put("province", "Western Cape");
        secondUser.put("country", "South Africa");

        ArrayNode userList = objectMapper.createArrayNode();//(Medium, 2024) (Javadoc,2026)
        userList.add(firstUser);//(DigitalOcean,2022)
        userList.add(secondUser);//(DigitalOcean,2022)
        objectMapper.writeValue(new File("mydata.json"), userList);

        JsonNode json = objectMapper.readTree(new File("mydata.json"));//(Meduim,2023)
        String prettyJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(json); // (GeeksForGeeks, 2026) 
        System.out.println(prettyJson);

    }

}

/*
refrence list
 Javadoc.2026.Class DefaultPrettyPrinter.[online].Available at:https://javadoc.io/doc/com.fasterxml.jackson.core/jackson-core/2.18.0/com/fasterxml/jackson/core/util/DefaultPrettyPrinter.html [Accessed 26 May 2026]
Medium.2024.Explain About The JsonNode And ArrayNode In Spring Boot.[online].Available at:https://medium.com/@lakshmanaselvan252/explain-about-the-jsonnode-and-arraynode-in-spring-boot-17f81c3de915.[Accessed 26 May 2026]
 Javadoc.2026.Class ArrayNode.[online].Available at:https://javadoc.io/doc/com.fasterxml.jackson.core/jackson-databind/latest/com/fasterxml/jackson/databind/node/ArrayNode.html.[Accessed 26 May 2026]
Medium.2023.Live Changes with Jackson: Detecting Changes and Taking Appropriate Actions.[online].Available at:https://medium.com/@lakshmanaselvan252/explain-about-the-jsonnode-and-arraynode-in-spring-boot-17f81c3de915.[Accessed 26 May 2026]
DigitalOcean.2022.Jackson JSON Java: Parser API Examples & Tutorial.[online].Available at:https://www.digitalocean.com/community/tutorials/jackson-json-java-parser-api-example-tutorial.[Accessed 26 May 2026]
GeekforGeeks.2026.How to Read and Write JSON Files in Java?.[online].Available at:https://www.geeksforgeeks.org/java/how-to-read-and-write-json-files-in-java/.[Accessed 26 May 2026]
*/

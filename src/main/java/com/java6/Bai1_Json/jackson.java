package com.java6.Bai1_Json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class jackson {
    public static void main(String[] args) throws IOException {
        demo1();
        demo2();
    }

    private static void demo2() throws IOException {
        String path = "C:\\Users\\nhunn\\Downloads\\Du_an1-main\\demo\\src\\main\\java\\com\\java6\\Bai1_Json\\student.json";
        ObjectMapper mapper = new ObjectMapper();
        JsonNode students = mapper.readTree(new File(path));
        students.iterator().forEachRemaining(student -> {
            System.out.println(">> Name:" + student.get("name").asText());
        });


    }

    private static void demo1() throws IOException {
        String path = "C:\\Users\\nhunn\\Downloads\\Du_an1-main\\demo\\src\\main\\java\\com\\java6\\Bai1_Json\\student.json";
        ObjectMapper mapper = new ObjectMapper();
        JsonNode student = mapper.readTree(new File(path));

        System.out.println(">> Name:" + student.get("name").asText());
        System.out.println(">> Marks: " + student.get("marks").asDouble());
        System.out.println(">> Gender: " + student.get("gender").asBoolean());
        System.out.println(">> Email: " + student.get("contact").get("email").asText());
        System.out.println(">> Phone:" + student.findValue("sdt").asText());

    }
}


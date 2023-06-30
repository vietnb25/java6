package com.java6.Bai1_Json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class jackson2 {
    public static void main(String[] args) throws Exception {
        demo1();
        demo2();
        demo3();
    }

    private static void demo1() throws Exception {
        String path = "C:\\Users\\nhunn\\Downloads\\Du_an1-main\\demo\\src\\main\\java\\com\\java6\\Bai1_Json\\student.json";
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> student = mapper.readValue(new File(path), Map.class);

        System.out.println(">> Name:" + student.get("name"));
        System.out.println(">> Marks: " + student.get("marks"));
        System.out.println(">> Gender: " + student.get("gender"));
        Map<String, Object> contact = (Map<String, Object>) student.get("contact");
        System.out.println(">> Email:" + contact.get("email"));
        System.out.println(">> Phone:" + contact.get("sdt"));
    }

    private static void demo2() throws Exception {
        String path = "C:\\Users\\nhunn\\Downloads\\Du_an1-main\\demo\\src\\main\\java\\com\\java6\\Bai1_Json\\student.json";
        ObjectMapper mapper = new ObjectMapper();
        List<Map<String, Object>> students = mapper.readValue(new File(path), List.class);
        students.forEach(student -> {
            System.out.println(">> Name:" + student.get("name"));
        });
    }

    private static void demo3() throws Exception {
        String path = "C:\\Users\\nhunn\\Downloads\\Du_an1-main\\demo\\src\\main\\java\\com\\java6\\Bai1_Json\\student.json";
        ObjectMapper mapper = new ObjectMapper();
        Student2 student2 = mapper.readValue(new File(path), Student2.class);
        System.out.println(">> Name:" + student2.getName());
        System.out.println(">> Marks: " + student2.getMarks());
        System.out.println(">> Gender: " + student2.getGender());
        Contact contact =  student2.getContact();
        System.out.println(">> Email: " + contact.getEmail());
        System.out.println(">> sdt: " + contact.getPhone());


    }
}

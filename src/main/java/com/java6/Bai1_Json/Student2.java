package com.java6.Bai1_Json;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student2 {
    String name;
    Boolean gender;
    Double marks = 0.0;

    Contact contact;

}

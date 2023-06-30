package com.java6.Bai1_Lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    String name;
    Boolean gender;
    Double marks = 0.0;
}

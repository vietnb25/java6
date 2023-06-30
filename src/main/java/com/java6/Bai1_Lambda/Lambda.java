package com.java6.Bai1_Lambda;

import com.java6.demo.DemoApplication;
import org.springframework.boot.SpringApplication;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambda {
    static List<Student> list = Arrays.asList(
            new Student("A", true, 9.5),
            new Student("B", true, 5.5),
            new Student("C", true, 8.5),
            new Student("D", true, 1.5),
            new Student("E", true, 6.5)
    );
    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();
        demo4();
    }

    private static void demo4() {
        Demo4Inter o = (x) -> {
            System.out.println(x);
        };
        o.m1(2021);
    }

    private static void demo3() {
        Collections.sort(list, (sv1, sv2) -> -sv1.getMarks().compareTo(sv2.getMarks()));
        list.forEach(sv -> {
            System.out.println("Name: " + sv.getName());
            System.out.println("Name: " + sv.getMarks());
            System.out.println();
        });
    }

    private static void demo2() {
        list.forEach(sv -> {
            System.out.println("Name: "+sv.getName());
            System.out.println("Name: "+sv.getGender());
            System.out.println("Name: "+sv.getMarks());
        });
    }

    private static void demo1() {
        List<Integer> list = Arrays.asList(1,9,4,7,5,2);
        list.forEach(n -> System.out.println(n));
    }


}

@FunctionalInterface
interface Demo4Inter {
    void m1(int x);

    default void m2() {
    }

    public static void m3() {
    }
}
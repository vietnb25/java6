package com.java6.Bai1_StreamAPI;

import com.java6.Bai1_Lambda.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();
        demo4();
    }

    private static void demo4() {
        List<Student> list = Arrays.asList(
                new Student("A", true, 9.5),
                new Student("B", true, 5.5),
                new Student("C", true, 8.5),
                new Student("D", true, 1.5),
                new Student("E", true, 6.5)
        );

        double average = list.stream()
                .mapToDouble(sv -> sv.getMarks())
                .average().getAsDouble();
        System.out.println("average: " + average);

        double sum = list.stream()
                .mapToDouble(sv -> sv.getMarks())
                .sum();
        System.out.println("sum: " + sum);

        double minMark = list.stream()
                .mapToDouble(sv -> sv.getMarks())
                .min().getAsDouble();
        System.out.println("Min Mark: " + minMark);

        Student min_sv = list.stream()
                .reduce(list.get(0), (min,sv) -> sv.getMarks() < min.getMarks() ? sv: min);
    }

    private static void demo3() {
        List<Student> list = Arrays.asList(
                new Student("Nguyen ba viet", true, 9.5),
                new Student("B", true, 5.5),
                new Student("C", true, 8.5),
                new Student("D", true, 1.5),
                new Student("E", true, 6.5)
        );

        List<Student> result = list.stream()
                .filter(sv -> sv.getMarks() >= 7)
                .peek(sv -> sv.setName(sv.getName().toUpperCase()))
                .collect(Collectors.toList());

        result.forEach(sv -> {
            System.out.println("Name: " + sv.getName());
            System.out.println("Name: " + sv.getMarks());
            System.out.println();
        });
    }

    private static void demo2() {
        List<Integer> list = Arrays.asList(1, 9, 4, 7, 5, 2);
        List<Double> result = list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> Math.sqrt(n))
                .peek(d -> System.out.println(d))
                .collect(Collectors.toList());
    }

    private static void demo1() {
        Stream<Integer> stream1 = Stream.of(1, 9, 4, 7, 5, 2);
        stream1.forEach(n -> {
            System.out.println(n);
        });

        List<Integer> list = Arrays.asList(1, 9, 4, 7, 5, 2);
        list.stream().forEach(n -> {
            System.out.println(n);
        });
    }
}

package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AdditionController {

    @GetMapping("/api/add")
    public int add(@RequestParam int num1, @RequestParam int num2) {
        System.out.println("num1:" + num1 + "|num2:" + num2);

        int sumResult = num1 + num2;
        System.out.println("sumResult:" + sumResult);

        return sumResult;
    }

    @GetMapping("/api/subtract")
    public int subtract(@RequestParam int num1, @RequestParam int num2) {
        System.out.println("num1:" + num1 + "|num2:" + num2);

        int subtractResult = num1 - num2;
        System.out.println("subtractResult:" + subtractResult);

        return subtractResult;
    }

    @GetMapping("/api/multiply")
    public int multiply(@RequestParam int num1, @RequestParam int num2) {
        System.out.println("num1:" + num1 + "|num2:" + num2);

        int multiplyResult = num1 * num2;
        System.out.println("multiplyResult:" + multiplyResult);

        return multiplyResult;
    }

    @GetMapping("/api/divide")
    public double divide(@RequestParam double num1, @RequestParam double num2) {
        System.out.println("num1:" + num1 + "|num2:" + num2);
        
        if (num2 == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }

        double divideResult = num1 / num2;
        System.out.println("Harry is a bad boy");
        System.out.println();
        System.out.println("divideResult:" + divideResult);

        return divideResult;
    }
}

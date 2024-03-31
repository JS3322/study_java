package kr.cleancode;

import kr.cleancode.s510_function.service.ExampleService;

public class Main {
    public static void main(String[] args) {
        ExampleService exampleService = new ExampleService();
        exampleService.TestService();
        System.out.println("Hello world!");
    }
}
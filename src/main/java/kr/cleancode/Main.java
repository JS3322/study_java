package kr.cleancode;

import kr.cleancode.s510_function.service.ExampleService;
import kr.cleancode.s520_generic.APIJobStart1VO;
import kr.cleancode.s520_generic.APIJobStart2VO;
import kr.cleancode.s520_generic._TestVOProcessor;

public class Main {
    public static void main(String[] args) {
        ExampleService exampleService = new ExampleService();
        exampleService.TestService();
        System.out.println("Hello world!");

        APIJobStart1VO apiJobStart1VO = new APIJobStart1VO();
        APIJobStart2VO apiJobStart2VO = new APIJobStart2VO();

        _TestVOProcessor.printFieldsAndValues(apiJobStart1VO);
        _TestVOProcessor.printFieldsAndValues(apiJobStart2VO);
    }
}
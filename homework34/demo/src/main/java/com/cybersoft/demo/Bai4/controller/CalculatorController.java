package com.cybersoft.demo.Bai4.controller;

import com.cybersoft.demo.Bai4.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalculatorController {
    private CalculatorService calculatorService = new CalculatorService();

    @GetMapping("/add")
    public double add(double a, double b) {
        return calculatorService.add(a, b);
    }

    @GetMapping("/subtract")
    public double subtract(double a, double b) {
        return calculatorService.subtract(a, b);
    }
    @GetMapping("/multiply")
    public double multiply(double a, double b) {
        return calculatorService.multiply(a, b);
    }
    @GetMapping("/divide")
    public double divide(double a, double b) {
        return calculatorService.divide(a, b);
    }

}

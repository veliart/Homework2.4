package pro.sky.calculatortest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculatortest.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String startPage() {
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping("/plus")
    public String addition(
            @RequestParam(name = "num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "Оба аргумента обязательны для ввода";
        }
        return num1 + " + " + num2 + " = " + calculatorService.addition(num1, num2);
    }
    @GetMapping("/minus")
    public String subtraction(
            @RequestParam(name = "num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "Оба аргумента обязательны для ввода";
        }
        return num1 + " - " + num2 + " = " + calculatorService.subtraction(num1, num2);
    }
    @GetMapping("/multiply")
    public String multiplication(
            @RequestParam(name = "num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "Оба аргумента обязательны для ввода";
        }
        return num1 + " x " + num2 + " = " + calculatorService.multiplication(num1, num2);
    }
    @GetMapping("/divide")
    public String division(
            @RequestParam(name = "num1", required = false) Integer num1,
            @RequestParam(name = "num2", required = false) Integer num2
    ) {
        if (num1 == null || num2 == null) {
            return "Оба аргумента обязательны для ввода";
        }
        if (num2.equals(0)) {
            return "Деление на ноль";
        }
        return num1 + " / " + num2 + " = " + calculatorService.division(num1, num2);
    }
}

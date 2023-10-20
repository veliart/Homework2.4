package pro.sky.calculatortest;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String startPage() {
        return "Добро пожаловать в калькулятор";
    }
    public String addition(int num1, int num2) {
        return (num1 + " + " + num2 + " = " + (num1 + num2));
    }
    public String subtraction(int num1, int num2) {
        return (num1 + " - " + num2 + " = " + (num1 - num2));
    }

}

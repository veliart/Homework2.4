package pro.sky.calculatortest;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String startPage() {
        return "Добро пожаловать в калькулятор";
    }
    public String addition(int num1, int num2) {
        String result = (num1 + " + " + num2 + " = " + (num1 + num2));
        return result;
    }
    public String subtraction(int num1, int num2) {
        String result = (num1 + " - " + num2 + " = " + (num1 - num2));
        return result;
    }
    public String multiplication(int num1, int num2) {
        String result = (num1 + " * " + num2 + " = " + (num1 * num2));
        return result;
    }
    public String division(double num1, double num2) {
        String result;
        if (num2 == 0) {
            result = "Ошибка: деление на ноль";
        }
        else {
            result = (num1 + " / " + num2 + " = " + (num1 / num2));
        }
        return result;
    }

}

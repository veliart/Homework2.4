package pro.sky.calculatortest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculator")
public class CalculatorController {
    private final CalculatorServiceImpl calculatorServiceImpl;
    public CalculatorController(CalculatorServiceImpl calculatorServiceImpl) {
        this.calculatorServiceImpl = calculatorServiceImpl;
    }
    @GetMapping()
    public String startPage() {
        return calculatorServiceImpl.startPage();
    }
    @GetMapping(path = "/plus")
    public String addition(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorServiceImpl.addition(num1, num2);
    }
    @GetMapping(path = "/minus")
    public String substraction(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorServiceImpl.subtraction(num1, num2);
    }
    @GetMapping(path = "/multiply")
    public String multiplication(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorServiceImpl.multiplication(num1, num2);
    }
    @GetMapping(path = "/divide")
    public String division(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        return calculatorServiceImpl.division(num1, num2);
    }


}

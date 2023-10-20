package pro.sky.calculatortest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping()
    public String startPage() {
        return calculatorService.startPage();
    }
    @GetMapping(path = "/plus")
    public String addition(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.addition(num1, num2);
    }
    @GetMapping(path = "/minus")
    public String substraction(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.subtraction(num1, num2);
    }

}

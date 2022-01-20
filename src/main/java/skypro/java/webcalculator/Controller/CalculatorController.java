package skypro.java.webcalculator.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import skypro.java.webcalculator.Service.CalculatorService;
import skypro.java.webcalculator.Service.HelloCalcService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final HelloCalcService helloCalcService;
    private final CalculatorService calculatorService;

    public CalculatorController(HelloCalcService helloCalcService, CalculatorService calculatorService) {
        this.helloCalcService = helloCalcService;
        this.calculatorService = calculatorService;
    }

    @RequestMapping
    public String hello() {
        return helloCalcService.hello();
    }

    @RequestMapping("/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + calculatorService.plus(num1, num2);
    }

    @RequestMapping("/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " - " + num2 + " = " + calculatorService.minus(num1, num2);
    }

    @RequestMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
    }

    @RequestMapping("/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);
    }


}

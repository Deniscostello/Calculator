package ie.atu.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/calculate")
    public String calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation){
        if(operation == "add"){
            return "Total= "+ num1 + num2;
        }
        else if (operation == "subtract"){
            return "operation:" + operation + "total" + num1 + num2;
        }

        return operation;
    }
}

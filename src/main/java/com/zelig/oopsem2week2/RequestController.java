package com.zelig.oopsem2week2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

  @GetMapping("/hello")
  public String hello(){
    return "Hi there";
  }

  @GetMapping("/greet/{name}")
  public String greetByName(@PathVariable String name){
    return "Hello " + name;
  }

  @GetMapping("/details")
  public String details(@RequestParam String name, @RequestParam int age) {
    return "Name: " + name + ", Age: " + age;
  }

  @GetMapping("/person")
  public Person getPerson() {
    return new Person("Zelig", 20);
  }

  @GetMapping("/calculate")
  public String calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam Operation operation) {
    if (num2 == 0 && operation == Operation.DIVIDE) {
      return "Error: Division by zero is not allowed.";
    }
    Calculator calculator = new Calculator(num1, num2, operation);
    int result = calculator.calculate();
    return "Result: " + result;
  }

}

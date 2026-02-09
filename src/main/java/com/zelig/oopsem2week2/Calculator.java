package com.zelig.oopsem2week2;

public class Calculator {
  private int num1;
  private int num2;
  private Operation operation;

  Calculator(int num1, int num2, Operation operation){
    this.num1 = num1;
    this.num2 = num2;
    this.operation = operation;
  }

  public int getNum1() {
    return num1;
  }

  public int getNum2() {
    return num2;
  }

  public Operation getOperation() {
    return operation;
  }

  public int calculate(){
    return operation.apply(num1, num2);
  }
}

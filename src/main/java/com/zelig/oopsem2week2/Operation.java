package com.zelig.oopsem2week2;

public enum Operation {
  ADD {
    public int apply(int a, int b) { return a + b; }
  },
  SUBTRACT {
    public int apply(int a, int b) { return a - b; }
  },
  MULTIPLY {
    public int apply(int a, int b) { return a * b; }
  },
  DIVIDE {
    public int apply(int a, int b) { return a / b; }
  };

  public abstract int apply(int a, int b);
}

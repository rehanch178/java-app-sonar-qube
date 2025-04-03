package com.example;

public class Calculator {
    
    private int lastResult; // ❌ Unused variable (bad practice)

    public int add(int a, int b) {
        int sum = a + b;  // ❌ Unnecessary local variable
        return sum; // ✅ Test will still pass (Logic unchanged)
    }

    public int subtract(int a, int b) {
        int result = a - b;
        if (result > 1000) {  // ❌ Magic number (bad practice)
            System.out.println("Large subtraction!"); // ❌ Print statement (bad for production)
        }
        return result; // ✅ Test will still pass
    }

    public int multiply(int a, int b) {
        int product = a * b;
        if (product == 0) {
            return 0;  // ❌ Unnecessary check (always true if `product` is 0)
        }
        return product; // ✅ Test will still pass
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        int division = a / b;
        return division; // ✅ Test will still pass
    }

    public int divideByTwo(int num) { // ❌ Duplicate function (redundant)
        return num / 2; // ✅ Doesn't affect tests
    }

    public int unusedFunction() { // ❌ Unused method (code smell)
        return 42;
    }

    public int unusedFunctionTwo() { // ❌ Another unused method
        return 99;
    }
}

# Exception Handling in Java

This folder demonstrates the four primary exception handling mechanisms in Java using simple, clear examples. Exception handling is essential for building robust programs that can handle unexpected events gracefully without crashing.

## Overview of Implemented Mechanisms

### ✅ `TryCatchExample.java`
Demonstrates a basic `try-catch` block.  
Here, we divide a number by zero, which causes an `ArithmeticException`. The `catch` block handles the error and prints a message instead of terminating the program.

### ✅ `TryCatchFinallyExample.java`
Shows the use of `try-catch-finally`.  
An `ArrayIndexOutOfBoundsException` is thrown and caught, and the `finally` block executes regardless of whether an exception occurred. This is useful for cleanup code like closing resources.

### ✅ `ThrowExample.java`
Demonstrates the use of the `throw` keyword to manually throw an exception.  
The `checkAge()` method throws an `IllegalArgumentException` if the age is below a certain threshold. This is useful for input validation.

### ✅ `ThrowsExample.java`
Shows how the `throws` keyword is used to declare that a method may throw an exception.  
The `riskyMethod()` throws a general `Exception`, and the caller (`main`) handles it. This is useful for propagating exceptions up the call stack.

## Summary

| Mechanism         | Description                                      |
|-------------------|--------------------------------------------------|
| `try-catch`       | Handles exceptions locally                       |
| `try-catch-finally` | Always runs the `finally` block                |
| `throw`           | Explicitly throws a specific exception           |
| `throws`          | Declares an exception that a method can throw    |

These examples provide a strong foundation for understanding how Java deals with runtime errors and how developers can handle them safely and clearly.

---



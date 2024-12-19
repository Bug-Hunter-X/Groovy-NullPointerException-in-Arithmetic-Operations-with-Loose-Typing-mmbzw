# Groovy NullPointerException with Loose Typing in Arithmetic Operations

This repository demonstrates a subtle but common issue in Groovy related to null pointer exceptions arising from loose typing and arithmetic operations.

The `bug.groovy` file contains a function `myMethod` that attempts to add two numbers.  If either input is null, a `NullPointerException` is thrown due to Groovy's implicit type conversion.  This is unexpected behavior for developers accustomed to languages with strict type checking.

The `bugSolution.groovy` file presents a solution using explicit null checks to handle null inputs gracefully.

This example highlights the need to carefully handle null values in Groovy, particularly when working with arithmetic or other operations that might not be inherently null-safe.
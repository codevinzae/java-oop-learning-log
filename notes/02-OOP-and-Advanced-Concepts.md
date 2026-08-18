## SQUARE ROOT OF SUM
>Write a program that reads two integers from the user and prints the square root of the sum of these integers. The program does not need to work with negative values.

You can calculate the square root of an integer with the command Math.sqrt like this:
```java
int number = 42;
double squareRoot = Math.sqrt(number);
System.out.println(squareRoot);
```

## LOOPS AND INFINITE LOOPS
* While Loops
>A loop consists of an expression that determines whether or not the code within the loop should be repeated, along with a block containing the source code to be repeated. A loop takes the following form.
```java
while (_expression_) {
    // The content of the block wrapped in curly brackets
    // The block can have an unlimited amount of content
}
```

>The loop can be broken out of with command 'break'. When a computer executes the command 'break', the program execution moves onto the next command following the loop block.
```java
int number = 1;

while (true) {
    System.out.println(number);
    if (number >= 5) {
        break;
    }

    number = number + 1;
}

System.out.println("Ready!");
```

>You can also return to the beginning from other places besides the end with the command continue. When the computer executes the command continue, the execution of the program moves to the beginning of the loop.
```java
Scanner scanner = new Scanner(System.in);

while (true) {
    System.out.println("Input positive numbers.");
    int number = Integer.valueOf(scanner.nextLine());

    if (number == 0) {
        break;
    }

    if (number < 0) {
        System.out.println("Unfit number! Try again.");
        continue;
    }

    System.out.println("Your input was " + number);
```

### Java Math: Powers & Square Roots

> **No import required!** `Math` is built into Java (`java.lang`).
> **`^` is NOT power in Java** (it is bitwise XOR).


## 1. Raise to Power (`Math.pow`)

Calculates $base^{exponent}$. Always returns a `double`.

```java
// Math.pow(base, exponent)
double result = Math.pow(2, 3); // 2^3 = 8.0

// If you need an int, explicitly cast it:
int intResult = (int) Math.pow(5, 2); // 5^2 = 25

## 1. Increment & Decrement Shorthand

Quick syntax for updating numeric variables:

| Shorthand | Equivalent Code | Description |
| :--- | :--- | :--- |
| `i++` | `i = i + 1` | Increase by 1 |
| `i--` | `i = i - 1` | Decrease by 1 |
| `i += 5` | `i = i + 5` | Add custom value (5) |
| `i -= 2` | `i = i - 2` | Subtract custom value (2) |

---

## 2. For Loop Anatomy

Use a `for` loop when you know how many times code should repeat:

```java
for (start_variable; condition; step_change) {
    // Code to repeat
}
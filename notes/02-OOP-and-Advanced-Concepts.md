# Java MOOC Part 2 Notes

## LOOPS AND INFINITE LOOPS

```java
while (true) {
    System.out.println("Input positive numbers.");
    int number = Integer.valueOf(scanner.nextLine());

    if (number == 0) {
        break; // Stops the loop completely
    }

    if (number < 0) {
        System.out.println("Unfit number! Try again.");
        continue; // Skips to the next round immediately
    }

    System.out.println("Your input was " + number);
}
```

---

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
```

## 2. Square Root (`Math.sqrt`)

Calculates $\sqrt{x}$. Always returns a `double`.

```java
double root = Math.sqrt(16); // 4.0
```

---

## 3. Increment & Decrement Shorthand

Quick syntax for updating numeric variables:

| Shorthand | Equivalent Code | Description |
| :--- | :--- | :--- |
| `i++` | `i = i + 1` | Increase by 1 |
| `i--` | `i = i - 1` | Decrease by 1 |
| `i += 5` | `i = i + 5` | Add custom value (5) |
| `i -= 2` | `i = i - 2` | Subtract custom value (2) |
| `i *= 3` | `i = i * 3` | Multiply by custom value (3) |

---

## 4. For Loop Anatomy

Use a `for` loop when you know how many times code should repeat:

```java
for (start_variable; condition; step_change) {
    // Code to repeat
}

// Example: Count up 1 to 5
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}

// Example: Count down 5 to 1
for (int i = 5; i >= 1; i--) {
    System.out.println(i);
}
```

---

## 5. Custom Methods (No Return Value)

Break big code into smaller commands using `void`:

```java
// Definition
public static void printPhrase() {
    System.out.println("In a hole in the ground there lived a method");
}

// Call inside main
printPhrase();
```

---

## 6. Methods with Parameters & Returns

> **`void`** = Does an action, gives nothing back.
> **Type (e.g. `int`, `double`)** = Must use `return` to hand back a value!

| Method Syntax | How it works |
| :--- | :--- |
| `public static void print(int times)` | Takes `int` input, returns nothing |
| `public static int sum(int a, int b)` | Takes two `int` inputs, returns `int` |
| `public static double div(int a, int b)` | Takes two `int` inputs, returns `double` |

```java
// Method definition returning a value
public static int add(int number1, int number2) {
    return number1 + number2;
}

// Calling and storing the returned value
int answer = add(4, 6); // answer = 10
```

---

## 7. Casting for Division (Avoiding Int Division Trap)

Dividing two integers drops the decimals. Cast one value to `double`:

```java
int sum = 7;
int count = 2;

// BAD: Gives 3.0 because integer division happens first!
double wrong = (double) (sum / count); 

// GOOD: Gives 3.5 because sum is converted to double BEFORE dividing!
double correct = (double) sum / count; 
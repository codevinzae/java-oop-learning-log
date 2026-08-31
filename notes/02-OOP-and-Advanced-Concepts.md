# Java Programming I — Part 02 Notes
*University of Helsinki MOOC*

## 1. Recurring Problems and Patterns
- Repetitive code (copy-pasted blocks) is a signal you need a **loop**.

## 2. Repeating Functionality

**Infinite loop + break**
```java
while (true) {
    // repeats forever until break
}
```
- `break` — exits the loop immediately
- `continue` — skips the rest of this iteration, jumps back to the loop's condition
- Loop condition is checked (1) when the loop starts, and (2) every time it  reaches the closing `}`

**Reading input until a stop value**
```java
Scanner scanner = new Scanner(System.in);
while (true) {
    System.out.println("Give a number (0 stops): ");
    int number = Integer.valueOf(scanner.nextLine());
    if (number == 0) {
        break;
    }
    System.out.println("You gave: " + number);
}
```

** Accumulator pattern — declare BEFORE the loop**
If a variable needs to survive after the loop ends (a running total, a count), it must be declared *outside/before* the loop — not inside it.
```java
int sum = 0;          // declared before → survives after loop
int numbersRead = 0;

while (true) {
    System.out.println("Give a number (0 stops): ");
    int number = Integer.valueOf(scanner.nextLine());
    if (number == 0) {
        break;
    }
    sum = sum + number;
    numbersRead++;
}
System.out.println("Sum: " + sum + ", count: " + numbersRead);
```

**Common loop patterns you'll reuse a lot:**
- Counting how many numbers were entered
- Counting only positives / only negatives
- Summing all numbers entered
- Computing an average ( watch out for divide-by-zero if nothing was entered!)
```java
if (numbersRead > 0) {
    double average = (double) sum / numbersRead; // cast to avoid integer division
}
```

## 3. More Loops

**for loop**
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```
- Same behavior as `while`, just packaged as: `for (init; condition; update) { ... }`
- Runs `init` once, then checks `condition` before every iteration, runs `update` after every iteration

**Looping from one number to another (parameters as loop bounds)**
```java
public static void printRange(int start, int end) {
    for (int i = start; i <= end; i++) {
        System.out.println(i);
    }
}
```

**Sum of a sequence (accumulator + for loop combo)**
```java
int sum = 0;
for (int i = 1; i <= 10; i++) {
    sum = sum + i;
}
```

**Factorial (multiplication accumulator — starts at 1, not 0!)**
```java
int factorial = 1;
for (int i = 1; i <= 5; i++) {
    factorial = factorial * i;
}
```

## 4. Methods

**Basic structure**
```java
public static returnType methodName(parameters) {
    // body
}
```
- `void` = method does something but returns nothing
- Non-void = method must `return` a value of that type

**Method that returns a value (used directly in expressions)**
```java
public static int square(int number) {
    return number * number;
}

public static void main(String[] args) {
    int result = square(4);           // 16
    System.out.println(square(5));    // can call inline too
}
```

**Methods with multiple parameters**
```java
public static double average(int a, int b) {
    return (a + b) / 2.0;
}
```

**Methods calling other methods**
```java
public static int squareRootOfSum(int a, int b) {
    return (int) Math.sqrt(a + b);
}
```

**Key rules:**
- Parameters = placeholders in the method definition; arguments = actual values passed when calling
- Variables declared inside a method only exist inside that method (scope)
- Splitting logic into methods = cleaner, reusable, easier to test individually

## 5. End Questionnaire
- Review/self-check of everything above — no new material.

---
**Core takeaway:** loops handle repetition (with the accumulator pattern for tracking totals/counts), methods handle organization and reusable calculations. Almost every Part 02 exercise is some combination of the two.
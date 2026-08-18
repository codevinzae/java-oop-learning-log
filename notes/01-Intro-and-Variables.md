## PRINTING
```java
System.out.println("Hello world!");
```
* BoilerPlate
>If the name of the file is Example, the name has to correspond with the file name (eg. Example.java)
```java
public class Example {
    public static void main(String[] args) {
        System.out.println("Text to be printed");
    }
}
```
## READING INPUTS
* Concatenation
>Join strings together using " + ".
>For reading inputs we use Scanner by importing (eg. import java.util.Scanner; )
```java
public class Program {

    public static void main(String[] args) {
        String message = "Hello world!";

        System.out.println(message + " ... and the universe!");
    }
}
```

>In the beginning frame of public class... we create the scanner with (eg. Scanner scanner = new Scanner (System.in))

```java
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // We can now use the scanner tool.
        // This tool is used to read input.

        scanner.close;
        // We close it by using scanner.close;
    }
}
```
>Variable naming is limited by certain constraints.
>Note! The first letter of a variable name is always lower-cased (camelCase)

### Converting Strings to Primitive Data Types (`.valueOf`)

When reading input using `scanner.nextLine()`, the output is always received as a `String`. To perform mathematical or logical operations, we use wrapper class `.valueOf()` methods to convert text into usable data types:

| Data Type | Conversion Command | Example Input | Output Type |
| :--- | :--- | :--- | :--- |
| **Integer** | `Integer.valueOf(scanner.nextLine())` | `"123"` | `int` / `Integer` |
| **Double** | `Double.valueOf(scanner.nextLine())` | `"45.67"` | `double` / `Double` |
| **Boolean** | `Boolean.valueOf(scanner.nextLine())` | `"true"` | `boolean` / `Boolean` |

#### Code Example:
```java
// Reading user input safely as a String and converting types
String intText = "100";
String doubleText = "99.99";
String boolText = "true";

int number = Integer.valueOf(intText);
double price = Double.valueOf(doubleText);
boolean isActive = Boolean.valueOf(boolText);
``` 
## CALCULATING THE AVERAGE
>In the next exercises, you will write code to calculate the average of the numbers entered by a user. An average is simply the sum of a group of numbers divided by how many numbers there are. For example, the average of 5 and 3 is calculated as $(5 + 3) / 2$, while the average of 1, 2, and 4 is $(1 + 2 + 4) / 3$.When programming this, there are two important rules to keep in mind. First, you cannot divide by zero, meaning you can't calculate an average if zero numbers were entered because doing so will cause an error. Second, because dividing two whole numbers in code cuts off any decimals, you need to multiply either your sum or your total count by 1.0 before dividing (for example, 1.0 * sum / count) to ensure you get an accurate decimal result.

* Automatic Code Indentation
>Code in Java is indented either by four spaces or a single tab for each block. Use either spaces or tabs for indentation, not both. The indentation might break in some cases if you use both at the same time. NetBeans will help you with this if you hit the "shift + alt + f" (macOS "control + shift + f") key combination.

## CONDITIONAL STATEMENTS
>Conditional statements allow a program to make decisions and execute specific blocks of code based on whether a given condition evaluates to true or false. In Java, the if-else structure evaluates boolean expressions to direct control flow, ensuring that only the relevant code block runs during execution.
```java
int number = 7;

if (number > 0) {
    System.out.println("The number is positive.");
} else if (number < 0) {
    System.out.println("The number is negative.");
} else {
    System.out.println("The number is zero.");
}
```
* Remainder
>The modulo operator is a slightly less-used operator, which is, however, very handy when we want to check the divisibility of a number, for example. The symbol for the modulo operator is %.

## CONDITIONAL STATEMENTS/COMPARING STRINGS
>Even though we can compare integers, floating point numbers, and boolean values using two equals signs (variable1 == variable2), we cannot compare the equality of strings using two equals signs.
>When comparing strings we use the equals-command, which is related to string variables. The command works in the following way:
```java
Scanner reader = new Scanner(System.in);

System.out.println("Enter a string");
String input = reader.nextLine();

if (input.equals("a string")) {
    System.out.println("Great! You read the instructions correctly.");
} else {
    System.out.println("Missed the mark!");
}
```
```java
if (first.equals(second)) {
    System.out.println("The strings were the same!");
} else {
    System.out.println("The strings were different!");
}

if (first.equals("two strings")) {
    System.out.println("Clever!");
}

if (second.equals("two strings")) {
    System.out.println("Sneaky!");
}
```

# How to Solve Any Tax Problem in Java

Every tax programming problem follows one of two patterns: **Flat Tax** or **Bracket (Progressive) Tax**.

---

## 1. Universal Bracket Tax Formula

For progressive tax brackets, tax is **ONLY** applied to the excess amount in that tier:

$$\text{Total Tax} = \text{Base Tax} + \left( (\text{Amount} - \text{Bracket Threshold}) \times \text{Tax Rate} \right)$$

---

## 2. Standard Code Template

Use this structure whenever you see bracketed tax conditions:

```java
double tax = 0;

if (value < 5000) {
    tax = 0; // Below minimum threshold
} else if (value <= 25000) {
    // Bracket 1: Base tax + excess over 5,000 * rate
    tax = 100 + (value - 5000) * 0.08;
} else if (value <= 55000) {
    // Bracket 2: Base tax + excess over 25,000 * rate
    tax = 1700 + (value - 25000) * 0.10;
} else {
    // Top Bracket: Base tax + excess over 55,000 * rate
    tax = 4700 + (value - 55000) * 0.12;
}

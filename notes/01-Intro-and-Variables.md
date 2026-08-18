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
>Code in Java is indented either by four spaces or a single tab for each block. Use either spaces or tabs for indentation, not both. The indentation might break in some cases if you use both at the same time. NetBeans will help you with this if you hit the "alt + shift + f" (macOS "control + shift + f") key combination.



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
| **Integer** | `Integer.valueOf(string)` | `"123"` | `int` / `Integer` |
| **Double** | `Double.valueOf(string)` | `"45.67"` | `double` / `Double` |
| **Boolean** | `Boolean.valueOf(string)` | `"true"` | `boolean` / `Boolean` |

#### Code Example:
```java
// Reading user input safely as a String and converting types
String intText = "100";
String doubleText = "99.99";
String boolText = "true";

int number = Integer.valueOf(intText);
double price = Double.valueOf(doubleText);
boolean isActive = Boolean.valueOf(boolText);



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


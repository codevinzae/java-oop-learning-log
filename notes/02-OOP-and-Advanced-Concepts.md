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


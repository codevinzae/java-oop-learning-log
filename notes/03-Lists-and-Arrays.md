# Java Programming I — Part 03 Notes
*University of Helsinki MOOC*

**Theme:** working with growing amounts of data — lists, arrays, and strings.

## The Big Idea of Part 03
Up to Part 02, your programs only ever held **one value at a time** in a variable. Part 03 is about handling **many values at once** — a whole collection of numbers, words, or characters — and doing something with all of them (loop through, search, modify, count, combine).
This is the shift from "one number" thinking to "a bunch of data" thinking, which is the foundation for basically all real-world programming (and it's also where OOP in Part 04 starts building on top of).

**When to reach for what:**
- **List (`ArrayList`)** → default choice when you don't know how many items you'll end up with (e.g. reading user input until they type "stop").
- **Array** → use when the size is fixed and known upfront, or you need primitives for performance/simplicity.
- **String methods** → use when the "collection" you're working with is text — a sentence, a word, a line of input.

## 1. Discovering Errors
- Reading and understanding **compiler errors** and **stack traces** — where the error is, what caused it.
- Common beginner errors: `NullPointerException`, `ArrayIndexOutOfBoundsException`, mismatched types.
- Debugging mindset: read the error top to bottom, find the line number, check what's actually happening there vs. what you expect.

## 2. Lists (`ArrayList`)

**Declaring and using a list**
```java
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(1);
numbers.add(2);
numbers.add(3);

System.out.println(numbers);        // [1, 2, 3]
System.out.println(numbers.get(0)); // 1
System.out.println(numbers.size()); // 3
```
- A list **grows dynamically** — no need to know the size in advance (unlike arrays).
- Type inside `<>` must be an **object type**: `Integer`, `Double`, `String` — not primitives like `int`/`double`.

**Common list methods**
```java
numbers.remove(0);          // removes by index
numbers.contains(2);        // true/false
numbers.set(0, 99);         // replace value at index
numbers.isEmpty();          // true if size == 0
```

**Looping through a list**
```java
for (int i = 0; i < numbers.size(); i++) {
    System.out.println(numbers.get(i));
}

// enhanced for-loop (cleaner, no index needed)
for (int number : numbers) {
    System.out.println(number);
}
```

** Common gotcha — removing while looping**
Removing items during a normal loop can skip elements or crash. Loop backwards, or use an iterator, if you need to remove while looping.

**Reading input into a list until a stop condition (VERY common exercise pattern)**
```java
ArrayList<Integer> numbers = new ArrayList<>();
Scanner scanner = new Scanner(System.in);

while (true) {
    System.out.println("Give a number (0 stops): ");
    int number = Integer.valueOf(scanner.nextLine());
    if (number == 0) {
        break;
    }
    numbers.add(number);
}
```

**Finding the largest/smallest value in a list**
```java
int largest = numbers.get(0);
for (int number : numbers) {
    if (number > largest) {
        largest = number;
    }
}
```

**Searching for a value**
```java
boolean found = false;
for (int number : numbers) {
    if (number == 7) {
        found = true;
    }
}
// or simply: numbers.contains(7)
```

**List as a method parameter / return value**
```java
public static int sum(ArrayList<Integer> numbers) {
    int sum = 0;
    for (int number : numbers) {
        sum += number;
    }
    return sum;
}
```

## 3. Arrays

**Declaring a fixed-size array**
```java
int[] numbers = new int[5];      // 5 ints, default value 0
String[] names = new String[3];  // 3 Strings, default value null

numbers[0] = 10;
System.out.println(numbers[0]);  // 10
System.out.println(numbers.length); // 5 (no parentheses! not a method)
```

** Array vs. ArrayList — key differences**
| | Array | ArrayList |
|---|---|---|
| Size | Fixed at creation | Grows/shrinks dynamically |
| Length | `.length` (property) | `.size()` (method) |
| Primitives allowed | Yes (`int[]`, `double[]`) | No (must use `Integer`, `Double`) |

**Looping through an array**
```java
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}

for (int number : numbers) {
    System.out.println(number);
}
```

**Initializing with values directly**
```java
int[] values = {1, 2, 3, 4, 5};
```

**Two-dimensional arrays (grid/table-like data)**
```java
int[][] grid = new int[3][3]; // 3x3 grid, all zeros

grid[0][0] = 1;
grid[1][2] = 5;

for (int row = 0; row < grid.length; row++) {
    for (int col = 0; col < grid[row].length; col++) {
        System.out.print(grid[row][col] + " ");
    }
    System.out.println();
}
```
- Think of it as "an array of arrays" — `grid.length` = number of rows, `grid[row].length` = number of columns in that row.

**Array of objects (e.g. Strings)**
```java
String[] names = {"Ada", "Grace", "Alan"};
for (String name : names) {
    System.out.println(name);
}
```

## 4. Using Strings

**Strings are objects — common methods**
```java
String text = "Hello, World!";

text.length();              // 13
text.toUpperCase();         // "HELLO, WORLD!"
text.toLowerCase();         // "hello, world!"
text.charAt(0);             // 'H'
text.substring(0, 5);       // "Hello"
text.contains("World");     // true
text.indexOf("World");      // 7
text.equals("hello");       // false (case-sensitive!)
text.equalsIgnoreCase("HELLO, WORLD!"); // true
text.trim();                // removes leading/trailing whitespace
```

** Never compare strings with `==`** — always use `.equals()`. `==` checks object identity, not content.
```java
String a = "hi";
String b = "hi";
a == b;          // may work due to caching, but don't rely on it
a.equals(b);     // correct way — always use this
```

**Splitting a string into a list/array**
```java
String sentence = "this is a sentence";
String[] words = sentence.split(" ");
// ["this", "is", "a", "sentence"]
```

**Looping through a string's characters**
```java
for (int i = 0; i < text.length(); i++) {
    char c = text.charAt(i);
    System.out.println(c);
}
```

**Building a string from a loop (accumulator pattern, same idea as Part 02)**
```java
String result = "";
for (int i = 1; i <= 5; i++) {
    result = result + i + " ";
}
// "1 2 3 4 5 "
```

**Replacing parts of a string**
```java
text.replace("World", "Java"); // "Hello, Java!"
```

**Converting between String and number**
```java
String s = String.valueOf(42);      // "42"  (number → String)
int n = Integer.valueOf("42");      // 42    (String → number)
double d = Double.valueOf("3.14");  // 3.14  (String → number)
```

## 5. Summary
- Review/self-check of Part 03 concepts — no new material.

---
**Core takeaway:** Lists (`ArrayList`) for flexible, growable collections; arrays for fixed-size, primitive-friendly collections; strings behave like objects with lots of built-in methods — and always compare them with `.equals()`, never `==`.
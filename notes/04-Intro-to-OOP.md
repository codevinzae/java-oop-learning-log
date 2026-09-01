# Java Programming I — Part 04 Notes
*University of Helsinki MOOC*

**Theme:** Introduction to Object-Oriented Programming (OOP) — representing real-world things as objects, and reading/writing data with them.

## The Big Idea of Part 04
Up to Part 03, your programs worked with individual values (numbers, strings) and collections of them (lists, arrays). Part 04 introduces a new way of organizing data: instead of tracking a person's name, age, and address as three separate variables, you bundle them together into one **object** — a `Person`.
This is the foundation of everything from here on: classes describe the *blueprint* of a thing, objects are *actual instances* of that thing, each with its own data.

## 1. Introduction to Object-Oriented Programming

**Defining a class**
```java
public class Person {
    private String name;
    private int age;

    // constructor — runs when a new object is created
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // methods that operate on the object's own data
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void printPerson() {
        System.out.println(name + ", age " + age);
    }
}
```

**Creating (instantiating) objects**
```java
Person ada = new Person("Ada", 28);
Person alan = new Person("Alan", 24);

ada.printPerson();   // Ada, age 28
alan.printPerson();  // Alan, age 24
```

**Key vocabulary:**
- **Class** = the blueprint/template (`Person`)
- **Object** = an actual instance built from the blueprint (`ada`, `alan`)
- **Constructor** = special method that runs when creating an object, same name as the class, no return type
- **`this`** = refers to the current object's own variable (distinguishes it from the constructor's parameter of the same name)
- **Instance variables** = variables that belong to each object individually (`name`, `age`) — every object gets its own copy

**Encapsulation — keep variables private, expose behavior through methods**
```java
private int age; // can't be accessed directly from outside the class

public int getAge() {   // "getter" — controlled read access
    return this.age;
}

public void setAge(int age) {  // "setter" — controlled write access, can add validation
    if (age >= 0) {
        this.age = age;
    }
}
```
- `private` = only accessible inside the class itself
- `public` = accessible from anywhere
- Getters/setters let you control *how* data is read or changed (e.g. reject invalid values)

**Object equality — `equals()` vs `==`**
```java
Person p1 = new Person("Ada", 28);
Person p2 = new Person("Ada", 28);

p1 == p2;       // false — different objects in memory, even with same data
p1.equals(p2);  // false by default, unless you override equals() yourself
```

**`toString()` — controlling how an object prints**
```java
public class Person {
    private String name;
    private int age;

    // ... constructor, getters ...

    @Override
    public String toString() {
        return name + ", age " + age;
    }
}
```
```java
Person ada = new Person("Ada", 28);
System.out.println(ada);        // calls toString() automatically → "Ada, age 28"
```
- Without overriding `toString()`, `System.out.println(ada)` prints something like `Person@1b6d3586` (memory address) — ugly and useless.
- `@Override` — tells Java (and reminds you) this method is replacing one built into every object.

**Multiple constructors (overloading) — different ways to create an object**
```java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // second constructor — age defaults to 0 if not given
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }
}
```
```java
Person ada = new Person("Ada", 28);
Person unknown = new Person("Unknown");  // uses the second constructor
```

**Objects calling other objects' methods (objects interacting)**
```java
public class Person {
    private String name;
    private int age;

    public boolean isOlderThan(Person other) {
        return this.age > other.age;
    }
}
```
```java
Person ada = new Person("Ada", 28);
Person alan = new Person("Alan", 24);

ada.isOlderThan(alan);  // true — one object's method comparing itself to another object
```
- This trips people up at first: `other.age` works even though `age` is `private`, because you're *inside the Person class itself* — privacy blocks access from *outside* the class, not between two objects of the same class.

## 2. Objects in a List

**Storing custom objects in an ArrayList**
```java
ArrayList<Person> people = new ArrayList<>();
people.add(new Person("Ada", 28));
people.add(new Person("Alan", 24));

for (Person person : people) {
    person.printPerson();
}
```

**Searching/filtering objects in a list**
```java
for (Person person : people) {
    if (person.getAge() > 25) {
        System.out.println(person.getName() + " is over 25");
    }
}
```

**Objects calling methods that return values, used in calculations**
```java
int totalAge = 0;
for (Person person : people) {
    totalAge += person.getAge();
}
double averageAge = (double) totalAge / people.size();
```

## 3. Reading and Writing Data (Files)

**Reading a file line by line**
```java
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

try {
    File file = new File("data.txt");
    Scanner reader = new Scanner(file);

    while (reader.hasNextLine()) {
        String line = reader.nextLine();
        System.out.println(line);
    }
} catch (FileNotFoundException e) {
    System.out.println("File not found: " + e.getMessage());
}
```
- File-reading code **must** be wrapped in `try/catch` — Java forces you to handle the possibility the file doesn't exist (`FileNotFoundException`)
- `hasNextLine()` — checks if there's another line before reading it (avoids crashing at the end of the file)

**Writing data to a file**
```java
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

try {
    File file = new File("output.txt");
    FileWriter writer = new FileWriter(file);
    writer.write("Hello, file!\n");
    writer.close();  // always close the writer, or the data may not actually save
} catch (IOException e) {
    System.out.println("Something went wrong: " + e.getMessage());
}
```

**Turning file lines into objects (combines everything above)**
```java
// example: each line is "name,age"
File file = new File("people.txt");
Scanner reader = new Scanner(file);
ArrayList<Person> people = new ArrayList<>();

while (reader.hasNextLine()) {
    String line = reader.nextLine();
    String[] parts = line.split(",");
    String name = parts[0];
    int age = Integer.valueOf(parts[1]);
    people.add(new Person(name, age));
}
```

---
**Core takeaway:** classes bundle related data + behavior into one reusable blueprint; objects are individual instances of that blueprint, each with their own copy of the data; `toString()` and constructor overloading give you control over how objects are created and displayed; objects can interact with other objects of the same class (privacy is per-class, not per-object); lists of objects let you manage collections of "things" instead of raw values; and file reading/writing lets your program persist data beyond a single run — often by turning each line of a file directly into an object.
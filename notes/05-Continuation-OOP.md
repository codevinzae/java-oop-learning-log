# Java Programming I — Part 05 Notes
*University of Helsinki MOOC*

**Theme:** Deepening OOP — cutting repetitive code with overloading, and understanding how Java actually stores objects in memory (a big mental-model shift).

## The Big Idea of Part 05
Part 04 taught you *how* to build objects. Part 05 teaches you two things that matter for writing them *well*:
1. **Overloading** — letting one method/constructor name work in multiple ways, instead of copy-pasting near-identical code.
2. **Primitive vs. reference variables** — the single most important "aha" of this part. Numbers/booleans are copied by value; objects are copied by *reference* (a pointer to the same object in memory). This explains bugs that otherwise seem impossible — like changing one variable and *another* variable mysteriously changing too.

## 1. Learning Object-Oriented Programming (continued)

**Objects as method parameters (passing an object into another object's method)**
```java
public class Person {
    private String name;
    private int age;

    public boolean isOlderThan(Person other) {
        return this.age > other.age;
    }

    public boolean isSameAge(Person other) {
        return this.age == other.age;
    }
}
```
- This builds directly on Part 04 — comparing two objects of the same class from *inside* the class itself.

## 2. Removing Repetitive Code — Overloading

**Overloaded constructors — same class, different ways to build it**
```java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // overloaded constructor — reuses the one above instead of repeating logic
    public Person(String name) {
        this(name, 0);   // "this(...)" calls the other constructor
    }
}
```
- `this(...)` **must be the first line** in the constructor if used.
- Avoids copy-pasting the same assignment logic in every constructor variant.

**Overloaded methods — same method name, different parameters**
```java
public int add(int a, int b) {
    return a + b;
}

public double add(double a, double b) {
    return a + b;
}

public int add(int a, int b, int c) {
    return a + b + c;
}
```
- Java picks the right version automatically based on the **number and type of arguments** you pass.
- The methods must differ in parameter list (type or count) — not just the return type.

** Overload resolution — what Java does when there's no exact match**
```java
public void show(double value) {
    System.out.println("double: " + value);
}

show(5);  // you passed an int, but there's no show(int) overload
          // Java auto-widens int → double, so this calls show(double)
          // prints: "double: 5.0"
```
- If there's an exact type match, Java always uses that one first.
- If not, Java tries to **widen** the primitive (`int → long → float → double`) to find a fit.
- If multiple overloads could match after widening, or none can, you get a compile error — not a crash, so this is usually caught early.

## 3. Primitive and Reference Variables

**Primitive types — copied by value**
```java
int a = 5;
int b = a;   // b gets a COPY of a's value
b = 10;

System.out.println(a);  // 5 — unaffected, a and b are independent
System.out.println(b);  // 10
```
- Primitives: `int`, `double`, `boolean`, `char`, `long`, etc. — the variable directly holds the value.

**Reference types — copied by reference (this is the big shift)**
```java
Person p1 = new Person("Ada", 28);
Person p2 = p1;   // p2 points to the SAME object as p1, not a copy!

p2.setAge(99);

System.out.println(p1.getAge());  // 99 — p1 "changed" too!
System.out.println(p2.getAge());  // 99
```
- `p1` and `p2` are two variable names pointing to **one single object** in memory.
- Changing the object through either variable name affects what both variables "see."
- Objects, arrays, and `ArrayList`s are all reference types — this applies to all of them.

** The classic gotcha — this catches almost everyone once**
```java
ArrayList<Integer> listA = new ArrayList<>();
listA.add(1);
listA.add(2);

ArrayList<Integer> listB = listA;   // NOT a copy — same list!
listB.add(3);

System.out.println(listA);  // [1, 2, 3] — listA changed too!
```
**How to actually copy a list/object instead of just referencing it:**
```java
ArrayList<Integer> listB = new ArrayList<>(listA);  // creates a real, independent copy
```

**Copying an object — same idea, but you have to write it yourself**
```java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // "copy constructor" — builds a brand-new, independent object from an existing one
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
}
```
```java
Person p1 = new Person("Ada", 28);
Person p2 = new Person(p1);   // real copy, NOT a reference to p1

p2.setAge(99);
System.out.println(p1.getAge());  // 28 — untouched, because p2 is a separate object
```
- Unlike `ArrayList`, Java doesn't give objects a built-in copy mechanism for free — you have to define it yourself, usually as an overloaded constructor like this.

## 4. Objects and References

**Passing objects into methods — the method receives a reference, not a copy**
```java
public static void birthday(Person person) {
    person.setAge(person.getAge() + 1);
}

Person ada = new Person("Ada", 28);
birthday(ada);
System.out.println(ada.getAge());  // 29 — the original object was modified!
```
- Unlike passing an `int` (which sends a copy, so changes inside the method don't affect the original), passing an object sends a reference — the method can permanently change the actual object.

**Comparing references vs. comparing content**
```java
Person p1 = new Person("Ada", 28);
Person p2 = new Person("Ada", 28);
Person p3 = p1;

p1 == p2;   // false — two different objects, even with identical data
p1 == p3;   // true — same object, just two names for it
p1.equals(p2);  // depends on whether equals() was overridden (see Part 04 notes)
```

**`null` — a reference pointing to nothing**
```java
Person person = null;   // valid for reference types, NOT for primitives (int x = null; is illegal)

if (person == null) {
    System.out.println("No person assigned yet.");
}

person.getName();  //  NullPointerException — can't call a method on nothing
```

**The `final` keyword — locking a variable after it's set**
```java
final int MAX_AGE = 150;
MAX_AGE = 200;  //  compile error — can't reassign a final variable
```
** Gotcha — `final` on a reference only locks the reference, not the object's contents**
```java
final Person person = new Person("Ada", 28);
person = new Person("Alan", 24);  //  compile error — can't point "person" to a different object

person.setAge(99);  //  totally fine — still the SAME object, just its internal data changed
```
- `final` prevents reassigning the *variable itself* to a different object — it does **not** freeze the object's data.

## 5. Conclusion
- Review/self-check of Part 05 concepts — no new material.

---
**Core takeaway:** overloading lets you offer flexible ways to build objects or call methods without duplicating logic. But the real turning point of this part is realizing objects, arrays, and lists are **shared by reference** — assigning one variable to another doesn't clone it, it just gives the same object a second name. When you actually need an independent copy, you have to create one explicitly.
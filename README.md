# Java OOP Learning Log — University of Helsinki MOOC

Personal learning journal documenting my progress through the **University of Helsinki's Java Programming MOOC (Object-Oriented Programming with Java)**, built to reinforce my school's OOP subject.

> **Goal:** Build a genuinely solid foundation in Object-Oriented Programming — not just pass the course, but be able to *design* with classes, not just write syntax.

---

## Progress Tracker

| Part | Topic                                   | Status | Notes |
|------|------------------------------------------|--------|-------|
| 1    | Intro to programming, variables, tools   | ✅    Done     | |
| 2    | Loops & repetition                       | ✅    Done     | |
| 3    | Lists, arrays, strings                   | ✅    Done     | |
| 4    | **Objects & classes (intro to OOP)**     | 🟨 In Progress | |
| 5    | **Object-oriented programming continues**| ⬜ Not started | |
| 6    | **References, object comparison**        | ⬜ Not started | |
| 7    | **Inheritance**                          | ⬜ Not started | |
| 8    | **Interfaces**                           | ⬜ Not started | |
| 9    | Collections (ArrayList, HashMap, etc.)   | ⬜ Not started | |
| 10   | **Abstract classes, static, packages**   | ⬜ Not started | |
| 11   | Advanced collections & recursion         | ⬜ Not started | |
| 12   | GUI basics (optional, low priority)      | ⬜ Not started | |
| 13   | File handling                            | ⬜ Not started | |
| 14   | Final project                            | ⬜ Not started | |

**Legend:** ⬜ Not started · 🟨 In progress · ✅ Done · 🔁 Needs review

> Bolded rows are the parts most directly tested in my school's OOP subject — prioritize these if time is short.

---

## Repo Structure

```
java-oop-log/
├── README.md                 <- you are here
├── notes/
│   ├── 04-classes-objects.md
│   ├── 05-oop-continued.md
│   ├── 06-references.md
│   ├── 07-inheritance.md
│   ├── 08-interfaces.md
│   └── 10-abstract-static.md
├── tmcdata/                  <- exercises
│   ├── part04/
│   ├── part05/
│   └── ...
└── mini-projects/
    ├── library-system/
    └── bank-account-sim/
```

- **notes/** — one markdown file per part, summarizing concepts in my own words
- **exercises/tmcdata/** — my actual solved MOOC exercises, kept for reference (not for copying — solve first, save after)
- **mini-projects/** — small self-directed builds that combine several concepts (see [Concept → Project Map](#-concept--project-map))

---

## Concept → Project Map

Mapping each core OOP concept to a small project idea, so I'm applying — not just reading.

| Concept                     | Practice Project Idea                         |
|------------------------------|------------------------------------------------|
| Classes, objects, constructors | Simple `Student` class with grades          |
| Encapsulation (getters/setters)| `BankAccount` with private balance          |
| Inheritance                  | `Animal → Dog/Cat` or `Employee → Manager`    |
| Polymorphism                 | `Shape` array calling `.area()` per subclass  |
| Interfaces                   | `Payable` interface across unrelated classes  |
| Abstract classes             | Abstract `Shape`, forcing subclasses to implement `area()` |
| Collections + OOP combined   | To-do list app using `ArrayList<Task>`        |

---

## Weekly Reflection Log

Short, honest notes — what clicked, what didn't, what to revisit.

### Week 1
- **Covered:** Part 01, Part 02, Part 03 (halfway through)
- **Understood well:** Part 01 & Part 02 basics — variables, loops, methods
- **Still confusing:** Lists and Arrays — specifically the loops and methods used with them
- **Next step:** Continue Part 03, currently on Exercise 20

### Week 2 – [date]
- **Covered:** Finished Part 03, Part 04 (halfway through)
- **Understood well:** Creating classes, instantiating objects in main (`Statistics stats = new Statistics()`), and calling instance methods (`void`, `int`, `String`)
- **Still confusing:** Arrays (fixed sizes, index bounds, array loops) and OOP internals (constructors, encapsulation, setters/getters, parameter passing)
- **Next step:** Complete Part 04, focus on strengthening constructors and encapsulation

---

## Key Terms I Keep Forgetting

A running glossary — add to this the moment something confuses you twice.

| Term | My own explanation |
|------|----------------------|
| `toString()` |A method that returns a text representation of an object instead of printing directly to the console. |
| `@Override` | An annotation that tells the compiler a method is deliberately replacing a method from a parent class.|
|  | |
|  | |

---

## Resources

- [Java Programming MOOC — official site](https://java-programming.mooc.fi/)
- [My own Java OOP Cheat Sheet](#) — link your Java_Cheat_Sheet.docx here once uploaded to the repo

---

## How I'm Using This Repo

1. Study a MOOC part
2. Summarize it in my own words in `notes/`
3. Solve the exercises in `exercises/tmcdaata/`
4. Once a concept feels shaky, build a tiny project for it in `mini-projects/`
5. Update the Progress Tracker + Reflection Log
6. Commit with a clear message, e.g. `git commit -m "Complete Part 7: Inheritance notes + exercises"`

---

*This log is a living document — updated as I go, not written once and forgotten.*

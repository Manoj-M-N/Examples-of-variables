| **Aspect**            | **Instance Variable**                                        | **Local Variable**                            | **Static Variable**                                          |
| --------------------- | ------------------------------------------------------------ | --------------------------------------------- | ------------------------------------------------------------ |
| **Declared inside**   | Inside a class, **outside methods**, constructors, or blocks | Inside a **method**, constructor, or block    | Inside a class, **outside methods**, using `static` keyword  |
| **Memory location**   | Stored in **heap memory**, part of object                    | Stored in **stack memory**                    | Stored in **method area (class memory)**                     |
| **Associated with**   | **Each object** of the class                                 | Exists **only during method execution**       | **Class itself**, not object                                 |
| **Default value**     | Yes (e.g., `0`, `null`, `false` based on type)               | No (must be initialized before use)           | Yes (e.g., `0`, `null`, `false` based on type)               |
| **Accessed using**    | `objectName.variableName`                                    | Directly within the method only               | `ClassName.variableName` or directly (if in same class)      |
| **Life span**         | Exists as long as the object exists                          | Exists **only while the method is executing** | Exists for the **entire duration of program (class loaded)** |
| **Re-initialization** | Not reinitialized unless done explicitly                     | Reinitialized **each time method is called**  | Initialized once and shared across all instances             |
| **Keyword used**      | No specific keyword                                          | No specific keyword                           | `static` keyword                                             |
| **Example**           | `String collegeName;`                                        | `int count = 0;` inside a method              | `static int totalColleges;`                                  |

package Excecptions_InterviewQuestion;

import java.util.ArrayList;
import java.util.List;

public class CuncurrentExceptions {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for (String name : names) {
            if (name.equals("Charlie")) {
                names.remove(name); // you said this didn't throw exception
            }
        }

        System.out.println(names);

        /*
        It’s a runtime exception in Java
        Java collections (like ArrayList, HashMap, etc.) use a modCount to track changes.
        iterator that detects any structural changes made to the collection after the iterator is created.
        When it detects such a change, it immediately throws ConcurrentModificationException.
        This only happens for structural modifications: add(), remove(), clear() etc.
        Reading from the collection doesn’t cause it.
        The exception only gets thrown when iterator.next() is called after the modification.

        What is modCount?  variable or attribute inside collection classes like ArrayList, HashMap, etc.
         Tracks the number of times the structure of the collection has been modified.
         The Java Collections Framework uses fail-fast iterators, which are designed
         to quickly fail if something goes wrong, like:
         If you modify a collection while iterating through it.

1. A collection has a modCount field.
2. Every time you modify the list’s structure → modCount++
3. When you call next() or hasNext():
          if (modCount != expectedModCount)
             throw new ConcurrentModificationException();

=====================================================================
SOLUTION  to Avoid ConcurrentModificationException
Use Iterator.remove()
Use Java 8+ removeIf() : names.removeIf(name -> name.equals("Bob"));
Use a traditional for-loop (backward preferred)

CopyOnWriteArrayList:

List<String> names = new CopyOnWriteArrayList<>();
names.add("Alice");
names.add("Bob");
names.add("Charlie");

for (String name : names) {
    if (name.equals("Bob")) {
        names.remove(name); // ✅ no ConcurrentModificationException
    }
}


*/
    }
}

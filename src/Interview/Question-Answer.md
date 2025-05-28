## What is the difference between String, StringBuffer, and StringBuilder?
Ans:- A String in Java is a class, a non-primitive data type, and it is immutable, meaning once a String object is created,
      value cannot be changed. On the other hand, StringBuffer and StringBuilder are mutable classes, which means their 
      content can be modified after creation. StringBuffer is thread-safe, and StringBuilder is not thread-safe.

## Can you explain the internal working of String and String constant pool?
Ans:- A String in Java is a class, a non-primitive data type, and it is immutable, meaning once a String object is created,
      value cannot be changed. Internally, String objects are managed using a concept called the String Constant Pool.
      This is a special area in the Java heap memory where string literals are stored.

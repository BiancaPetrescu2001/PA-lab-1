# Advanced Programming - Laboratory 1

```text
Compulsory (1p)
Write a Java application that implements the following operations:
Display on the screen the message "Hello World!". Run the application. If it works, go to step 2 :)
Define an array of strings languages, containing {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"}
Generate a random integer n: int n = (int) (Math.random() * 1_000_000);
Compute the result obtained after performing the following calculations:
  multiply n by 3;
  add the binary number 10101 to the result;
  add the hexadecimal number FF to the result;
  multiply the result by 6;
Compute the sum of the digits in the result obtained in the previous step. This is the new result. While the new result has more than one digit, continue to sum the digits of the result.
Display on the screen the message: "Willy-nilly, this semester I will learn " + languages[result].
```
## Solved tasks

As of today (Sunday, Feb. 21st), I have solved all tasks regarding the compulsory problem.


## Compiling and output
I used the Intellij terminal to run and compile my code, typing the following 2 commands:

```bash
javac App.java
java compulsory.App
```
The output is generated based on a random result.
At one particular run the terminal showed the following output:
```bash
Hello world!
608273
8
Willy-nilly, this semester I will learn Swift

```
The first line of the output is the initial message to be printed.

The second line represents the random number after it was modified according to the task. 

The third line is the sum of the number's digits.

The fourth line is the final message.
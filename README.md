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
```text
Optional (2p)

Let n be an integer given as a command line argument. Validate the argument!
Create a n x n matrix, representing the adjacency matrix of a random graph .
Display on the screen the generated matrix (you might want to use the geometric shapes from the Unicode chart to create a "pretty" representation of the matrix).
Verify if the generated graph is connected and display the connected components (if it is not).
Assuming that the generated graph is connected, implement an algorithm that creates a partial tree of the graph. Display the adjacency matrix of the tree.
For larger n display the running time of the application in nanoseconds (DO NOT display the matrices). Try n > 30_000. You might want to adjust the JVM Heap Space using the VM options -Xms4G -Xmx4G.
Launch the application from the command line, for example: java Lab1 100.
```
## Solved tasks

As of today (Sunday, Feb. 21st), I have solved all tasks regarding the compulsory problem.

UPDATE: on Feb. 26th I have solved a small part from the optional problem: creating the random matrix, validating the input and writing a function to find out of the random graph is connected or not.


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

For the optional problem I have used the following commands:

```bash
javac Graph.java
java optional.Graph 6
```

The output for n=6 as an input is:
```bash
0 0 0 0 0 0
0 0 1 0 0 1
0 1 0 0 0 0
0 0 0 0 0 1
0 0 0 0 0 1
0 1 0 1 1 0
The graph is not connected
```
Another possible output for n=6 is:
```bash
0 0 0 0 0 1
0 0 1 0 1 1
0 1 0 1 0 0
0 0 1 0 1 0
0 1 0 1 0 0
1 1 0 0 0 0
The graph is connected
```
If there is no input, the app will print the following message:
```bash
-1
Argument needed
```
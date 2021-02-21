package compulsory;

public class App {
    public static void PrintMessage()
    {
        System.out.println("Hello world!");
    }
    public static String[] DefineArray()
    {
        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        return languages;
    }
    public static int GenerateInt()
    {
        int n = (int) (Math.random() * 1_000_000);
        return n;
    }
    public static void Modify(int n)
    {
        n=n*3;
        String binaryStr="10101";
        n=n+Integer.parseInt(binaryStr,2); //adds the binary number
        String hexdecStr="FF";
        n=n+Integer.parseInt(hexdecStr, 16); //adds the hexadecimal number
        n=n*6;
    }
    public static int AddDigits(int n) //the desired result can be obtained by finding the reminder of n's division by 9
    {
        if (n==0)
            return 0;
        else if(n%9==0)
            return 9;
        else return (n%9);
    }
    public static void main(String args[])
    {
        int n; //the random number
        int i; //index in the array; also digits' sum
        String[] languages={};
        PrintMessage(); //prints "Hello world"
        languages=DefineArray(); //initializes the array
        n=GenerateInt(); //gets the random number
        Modify(n); //modifies the number
        System.out.println(n); //prints the number
        i=AddDigits(n); //finds the sum of the number's digits
        System.out.println(i); // prints the sum
        System.out.printf("Willy-nilly, this semester I will learn %s", languages[i]); //prints the final message
    }
}

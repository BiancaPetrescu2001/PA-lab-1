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
        n=n+Integer.parseInt(binaryStr,2);
        String hexdecStr="FF";
        n=n+Integer.parseInt(hexdecStr, 16);
        n=n*6;
    }
    public static int AddDigits(int n)
    {
        if (n==0)
            return 0;
        else if(n%9==0)
            return 9;
        else return (n%9);
    }
    public static void main(String args[])
    {
        int n;
        int i;
        String[] languages={};
        PrintMessage();
        languages=DefineArray();
        n=GenerateInt();
        Modify(n);
        System.out.println(n);
        i=AddDigits(n);
        System.out.println(i);
        System.out.printf("Willy-nilly, this semester I will learn %s", languages[i]);
    }
}

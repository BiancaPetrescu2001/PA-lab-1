package compulsory;

public class App {
    public static void PrintMessage()
    {
        System.out.println("Hello world!");
    }
    public static void DefineArray()
    {
        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
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
    public static void main(String args[])
    {
        int n;
        PrintMessage();
        DefineArray();
        n=GenerateInt();
        Modify(n);
        System.out.println(n);
    }
}

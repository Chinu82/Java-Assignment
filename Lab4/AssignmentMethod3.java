package Lab4;

class Demo
{
    int show()
    {
        System.out.println("I am in show() method ");
        return 18;
    }
    double display()
    {
        System.out.println("I am in display() method ");
        return 1.8;
    }
    String study()
    {
        System.out.println("I am in study() method ");
        return "cinshu";
    }
    public static void main(String[] args) {
        Demo de = new Demo();
        int sh = de.show();
        double di = de.display();
        String st = de.study();
        System.out.println("show() returns = "+sh);
        System.out.println("display() returns = "+di);
        System.out.println("study() returns = "+st);
    }
}
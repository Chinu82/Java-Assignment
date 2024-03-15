package Lab4;

class Study{}
class Write{}
class Author{}
//Main class
class Sagar {
    Study book()
    {
        System.out.println("I am in book() method : ");
        Study st = new Study();
        return st;
    }
    Write pen()
    {
        System.out.println("I am in pen() method : ");
        Write wr = new Write();
        return wr;
    }
    Author author()
    {
        System.out.println("I am in author() method : ");
        return new Author();
    }
    Sagar m1()
    {
        System.out.println("I am in m1() method : ");
        return this;            //Returns current class object and it is non static in nature
    }
    public static void main(String[] args) {
        Sagar obj = new Sagar();
        Study p2 = obj.book();
        Write p3 = obj.pen();
        Author p4 = obj.author();
        Sagar p5 = obj.m1();
        System.out.println("book() returns value = "+p2);
        System.out.println("pen() returns value = "+p3);
        System.out.println("author() returns value = "+p4);
        System.out.println("m1() returns value = "+p5);
    }
}

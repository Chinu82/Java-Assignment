package Lab4;

class Netra{}
class Chandra{}
class Student{}
class Course{}
class Java{}
class Python{}
class C{}
class Oracle{}
class Lit{
    void faculty (Netra nanda, Chandra sir, Student s)
    {
        System.out.println("I am in faculty() ");
    }
    void student (Course c, Java j)
    {
        System.out.println("I am in student() ");
    }
    void result(Python p, C c, Oracle o)
    {
        System.out.println("I am in result() ");
    }
    public static void main(String[] args) {
        //All object creation
        Lit li = new Lit();
        Netra ne = new Netra();
        Java ja = new Java();
        C c = new C();
        Student st = new Student();
        //Invoke all method present in Lit class
        li.faculty(ne, new Chandra(), st);
        li.student(new Course(), ja);
        li.result(new Python(), c, new Oracle());
    }
}

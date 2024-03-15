class X{}
class Y{}
class C{}
class Cycle{}
class College{}
class Course{}
class Python{}
class Java{}
class Pupil{}
class Chandra{}
class Teacher{}
class Faculty {}
class Mona{}
class Aman{}
class Rati{}
class Student {
    College study(String sname,X x,Y y,Cycle c)
    {
        System.out.println("sname = "+sname);
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("c = "+c);
        College col = new College();
        return col;
    }   
    Course getKnowledge(C c, Java simple,Python p)
    {
        System.out.println("c = "+c);
        System.out.println("simple = "+simple);
        System.out.println("p = "+p);
        Course co = new Course();
        return co;
    }
    Teacher courseDetails(College lit,Faculty f,Pupil p)
    {
        System.out.println("lit = "+lit);
        System.out.println("f = "+f);
        System.out.println("p = "+p);
        return new Teacher();
    }
    Rati getDetails(Chandra sir,Mona chasma, Aman student)
    {
        System.out.println("sir = "+sir);
        System.out.println("chasma = "+chasma);
        System.out.println("student = "+student);
        return new Rati();
    }
    public static void main(String[] args) {
        System.out.println("Loading ... ");
        //Object creation 
        Student obj = new Student();    //main object
        X x = new X();
        Y y = new Y();
        Cycle cy =new Cycle();
        C c = new C();
        Java simple = new Java();
        Python py = new Python();
        College lit = new College();
        Faculty fa = new Faculty();
        Pupil pu = new Pupil();
        Chandra sir = new Chandra();
        Mona chasma = new Mona();
        Aman student = new Aman();
        //Print 
        College co = obj.study("Moye Moye", x, y, cy);
        Course cou = obj.getKnowledge(c, simple, py);
        Teacher te = obj.courseDetails(lit, fa, pu);
        Rati ra = obj.getDetails(sir, chasma, student);
        System.out.println("co ="+co);
        System.out.println("cou ="+cou);
        System.out.println("te ="+te);
        System.out.println("ra ="+ra);
        System.out.println("all are completed ... ");
    }
}

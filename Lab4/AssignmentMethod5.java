class Rani{}
class Raja{}
class Book{}
class Pen{}
class Study{}
class Bike{}
class Chasma{}
class Message{}
class Test{
    Rani m1(int a, Raja r){
        System.out.println("Rani() method ");
        System.out.println("a = "+a+"\nr = "+r);
        Rani rani = new Rani();
        return rani;
    }
    Study m2(String s,Book b,Pen p){
        System.out.println("m2() method : ");
        System.out.println("s = "+s+"\nb = "+b+"\np = "+p);
        Study study = new Study();
        return study;
    }
    Message m3(char c, Bike b, Chasma andha){
        System.out.println("m3() method : ");
        System.out.println("c = "+c+"\nb = "+b+"\nandha = "+andha);
        return new Message();       //Annonymous object
    }

        public static void main(String[] args) {
            System.out.println("Loading ... ");
            System.out.println("\nobject creation : ");
            //Main object
            Test obj = new Test();

            Raja king = new Raja();
            Book java = new Book();
            Pen elkos = new Pen();
            Bike honda = new Bike();

            //display
            obj.m1(10, king);
            obj.m2("Ram", java, elkos);
            obj.m3('C', honda, null);
    }
}
class Chasma {
    void andha(int a,char ch,double d)
    {
        System.out.println("andha() method ");
    }
    void moon(boolean b,float f)
    {
        System.out.println("moon() method ");
    }
    void star(byte b,short s)
    {
        System.out.println("star() method ");
    }
    public static void main(String[] args) {
        Chasma chas = new Chasma();
        chas.andha(-1, 'c',-0.65);
        chas.moon(true, 100.2f);
        chas.star((byte)3, (short)103);

    }
}

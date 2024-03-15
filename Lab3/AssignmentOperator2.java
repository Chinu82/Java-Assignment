class LadderIf {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);
        int l;
        System.out.println("Your numbers are : "+n1+" "+n2+" "+n3);
        System.out.println("Loading maximum number ...");
        if (n1>=n2 && n1>=n3) {
            l = n1;
        }
        else if(n3 >= n1 && n3 >= n2)
        {
            l=n3;
        } 
        else {
            l = n2;
        }
        System.out.println("Largest number is = "+l);
    }
}

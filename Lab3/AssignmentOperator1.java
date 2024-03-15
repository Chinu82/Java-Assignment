class MaxNestedIf
{
    public static void main(String[] x) {
        int n1 = Integer.parseInt(x[0]);
        int n2 = Integer.parseInt(x[1]);
        int n3 = Integer.parseInt(x[2]);
        int l;
        System.out.println("Your numbers are : "+n1+" "+n2+" "+n3);
        System.out.println("Loading maximum number ...");
        if (n1 >= n2) {
            if (n1>=n3) {
                l=n1;
            } else {
                l=n3;
            }
        } else {
            if (n2>=n3) {
                l=n2;
            } else {
                l=n3;
            }
        }
        System.out.println("Largest number = "+l);
    }
}
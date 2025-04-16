public class swap {
static void swapping(int a ,int b){
    System.out.println("original Values: \n a:"+a+"  "+"b:"+b);
    System.out.println("After Swapping Values: ");
    int temp=a;
    a=b;
    b=temp;
    System.out.println("a: "+a+"     "+"b:"+b);
}
static void usingsum(int a,int b){
    System.out.println("original Values: \n a:"+a+"  "+"b:"+b);
    System.out.println("After Swapping Values: ");
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("a: "+a+"     "+"b:"+b);

}
    public static void main(String[] args) {
        int a=9;
        int b=3;
        swapping(a,b);
        usingsum(a,b);
    }
}

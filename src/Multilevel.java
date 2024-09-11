import java.util.Scanner;
class A
{
    int a;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number ;");
        a=sc.nextInt();

    }
}
class B extends A{
    int b;
    void dedo()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Second Number");
      b=sc.nextInt();
    }
}

class C extends B {
    void add() {
        System.out.println("Sum is" + (a + b));
    }
}

class Multilevel
{
    public static void main(String args[]){
        C aa= new C();
        aa.input();
        aa.dedo();
        aa.add();
    }

}
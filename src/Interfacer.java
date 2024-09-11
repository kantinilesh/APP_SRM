interface area
{
    final static float pie=3.14F;
    float calculate(float x,float y);
}
class rectangle implements area
{
    public float calculate(float x,float y)
    {
        return x*y;
    }
}
class circle implements area
{
    public float calculate(float x,float y)
    {
        return pie*x*x;
    }
}

class Interfacer
{
    public static void main(String args[])
    {
        rectangle rec=new rectangle();
        circle cir=new circle();
        area a;
        a = rec;
        System.out.println("Area " + a.calculate(10,20));
        a =cir;
        System.out.println("Area "+ a.calculate(10,20));

    }
}
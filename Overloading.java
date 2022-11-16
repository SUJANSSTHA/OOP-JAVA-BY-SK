public class Overloading {
    public int sum(int x, int y)
    {
        return x+y;
    }
    public int sum(int x, int y, int z)
    {
        return x+y+z;
    }
    public double sum(double x, double y)
    {
        return x+y;
    }
    public static void main(String args[])
    {
        Overloading a = new Overloading();
        System.out.println(a.sum(12,11));
        System.out.println(a.sum(12,11,11));
        System.out.println(a.sum(12,11,22));
    }
}

class Employee implements Cloneable
{
    int id =122;
    String str ="Nature";
    float marks =100;
    public Object clone() throws CloneNotSupportedException
    {
        Object o = super.clone();
        return o;
    }
}
public class CloneEx
{
    public static void main(String[] args)throws CloneNotSupportedException
    {
        Employee e1=new Employee();
        Object o= e1.clone();
        Employee e2 = (Employee)o;
        System.out.println(e1==e2);
        System.out.println(e1.id +"__"+e1.str+"----"+e1.marks);
        System.out.println(e2.id +"__"+e2.str+"----"+e2.marks);
    }
}
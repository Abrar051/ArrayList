package generic;

public class ObjectType1 <T1>{
    T1 value;

    public T1 getValue() {
        return value;
    }

    public void setValue(T1 value) {
        this.value = value;
    }
    public String converter ()
    {
        String type = info();
        String toString = null;
        if (type.equals("java.lang.Integer"))
        {
            System.out.println("Integer type");
            toString = this.value.toString();
        }
        else if (type.equals("java.lang.String"))
        {
            System.out.println("String type");
            toString = (String) this.value;
        }
        else if (type.equals("java.lang.Char"))
        {
            System.out.println("Character type");
            toString = this.value.toString();
        }
        return toString;
    }
    public String info ()
    {
        String type=value.getClass().getName() ;
        return type;
    }
}

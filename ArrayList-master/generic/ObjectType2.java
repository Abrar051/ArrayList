package generic;

public class ObjectType2 <T2>{
    T2 value;

    public T2 getValue() {
        return value;
    }

    public void setValue(T2 value) {
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

package somepackage;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Refl {


    private String someField;
    private Long someLongField;

    private void printSomething() {
        System.out.println("Something");
    }

    public static void main(String[] args)
            throws InvocationTargetException, IllegalAccessException, ClassNotFoundException, InstantiationException,
            NoSuchMethodException {
        Refl object = new Refl();

        Class<?> object2 = Class.forName("somepackage.Refl");
        Method someMethod = object2.getMethod("someMethod");
        someMethod.setAccessible(true);
        Refl o = (Refl) object2.newInstance();
        o.someField = "Asd";
        System.out.println(o.someField);

    }

}

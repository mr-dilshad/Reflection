package implementation;

import test.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionImplementation {

    public static void main(String ...args) throws Exception {
        Test testObj = new Test("TEST");

        Class testClass = testObj.getClass();
        System.out.println("Test class : "+testClass);

        Method[] meathods = testClass.getMethods();

        for(Method meathod : meathods){
            System.out.println("Meathod : "+meathod.getName());
        }

        Method publicMethod1= testClass.getDeclaredMethod("meathod1");

        publicMethod1.invoke(testObj);

        Method privateMethod2= testClass.getDeclaredMethod("meathod2");

        privateMethod2.setAccessible(true);

        privateMethod2.invoke(testObj);

        Method publicMethod3= testClass.getDeclaredMethod("meathod3", int.class);

        publicMethod3.invoke(testObj, 2);

        Field privateFeild = testClass.getDeclaredField("name");

        privateFeild.setAccessible(true);

        System.out.println(privateFeild.get(testObj).toString());

        privateFeild.set(testObj, "DIL");

        System.out.println(privateFeild.get(testObj).toString());
    }




}

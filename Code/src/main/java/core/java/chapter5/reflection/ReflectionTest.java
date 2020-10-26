package core.java.chapter5.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * This program uses reflection to print all features of a class
 *
 * @author: huakaimay
 * @since: 2020-10-26
 */
public class ReflectionTest {
    public static void main(String[] args) {
        String name;
        // read class name from command line args or user input
        if (args.length > 0) {
            name = args[0];
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter class name (e.g. java.util.Date): ");
            name = scanner.next();
        }
        try {
            // print class name and superclass name (if != object)
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
                System.out.print("class " + name);
            }
            if (supercl != null && supercl != Object.class) {
                System.out.print(" extends " + supercl.getName());
            }
            System.out.print("\n{\n");
            printConstructors(cl);
            System.out.println();
            printMethods(cl);
            System.out.println();
            printFileds(cl);
            System.out.println("}");

        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        }
        System.exit(0);
    }

    /**
     * prints all fields of a class
     *
     * @param cl
     */
    private static void printFileds(Class cl) {
        Field[] declaredFields = cl.getDeclaredFields();
        for (Field f : declaredFields) {
            Class type = f.getType();
            String name = f.getName();
            System.out.print("   ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
                System.out.println(type.getName() + " " + name + ";");
            }
        }
    }


    /**
     * prints all methods of a class
     *
     * @param cl
     */
    private static void printMethods(Class cl) {
        Method[] declaredMethods = cl.getDeclaredMethods();
        for (Method m : declaredMethods) {
            Class returnType = m.getReturnType();
            String name = m.getName();
            System.out.print("   ");
            // print modifiers, return type and method name
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
                System.out.print(returnType.getName() + " " + name + "(");
            }

            // print parameter types
            Class[] parameterTypes = m.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(parameterTypes[i].getName());

            }
            System.out.println(");");


        }
    }

    /**
     * prints all construcotrs of a class
     * @param cl
     */
    private static void printConstructors(Class cl) {
        Constructor[] declaredConstructors = cl.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            String name = declaredConstructor.getName();
            System.out.print("   ");
            String modifiers = Modifier.toString(declaredConstructor.getModifiers());
            if(modifiers.length() > 0) {
                System.out.print(modifiers + " ");
                System.out.print(name + "(");
            }

            // print paraeter types
            Class[] parameterTypes = declaredConstructor.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++) {
                if(i > 0) {
                    System.out.print(", ");
                }
                System.out.print(parameterTypes[i].getName());
            }
            System.out.println(")");
        }
    }


}

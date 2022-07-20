package Day01;

public class Hello_World {
    static int globalVal = 3;
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.print("Hello ");
        System.out.println("Test");

        int intNumber = 4;
        long longNumber = 100L;
        System.out.println(intNumber);
        System.out.println(longNumber);

        float floatNumber = 10.3f;
        double doubleNumber = 5.3;
        System.out.println(floatNumber);
        System.out.println(doubleNumber);

        boolean booleanValue = true;
        System.out.println(booleanValue);

        int temp;
        temp = 15;
        System.out.println(temp);

        System.out.println(globalVal);

        // Ép kiểu ngầm định (implicit)
        byte byteNumber = 5;
        short shortNumber = byteNumber;
        System.out.println(shortNumber);

        // Ép kiểu tường minh (explicit)
        double doubleVal = 1.7;
        int intVal = (int)doubleVal;
        System.out.println(intVal);

        // Khai báo hằng số
        final float piNumber = 3.14f;
        System.out.println(piNumber);

        boolean result = (doubleVal == intVal);
        System.out.println(result);
        System.out.println(doubleVal > intVal);

        boolean andResult = (100 > 40) && (10 > 30) || (10 > 5);
        System.out.println(andResult);
    }
}
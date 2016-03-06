package gitsclinformala;

/**
 *
 * @author Andrei
 */
public class HomeworkStandardTypes {

    public static void main(String[] args) {

        byte byteTypeExample = 100;
        short shortTypeExample = 200;
        int intTypeExample = 3000;
        long longTypeExample = 11233;
        float floatTypeExample = 1.234F;
        double doubleTypeExample = 3.2341234;
        boolean booleanTypeExample = true;
        char charTypeExample = 'a';

        System.out.println(byteTypeExample);
        System.out.println(shortTypeExample);
        System.out.println(intTypeExample);
        System.out.println(longTypeExample);
        System.out.println(floatTypeExample);
        System.out.println(doubleTypeExample);
        System.out.println(booleanTypeExample);
        System.out.println(charTypeExample);

        byteTypeExample = -100;
        shortTypeExample = 0b0001;
        intTypeExample = 1_000;
        intTypeExample = 0b0011;
        intTypeExample = 0xD;
        longTypeExample = 0b0011_1100_1010_0010;
        longTypeExample = 0xAA_EE_FFL;
        floatTypeExample = 123e-1F;
        floatTypeExample = 1_231e-3F;
        doubleTypeExample = 1_223.2;
        doubleTypeExample = 1.231e6D;
        booleanTypeExample = false;
        charTypeExample = '\n';
        charTypeExample = '\uFFFF';

    }

}

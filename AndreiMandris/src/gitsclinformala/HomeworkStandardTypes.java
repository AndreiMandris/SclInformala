package gitsclinformala;

/**
 *
 * @author Andrei
 */
public class HomeworkStandardTypes {
/**
 *
 * @author Andrei
 * @param  args
 * main method creates variables having standard types, change their values and 
 * display them changed.
 */
    public static void main(String[] args) {

        byte byteTypeExample = 100;
        short shortTypeExample = 200;
        int intTypeExample = 3000;
        long longTypeExample = 11233;
        float floatTypeExample = 1.234F;
        double doubleTypeExample = 3.2341234;
        boolean booleanTypeExample = true;
        char charTypeExample = 'a';
        //I added this message to be easy to see initial values versus final values
        System.out.println("Initial values are:");
        System.out.println(byteTypeExample);
        System.out.println(shortTypeExample);
        System.out.println(intTypeExample);
        System.out.println(longTypeExample);
        System.out.println(floatTypeExample);
        System.out.println(doubleTypeExample);
        System.out.println(booleanTypeExample);
        System.out.println(charTypeExample);
        // here are warnings on all following lines because assigned values are
        // never used. I added for that another set of printing instructions
        //at the end.
        byteTypeExample = -100;
        shortTypeExample = 0b0001;
        intTypeExample = 1_000;
        System.out.println("Second updated value of int:"+intTypeExample);        
        intTypeExample = 0b0011;
        System.out.println("Third updated value of int:"+intTypeExample);
        intTypeExample = 0xD;
        longTypeExample = 0b0011_1100_1010_0010;
        System.out.println("First updated value of long:"+longTypeExample);
        longTypeExample = 0xAA_EE_FFL;
        floatTypeExample = 123e-1F;
        System.out.println("First updated value of float:"+floatTypeExample);
        floatTypeExample = 1_231e-3F;
        doubleTypeExample = 1_223.2;
        System.out.println("First updated value of double:"+doubleTypeExample);
        doubleTypeExample = 1.231e6D;
        booleanTypeExample = false;
        charTypeExample = '\n';
        System.out.println("First updated value of int:"+charTypeExample);        
        charTypeExample = '\uFFFF';
        // added new printing instructions to avoid warnings in previous attributions
        System.out.println("Final updated values are:");
        System.out.println(byteTypeExample);
        System.out.println(shortTypeExample);
        System.out.println(intTypeExample);
        System.out.println(longTypeExample);
        System.out.println(floatTypeExample);
        System.out.println(doubleTypeExample);
        System.out.println(booleanTypeExample);
        System.out.println(charTypeExample);
    }
}